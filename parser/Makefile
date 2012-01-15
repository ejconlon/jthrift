all: tparse

clean:
	rm thrifty.cc thrifty.hh thriftl.cc tparse

thrifty.cc: thrifty.yy
	bison -d -o $@ $^

thrifty.hh: thrifty.cc

thriftl.cc: thriftl.ll thrifty.hh
	lex -o $@ $^

tparse: thrifty.cc thriftl.cc
	g++ -o $@ *.cc parser/*.cc generator/*.cc