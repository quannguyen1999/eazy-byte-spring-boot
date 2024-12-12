#Library
FROM openjdk:17-jdk-slim

#Author
MAINTAINER quannguyen1999

# Install CURL
RUN apt-get update && apt-get install -y curl

#Copy file jar
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar /eurekaserver-0.0.1-SNAPSHOT.jar

#Excute the application
ENTRYPOINT ["java","-jar","eurekaserver-0.0.1-SNAPSHOT.jar"]