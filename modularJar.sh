#!/usr/bin/env bash

mkdir -p modularjar

jar --create --file modularjar/greaterolder@1.0.jar \
--module-version=1.0 -C mods/greeterolder .

jar --create --file modularjar/greaterrecent@2.0.jar \
--module-version=2.0 -C mods/greeterrecent .

jar --create --file modularjar/foo@1.0.jar \
--module-version=1.0 -C mods/com.kodcu.foo .

jar --create --file modularjar/bar@1.0.jar \
--module-version=1.0 -C mods/com.kodcu.bar .

jar --create --file modularjar/app@1.0.jar \
--module-version=1.0 --main-class=com.kodcu.app.App -C mods/com.kodcu.app .
