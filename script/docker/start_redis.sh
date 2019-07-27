#!/usr/bin/env bash
docker rm -f myredis
docker run --name myredis -p 6379:6379 -d redis:latest