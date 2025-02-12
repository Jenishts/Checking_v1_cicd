FROM openjdk:17-alpine
EXPOSE 9000


COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
