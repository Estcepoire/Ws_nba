FROM openjdk:8
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} nba.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.war"]