FROM openjdk
ADD target/mongodb_service.jar mongodb_service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/mongodb_service.jar"]