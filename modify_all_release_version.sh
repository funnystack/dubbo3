#!/usr/bin/env bash
DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
cd ${DIR}
mvn -e versions:set \
    -DgroupId=com.funny \
    -DartifactId=dubbo3 \
    -DnewVersion=1.0.0-RELEASE \
    -DgenerateBackupPoms=false
#mvn -e  clean compile  install -DskipTests
