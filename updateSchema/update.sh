#!/bin/bash


# Delete previous schemas
rm -rf customs-declarations/

# Download the latest Shcema definitions
git clone git@github.com:hmrc/customs-declarations.git
cd customs-declarations
git checkout v0.245.0
cd ..
# Generate the WCO-DEC model

mkdir wco


xjc -d wco ./customs-declarations/public/api/conf/1.0/schemas/wco/declaration/DocumentMetaData_2_DMS.xsd -no-header
xjc -d wco ./customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DEC_2_DMS.xsd -no-header

# move generated file to source folder

cp -R  wco/* ../src/main/java/


rm -rf customs-declarations/
rm -rf wco
