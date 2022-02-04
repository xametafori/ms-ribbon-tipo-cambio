FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8002
ADD ./target/ribbon-0.0.1-SNAPSHOT.jar ribbon.jar
ENTRYPOINT ["java","-jar","/ribbon.jar"]