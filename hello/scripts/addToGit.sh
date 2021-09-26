#!/bin/bash

git add ../scripts/*
git add ../src/*
git add ../lib/*
git add ../build.xml
git add ../TEST-TestProgram.xml

new_msg=$(date +"%Y.%m.%d %H:%M:%S")

git commit -m "$new_msg"

#git push origin new_hist
