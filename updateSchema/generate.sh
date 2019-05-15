#!/bin/bash

source ./functions.sh

###################################
####         MAIN CODE         ####
###################################

# read input
process_input "$@"

# Delete previous schemas
log "Delete previous generated schemas... ✔"
rm -rf customs-declarations/

# Download the latest Schema definitions
git_clone $GIT_TAG

#add declaration namespace to notifcation schema
log "Fix notification schema... ✔"
fix_notification_dec_namespace

# Generate the WCO-DEC model
generate

# Move generated schema to source folder
log "Move generated schema to source folder... ✔"
cp -R  wco/* ../src/main/java/

# Add Declaration Object Mapper
log "Add Declaration Object Mapper... ✔"
if [ "$(uname)" == "Darwin" ]; then
    gsed -i '$e cat declaration_mapper.txt' ../src/main/java/wco/datamodel/wco/documentmetadata_dms/_2/ObjectFactory.java
elif [ "$(expr substr $(uname -s) 1 5)" == "Linux" ]; then
    sed -i '$e cat declaration_mapper.txt' ../src/main/java/wco/datamodel/wco/documentmetadata_dms/_2/ObjectFactory.java
fi

# Clean up temporary files/directories
clean
