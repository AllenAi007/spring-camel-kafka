# spring-camel-kafka

Kafka is high speed messaging bus, can build up ESB(Enterprise Service Bus) based one it.

## Key techknowledges are used.
    Java (1.8)
    Spring Boot (1.4.1.RELEASE) 
    Apache Camel (2.18.0)  
    Apache Kafka 

## Pre-installation 
   JDK 8+   
   Zookeeper 
   Apache Kafka 
  

## KAFKA related command 
    1. Start Zookeeper
%KAFKA_HOME%\bin\windows\zookeeper-server-start.bat %KAFKA_HOME%\config\zookeeper.properties
    2. Start Kafka
%KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties