all: jparse

YYParser.java: thrifty.jy
	bison --language=java -o $@ $^

clean:
	rm YYParser.java YYLexer.java *.class

jparse: YYParser.java
	javac *.java
