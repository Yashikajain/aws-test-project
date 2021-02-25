#!/usr/bin/env bash

while [ true ]
do
    if [ "$(curl -s https://yashijai-aws.com/api/)" = '{"status":"UP"}' ]
    then
        exit 0
    else
        echo "check server is running?"
        sleep 3s
    fi
done