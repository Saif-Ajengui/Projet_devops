FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} tpachat.jar
ENTRYPOINT ["java","-jar","/tpachat.jar"]
EXPOSE 8089