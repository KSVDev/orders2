FROM openjdk:8u232-jre
ADD target/com.kozinets.orders2-1.0-SNAPSHOT-exec.jar com.kozinets.orders2-1.0-SNAPSHOT-exec.jar
ENTRYPOINT ["java", "-jar", "com.kozinets.orders2-1.0-SNAPSHOT-exec.jar"]
#/home/sergey/IdeaProjects/orders2/target/com.kozinets.orders2-1.0-SNAPSHOT-exec.jar