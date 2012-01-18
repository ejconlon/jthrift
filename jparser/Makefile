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

testparse: jparse
	cd ../..; java jthrift.jparser.JParse parse jthrift/examples/userstorage.thrift	

testlex: jparse
	cd ../..; java jthrift.jparser.JParse lex jthrift/examples/userstorage.thrift	