echo "\033]0;Store2 - T1\007"
# java -Dspring.profiles.active=store -jar ../employeed/employeed-package/target/employeed-package-0.0.1-SNAPSHOT.jar
docker rm store2
# docker volume rm store-vol
docker volume create store2-vol
docker run --mount source=store2-vol,target=/db --network store2-net --network cloud-net --name store2 -p 8002:8002 -e store=store2 -e port=8002 -e tenant=t1 netscoretech/poc-store 
