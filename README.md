# demo-call-github-api
Simple apps to call github repo and save the result to database.


Building a single module
====================
To build a specific module run the command: `mvn clean install` in the module directory

Running on Docker module
====================
To run on Docker run the command : `docker-compose up` in the module directory

Running a Spring Boot module
====================
Before run a Spring Boot module, please change the db connection properties whether use existing Mysql or H2. 
To run a Spring Boot module run the command: `mvn spring-boot:run` in the module directory 


Database Options
====================
Default is using Mysql on docker. 
If need to connect to Mysql on other environment  can change the url properties on application.properties : spring.datasource.url
Other options is using H2 memmory database. 
To enable change the pom.xml then uncomment h2 dependency and comment Mysql dependency. 
Do the same thing on application.properties. comment spring.datasource.* and spring.jpa.database-platform.
To enable H2 console uncomment spring.h2.console.enabled properties on application.properties.
To connect to H2 db console : 
1. after login go to [address]:8080/console
2. check the log to find the db url. eg: jdbc:h2:mem:4e5ffc09-bf02-443f-9571-2fc0a9ba8104
3. the url will changes everytime the app being restart.


Running Tests
=============
Run command `mvn clean install` from within a module will run the unit tests in that module.
For running the test only use command `mvn test` in the module directory.
