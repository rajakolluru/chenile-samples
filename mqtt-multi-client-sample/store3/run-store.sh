echo "\033]0;Store3 - T2\007"
# java -Dspring.profiles.active=store -jar ../employeed/employeed-package/target/employeed-package-0.0.1-SNAPSHOT.jar
docker rm store3
# docker volume rm store-vol
docker volume create store3-vol
docker run --mount source=store3-vol,target=/db --network store3-net --network cloud-net --name store3 -p 8003:8003 -e store=store3 -e port=8003 -e tenant=t2 netscoretech/poc-store 
