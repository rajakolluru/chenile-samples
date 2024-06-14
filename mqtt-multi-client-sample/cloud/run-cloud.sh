echo "\033]0;Cloud\007"
# java  -jar ../employeed/employeed-package/target/employeed-package-0.0.1-SNAPSHOT.jar
docker rm cloud
# docker volume rm cloud-vol
# docker volume create cloud-vol
docker run  --mount source=cloud-vol,target=/db --network cloud-net --name cloud -p 8000:8000 netscoretech/poc

