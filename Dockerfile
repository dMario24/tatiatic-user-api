FROM eclipse-temurin:17-jdk-alpine

COPY build/libs/tatiatic-user-api-0.2.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]