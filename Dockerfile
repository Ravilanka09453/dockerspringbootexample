FROM openjdk:8
ADD target/docker-demo.jar docker-demo.jar
Expose 8080
ENTRYPOINT ["java","-jar","docker-demo.jar"]

