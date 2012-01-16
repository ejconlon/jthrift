all: jparse

YYParser.java: thrifty.jy
	bison --language=java -o $@ $^

clean:
	rm YYParser.java *.class

jparse: YYParser.java
	javac *.java
