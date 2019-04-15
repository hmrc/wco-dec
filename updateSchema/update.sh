#!/usr/bin/bash


# Delete previous schemas
rm -f *.xsd *.xsd.*

# Download the latest Shcema definitions
wget https://github.com/hmrc/customs-declarations/blob/master/public/api/conf/1.0/schemas/wco/declaration/DocumentMetaData_2_DMS.xsd
wget https://github.com/hmrc/customs-declarations/blob/master/public/api/conf/1.0/schemas/wco/declaration/WCO_DEC_2_DMS.xsd

# Generate the WCO-DEC model


