### Convert csv format data to parquet format data

* Get the project files
```bash
$ git clone https://github.com/greatdreams/simple-java-application-template.git
```
* build the project
```bash
$ bin/activator  package
```
* run the project
In main class com.example.Hello
  
  1. config the csv file path - FILEINPATH
  2. config the parquet file path which is the result file - FILEOUTPATH
  3. config csv column separator - SEPARATOR
  4. config message type(map csv column to parquet column) 
  
  ```java
  MessageType messageType = MessageTypeParser.parseMessageType(
                  "message csv {required binary name = 1; \n" +
                  "    required binary email = 2; }");
  ```
  Once configuration above and run the folloing command
  
    ```bash
        $ bin/activator run
    ```
    
* The techonologies the project uses
	* activator [https://www.lightbend.com/community/core-tools/activator-and-sbt](https://www.lightbend.com/community/core-tools/activator-and-sbt)
	* sbt [scala-sbt.org](http://scala-sbt.org)
	* java [http://www.oracle.com/technetwork/java/javase/downloads/index.html](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
	* logback a logging framework [http://logback.qos.ch/](http://logback.qos.ch/)
