#!/usr/bin/env bash

mkdir -p ../mods/com.kodcu.bar

javac -d ../mods/com.kodcu.bar \
--module-path ../mods \
src/main/java/module-info.java \
src/main/java/com/kodcu/bar/Bar.java
