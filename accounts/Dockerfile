#Library
FROM openjdk:17-jdk-slim

#Author
MAINTAINER quannguyen1999

# Install CURL
RUN apt-get update && apt-get install -y curl

#Copy file jar
COPY target/accounts-0.0.1-SNAPSHOT.jar /accounts-0.0.1-SNAPSHOT.jar

#Excute the application
ENTRYPOINT ["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]