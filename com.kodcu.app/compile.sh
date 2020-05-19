#!/usr/bin/env bash

mkdir -p ../mods/com.kodcu.app

javac -d ../mods/com.kodcu.app \
--module-path ../mods \
src/main/java/module-info.java \
src/main/java/com/kodcu/app/App.java
