# CamelSB_FileToQueueService
[Description]
A Simple Example

This example shows how to create a Camel route which read file from a directory and send to an ActiveMQ queue using Spring-Boot and JMS.

[Setting]
pom.xml:
    depends on camel-spring-boot-starter, activemq etc.

[Prerequisite]
1. Set up ActiveMQ environment
   1) Start Docker (Windows)
   2) Run below command using "git bash"
	  $ docker run --name sr4-activemq -p 61616:61616 -p 8161:8161 -p 61613:61613 -p 61614:61614 -d rmohr/activemq:5.14.3-alpine

   3) After container rmohr/activemq:5.14.3-alpine is running, bring up a browser and type in below URL:
	  http://localhost:8161/admin/

   4) Log in as admin/admin.
   5) Create MyInputQueue and MyOutputQueue

[Build]
$ . /c/jning/bin/jnbash11.sh
$ mvn clean install

[Run]
$ mvn spring-boot:run