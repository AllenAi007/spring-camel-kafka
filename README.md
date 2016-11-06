# spring-camel-kafka
Kafka is high speed messaging bus, can build up ESB(Enterprise Service Bus) based one it.

Key techknowledges are used.
spring-boot
Apache Camel 
Apache Kafka

Pre-installation
  JDK 8+ 
  Zookeeper
  Apache Kafka
  

KAFKA related command
1. Start Zookeeper
%KAFKA_HOME%\bin\windows\zookeeper-server-start.bat %KAFKA_HOME%\config\zookeeper.properties
2. Start Kafka
%KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties