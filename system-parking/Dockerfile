FROM eclipse-temurin:21-jre

WORKDIR /app

COPY target/system-parking.jar system-parking.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "system-parking.jar"]
