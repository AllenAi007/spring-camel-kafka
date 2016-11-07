# spring-camel-kafka

	Kafka is high speed messaging bus, can build up ESB(Enterprise Service Bus) based one it.
	Camel is the implementation for EIP(Enterprice Integration Partten), e.g. routing, transfer, enrich
	Spring boot provide the rapid application development

## Key techknowledges
    Java (1.8)
    Spring Boot (1.4.1.RELEASE) 
    Apache Camel (2.18.0)  
    Apache Kafka (2.11-0.10.1.0)

## Pre-installation 
    JDK 8+   
    Zookeeper 
    Apache Kafka 

## KAFKA related command 
###    1. Start Zookeeper
    %KAFKA_HOME%\bin\windows\zookeeper-server-start.bat %KAFKA_HOME%\config\zookeeper.properties
###    2. Start Kafka
    %KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties

## How to run
	git clone https://github.com/AllenAi007/spring-camel-kafka.git
	cd spring-camel-kafka
	mvn spring-boot:run


## Command on windows 

	#create a topic 
	%KAFKA_HOME%\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 3 --partitions 3 --topic test

	#list topics
	%KAFKA_HOME%\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181

	#discribe topi info
	%KAFKA_HOME%\bin\windows\kafka-topics.bat --describe --zookeeper localhost:2181 --topic my-replicated-topic

	# delete a topic 
	%KAFKA_HOME%\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --delete --topic test

	# send message 
	%KAFKA_HOME%\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test
