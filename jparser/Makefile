all: jparse

YYParser.java: thrifty.jy
	/opt/local/bin/bison --language=java -o $@ $^

clean:
	rm YYParser.java *.class

jparse: YYParser.java
	javac YYParser.java
