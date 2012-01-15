all: tparse

Thrifty.java: thrifty.jy
	bison --language=java -o $@ $^

clean:
	rm thrifty.cc thrifty.hh thriftl.cc tparse Thrifty.java

thrifty.cc: thrifty.yy
	bison -d -o $@ $^

thrifty.hh: thrifty.cc

thriftl.cc: thriftl.ll thrifty.hh
	lex -o $@ $^

tparse: thrifty.cc thriftl.cc
	g++ -o $@ *.c *.cc parse/*.cc generate/*.cc
