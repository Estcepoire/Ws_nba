from openjdk: 8
ARG JAR_FILE = target/*.war
COPY ${JAR_FILE} ws.war
EXPOSE 8080
ENTRYPOINT [ "java","-war","/ws.war" ]