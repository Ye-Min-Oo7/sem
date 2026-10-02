FROM eclipse-temurin:26-jdk
COPY ./target/seMethods-jar-with-dependencies.jar /tmp/seMethods.jar
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "seMethods.jar"]