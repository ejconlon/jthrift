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
	javac -g -source 1.6 -target 1.6 *.java

testparse: jparse
	cd ../..; java jthrift.jparser.JParse parse jthrift/examples/tutorial.thrift	

testlex: jparse
	cd ../..; java jthrift.jparser.JParse lex jthrift/examples/tutorial.thrift	

testrunner: jparse
	cd ../..; java -enableassertions jthrift.jparser.TestRunner

testdebugger: jparse
	cd ../..; jdb jthrift.jparser.TestRunner