#!/usr/bin/env bash

mkdir -p ../mods/com.kodcu.foo

javac -d ../mods/com.kodcu.foo \
--module-path ../mods \
src/main/java/module-info.java \
src/main/java/com/kodcu/foo/Foo.java
