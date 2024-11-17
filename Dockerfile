# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR file to the container
COPY target/demo-api.jar app.jar

# Specify the command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]