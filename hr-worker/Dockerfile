FROM openjdk:11.0.16-jdk
VOLUME /tmp
ADD ./target/hr-worker-0.0.1-SNAPSHOT.jar hr-worker.jar
ENTRYPOINT ["java", "-jar", "/hr-worker.jar"]