javac wordCount/*.java
jar cvfe wordCount.jar wordCount.Main wordCount/*.class
java -jar wordCount.jar