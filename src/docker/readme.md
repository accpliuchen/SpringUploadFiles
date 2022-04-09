#build docker
docker build -t rokt/demo .

#check docker list
docker images

#run docker
docker run --name demo -p 8279:8279 -d rokt/demo