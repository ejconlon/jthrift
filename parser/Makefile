all: tparse

clean:
	rm thrifty.tab.cc lex.yy.cc tparse

thrifty.tab.cc: thrifty.yy
	bison -d -o $@ $^

lex.yy.cc: thriftl.ll
	lex -o $@ $^

tparse: thrifty.tab.cc lex.yy.cc
	g++ -o $@ *.cc parser/*.cc