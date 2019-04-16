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

# Generate the WCO-DEC model
generate

# Move generated schema to source folder
log "Move generated schema to source folder... ✔"
cp -R  wco/* ../src/main/java/

# Clean up temporary files/directories
clean
