FROM openjdk:23-jdk

ARG app-dir=/app

# parameter that was passed into command line
ARG port=4000 

WORKDIR ${app-dir}

COPY .mvn .mvn
COPY src src
COPY pom.xml .
COPY mvnw . 
COPY mcnw.cmd .

RUN .mvn clean package -Dmaven.tests.skip=true

# machine env var
ENV SERVER_PORT 4000

EXPOSE ${SERVER_PORT}


