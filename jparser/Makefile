all: jparse

YYParser.java: thrifty.jy
	bison --language=java -o $@ $^

YYLexer.java: YYParser.java thriftl.jl
	jflex thriftl.jl

clean:
	rm *.class

superclean: clean
	rm YYParser.java YYLexer.java

jparse: YYParser.java YYLexer.java
	javac *.java

test: jparse
	cd ../..; java jthrift.jparser.JParse jthrift/examples/userstorage.thrift	