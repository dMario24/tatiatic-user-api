FROM eclipse-temurin:17-jdk-alpine

ARG STG=prd
ARG DB_UR=***
ARG DB_NA=***
ARG DB_ID=***
ARG DB_PA=***

COPY build/libs/tatiatic-user-api-0.2.0.jar app.jar

ENTRYPOINT ["java", \
"-Dspring.profiles.active=${STG}", \
"-Dspring.datasource.url=jdbc:postgresql://${DB_UR}:5432/${DB_NA}", \
"-Dspring.datasource.username=${DB_ID}", \
"-Dspring.datasource.password=${DB_PA}", \
"-jar","/app.jar"]