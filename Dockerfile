FROM openjdk:8-jdk-alpine
COPY target/tpAchatProject-1.0.jar achat.jar
ENTRYPOINT ["java","-jar","/achat.jar"]
EXPOSE 8089