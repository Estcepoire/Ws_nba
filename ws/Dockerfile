FROM openjdk:8
ARG WAR_FILE=target/ws-0.0.1-SNAPSHOT.war
COPY ${WAR_FILE} nba.war
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/nba.war"]