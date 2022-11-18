FROM openjdk:8-jdk-alpine
RUN apk --no-cache add curl
RUN curl -u admin:saif -o tpAchatProject.jar "http://192.168.20.187:8081/repository/maven-releases/com/esprit/examen/tpAchatProject/1.0/tpAchatProject-1.0.jar" -L
ENTRYPOINT ["java","-jar","/tpAchatProject.jar"]
EXPOSE 8089
