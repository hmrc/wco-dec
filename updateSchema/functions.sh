#!/bin/bash


###################################
####         FUNCTIONS         ####
###################################

GREEN_COLOUR=`tput setaf 2`
RESET_COLOR=`tput sgr0`

function log {
 echo "${GREEN_COLOUR}${1}${RESET_COLOR}"
}

function usage {
 cat ./usage.txt
 exit 0
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
    echo ${1}
    if [ -z $GIT_TAG ]; then
        cd customs-declarations
        git checkout ${1}
        cd ..
    fi
}

function fix_notification_dec_namespace {
  cp customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DEC_2_DMS.xsd customs-declarations/public/api/conf/1.0/schemas/wco/notification
  cp customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DS/WCO_DEC_DS_2_DMS.xsd customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_DS
}

function generate {
    log "Generate the WCO-DEC model... ✔"
    mkdir wco
    xjc -d wco ./customs-declarations/public/api/conf/1.0/schemas/wco/declaration/DocumentMetaData_2_DMS.xsd -no-header
    xjc -d wco ./customs-declarations/public/api/conf/1.0/schemas/wco/declaration/WCO_DEC_2_DMS.xsd -no-header
    xjc -d wco ./customs-declarations/public/api/conf/1.0/schemas/wco/notification/DocumentMetaData_2_DMS.xsd -no-header
    xjc -d wco ./customs-declarations/public/api/conf/1.0/schemas/wco/notification/WCO_RES_2_DMS.xsd -no-header
}

function clean {
    log "Clean up temporary files/directories... ✔"
    rm -rf customs-declarations/
    rm -rf wco
}