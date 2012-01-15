all: cparse

clean:
	rm thrifty.cc thrifty.hh thriftl.cc cparse

thrifty.cc: thrifty.yy
	bison -d -o $@ $^

thrifty.hh: thrifty.cc

thriftl.cc: thriftl.ll thrifty.hh
	lex -o $@ $^

cparse: thrifty.cc thriftl.cc
	g++ -o $@ *.c *.cc parse/*.cc generate/*.cc
