#!/bin/bash


###################################
####         FUNCTIONS         ####
###################################

GREEN_COLOUR=$(tput setaf 2)
RESET_COLOR=$(tput sgr0)

function log {
 echo "${GREEN_COLOUR}${1}${RESET_COLOR}"
}

function usage {
 cat ./usage.txt
 exit 0
}

function exiting {
 echo "$1"
 exit 1
}

function process_input {
    while :; do
        case $1 in
            -h|--help|--usage) usage
            ;;
            -t|--tag) shift; GIT_TAG="${1}"
            ;;
            *) break
        esac
        shift
    done
}

function git_clone {
    log "Download the latest Schema definitions... "
    git clone git@github.com:hmrc/customs-declarations.git
    if [ -z "$GIT_TAG" ]; then
        cd customs-declarations || exit
        git checkout "${1}"
        cd ..
    fi
}

function fix_notification_dec_namespace {
  cp customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DEC_2_DMS.xsd customs-declarations/public/api/conf/1.0/schemas/wco/notification
  cp customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DS/WCO_DEC_DS_2_DMS.xsd customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_DS

  cp customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_DEC_2_DMS.xsd customs-declarations/public/api/conf/1.0/schemas/wco/declaration
  cp customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_DS/WCO_DEC_DS_2_DMS.xsd customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DS

  OLD_STRING="../declaration/WCO_DEC_2_DMS.xsd"
  NEW_STRING="WCO_DEC_2_DMS.xsd"
  sed -i "s|$OLD_STRING|$NEW_STRING|g"  "customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd"
}

function xsd2java {
  local libdir="libs"
  
  local codemodel="$libdir/codemodel-4.0.5.jar"
  local dtdParser="$libdir/dtd-parser-1.5.1.jar"
  local istackRuntime="$libdir/istack-commons-runtime-4.1.2.jar"
  local istackTools="$libdir/istack-commons-tools-4.1.2.jar"
  local activation="$libdir/jakarta.activation-api-2.1.3.jar"
  local jakarta="$libdir/jakarta.xml.bind-api-4.0.2.jar"
  local jaxbCore="$libdir/jaxb-core-4.0.5.jar"
  local jaxbRuntime="$libdir/jaxb-runtime-4.0.5.jar"
  local xjc="$libdir/jaxb-xjc-4.0.5.jar"
  local relaxng="$libdir/relaxng-datatype-4.0.5.jar"
  local rngom="$libdir/rngom-4.0.5.jar"
  local xsom="$libdir/xsom-4.0.5.jar"
  
  local classpath="$codemodel:$dtdParser:$istackRuntime:$istackTools:$activation:$jakarta:$jaxbCore:$jaxbRuntime:$xjc:$relaxng:$rngom:$xsom"
  
  log "Generate the WCO-DEC model from $1 ... ✔"
  java -cp $classpath com.sun.tools.xjc.XJCFacade "$1" -d classes -no-header
}

function generate {
    mkdir classes
    xsd2java customs-declarations/public/api/conf/1.0/schemas/wco/declaration/DocumentMetaData_2_DMS.xsd
    xsd2java customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DEC_2_DMS.xsd

    xsd2java customs-declarations/public/api/conf/1.0/schemas/wco/notification/DocumentMetaData_2_DMS.xsd
    xsd2java customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd
}

function clean {
    log "Clean up temporary files/directories... ✔"
    rm -fr customs-declarations
    rm -fr classes
}