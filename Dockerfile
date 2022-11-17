FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} achaat.jar
ENTRYPOINT ["java","-jar","/achaat.jar"]
EXPOSE 8089