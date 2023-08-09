FROM eclipse-temurin:17-jdk-alpine

ENV VER=0.2.0
ENV STG=dev
ENV DB_URL=jdbc:h2:mem:local
ENV DB_USERNAME=sa
ENV DB_PASSWORD=''

COPY build/libs/tatiatic-user-api-${VER}.jar app.jar

ENTRYPOINT ["java", \
"-Dspring.profiles.active=${STG}", \
"-Dspring.datasource.url=${DB_URL}", \
"-Dspring.datasource.username=${DB_USERNAME}", \
"-Dspring.datasource.password=${DB_PASSWORD}", \
"-jar","/app.jar"]