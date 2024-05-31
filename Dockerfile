FROM eclipse-temurin:21

COPY target/random.jar app.jar

EXPOSE 8081

ENTRYPOINT [ "java", "-jar", "app.jar" ]
