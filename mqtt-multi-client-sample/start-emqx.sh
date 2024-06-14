# docker run -d --name nanomq -p 1883:1883 -p 8083:8083 -p 8883:8883 emqx/nanomq:latest
# Create two networks. connect emqx to both the networks
docker stop emqx
docker rm emqx
docker network create --driver bridge cloud-net
docker network create --driver bridge store1-net
docker network create --driver bridge store2-net
docker network create --driver bridge store3-net
docker run -d  --network cloud-net --name emqx -p 1883:1883 -p 8083:8083 -p 8084:8084 -p 8883:8883 -p 18083:18083  emqx/emqx:latest
