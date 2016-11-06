# spring-camel-kafka

## Kafka is high speed messaging bus, can build up ESB(Enterprise Service Bus) based one it.<br />

## Key techknowledges are used.<br />
###     Java (1.8)
###     Spring Boot (1.4.1.RELEASE) <br />
###     Apache Camel (2.18.0)  <br />
###     Apache Kafka <br />

## Pre-installation <br />
###  JDK 8+   <br />
###  Zookeeper <br />
###  Apache Kafka <br />
  

## KAFKA related command <br />
### 1. Start Zookeeper <br />
%KAFKA_HOME%\bin\windows\zookeeper-server-start.bat %KAFKA_HOME%\config\zookeeper.properties \<br />
### 2. Start Kafka <br />
%KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties \<br />