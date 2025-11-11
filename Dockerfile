FROM eclipse-temurin:17-jdk-focal-slim
WORKDIR /app
COPY target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]