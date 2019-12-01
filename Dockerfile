FROM openjdk:8u232-jre
ADD target/com.kozinets.orders-1.0-SNAPSHOT-exec.jar com.kozinets.orders-1.0-SNAPSHOT-exec.jar
ENTRYPOINT ["java", "-jar", "com.kozinets.orders-1.0-SNAPSHOT-exec.jar"]
#/home/sergey/IdeaProjects/orders/target/com.kozinets.orders1.0-SNAPSHOT-exec.jar