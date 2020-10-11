#!/bin/sh

cd ./Dockerfiles/JBossServers73x
docker build -t docker.io/eat73x --ulimit nofile=5000:5000 . > outputEap73x.txt

#sudo docker stop $(sudo docker ps -a -q)
#sudo docker rm $(sudo docker ps -a -q)
sudo docker rmi -f docker.io/eat73x
