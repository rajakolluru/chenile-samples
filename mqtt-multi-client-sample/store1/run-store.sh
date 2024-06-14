echo "\033]0;Store1 - T1\007"
# java -Dspring.profiles.active=store -jar ../employeed/employeed-package/target/employeed-package-0.0.1-SNAPSHOT.jar
docker rm store1
# docker volume rm store-vol
docker volume create store1-vol
docker run --mount source=store1-vol,target=/db --network store1-net --network cloud-net --name store1 -p 8001:8001 -e store=store1 -e port=8001 -e tenant=t1 netscoretech/poc-store 
