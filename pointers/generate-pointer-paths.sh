#!/bin/sh

# get the current working directory of the script
CURRENT_DIR=$(dirname "$0")

# create data folder where the pointers will be created
mkdir -p $CURRENT_DIR/data/temp

# get all the pointers paths
raw_pointers=$(cat $CURRENT_DIR/../src/main/resources/wco/declaration/WCO_DEC_2_DMS.xsd | egrep -v '(WCOName|WCODescription|TDEDUID|TDEDName|NamedComplexType|XMLTag|WCOUsageDeclarationIM|WCOUsageDeclarationEX|UniquePositionID|DictionaryEntryName|WCOCodeRemarks|WCOFormat|WCOUsageSafe|WCOUsageDeclarationCRI|xs:annotation|xs:documentation|WCOUsageDeclarationTRT|WCOUsageDeclarationCRE|WCOUsageDeclarationCONV|xs:sequence|xs:complexType)' | egrep '<|>' |  xq . | egrep -v '(@type|@minOccurs|@maxOccurs|@name|@WCOUsageUPU)' | tr -d ' \t\n\r' | sed 's/,"WCOUsageUPU":"X"//g' | jq . | tr -d ' ' | awk -F':' '{if ($1 == "\"WCOID\"") {print $2 ":" $1 }else print }' | tr -d ' \n\t' | sed 's/,:"WCOID""xs:element"//g' | sed 's/xs:element/42A/g' | jq -c '."xs:schema" | path(..)|[.[]|walk(if type == "number" then empty  else tostring end)]|join("/")' | sort | uniq | egrep -v "@|xs|WCOUsageUPU" | grep 42A | jq -r .)
echo $raw_pointers > $CURRENT_DIR/data/temp/raw_pointers

# Create temporary DMS data
# This will be used to get the DMS field names and descriptions
DMS_DATA=$(cat ./src/main/resources/wco/declaration/WCO_DEC_2_DMS.xsd | egrep -v '(WCOName|TDEDUID|TDEDName|NamedComplexType|XMLTag|WCOUsageDeclarationIM|WCOUsageDeclarationEX|UniquePositionID|DictionaryEntryName|WCOCodeRemarks|WCOFormat|WCOUsageSafe|WCOUsageDeclarationCRI|xs:annotation|xs:documentation|WCOUsageDeclarationTRT|WCOUsageDeclarationCRE|WCOUsageDeclarationCONV|xs:sequence|xs:complexType)' | egrep '<|>' |  xq . | egrep -v '(@type|@minOccurs|@maxOccurs|@WCOUsageUPU)' | jq '.. | ."xs:element"? // empty' | jq 'map({WCOID} + {"@name"} + {WCODescription})'| jq '.[]' | sed 's/\\t//g' | sed 's/\\n/ /g' | jq .)
echo $DMS_DATA > $CURRENT_DIR/data/temp/DMS_DATA.json

# populate JSON objects with DMS Field Names and Field Descriptions
for k in $raw_pointers; do
    dms_field_id=$(echo $k | awk -F'/' '{print $NF}')
    dms_field_name=$(echo $DMS_DATA | jq -r --arg id "$dms_field_id" 'select(.WCOID==$id)."@name"' | head -n1)
    dms_field_description=$(echo $DMS_DATA | jq -r --arg id "$dms_field_id" 'select(.WCOID==$id)."WCODescription"' | head -n1)
    echo "{ \"$k\": {\"dms_field_name\":\"$dms_field_name\", \"dms_field_description\":\"$dms_field_description\", \"field\":\"\", \"page\":\"\", \"description\":\"\"}}," >> $CURRENT_DIR/data/temp/body.json
done

# add missing json structure
head="{\"pointers\":["
body=$(cat $CURRENT_DIR/data/temp/body.json)
tail="]}"
pointers="$head$body$tail"

# remove trailing cmma
pointers=$(echo $pointers | sed 's/,\]}/\]}/g')

# return the result in a pretty JSON format
echo $pointers | jq . > $CURRENT_DIR/data/pointer_paths.json

# remove temporary files
rm -fr $CURRENT_DIR/data/temp
