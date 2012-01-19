package jthrift.jparser;

class sym {
    public static final int EOF = YYParser.EOF;
}

class K {
      static Context c = Context.getInstance();
      static java_cup.runtime.Symbol s(int dex) {
        return new java_cup.runtime.Symbol(dex);
      }
      static java_cup.runtime.Symbol s(int dex,
          java_cup.runtime.YYLVal lv) {
        return new java_cup.runtime.Symbol(dex, lv);
      }
}

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * Thrift scanner.
 *
 * Tokenizes a thrift definition file.
 */


/**
 * Helper definitions, comments, constants, and whatnot
 */

%%

%class YYLexer
%unicode
%cup
%line
%column

intconstant   = ([+-]?[0-9]+)
hexconstant   = ("0x"[0-9A-Fa-f]+)
dubconstant   = ([+-]?[0-9]*(\.[0-9]+)?([eE][+-]?[0-9]+)?)
identifier    = ([a-zA-Z_][\.a-zA-Z_0-9]*)
whitespace    = ([ \t\r\n]*)
sillycomm     = ("/*""*"*"*/")
multicomm     = ("/*"[^*]"/"*([^*/]|[^*]"/"|"*"[^/])*"*"*"*/")
doctext       = ("/**"([^*/]|[^*]"/"|"*"[^/])*"*"*"*/")
comment       = ("//"[^\n]*)
unixcomment   = ("#"[^\n]*)
symbol        = ([:;\,\{\}\(\)\=<>\[\]])
st_identifier = ([a-zA-Z-][\.a-zA-Z_0-9-]*)
literal_begin = (['\"])
single_quote_literal = ('[^']*')
double_quote_literal = (\"[^\"]*\")

%%

{whitespace}         { /* do nothing */                 }
{sillycomm}          { /* do nothing */                 }
{multicomm}          { /* do nothing */                 }
{comment}            { /* do nothing */                 }
{unixcomment}        { /* do nothing */                 }

{symbol}             { return K.s(yytext().charAt(0));                }
"*"                  { return K.s(yytext().charAt(0));                }

"false"              { return K.s(YYParser.tok_int_constant, new java_cup.runtime.YYLVal(0)); }
"true"               { return K.s(YYParser.tok_int_constant, new java_cup.runtime.YYLVal(1)); }

"namespace"          { return K.s(YYParser.tok_namespace);            }
"cpp_namespace"      { return K.s(YYParser.tok_cpp_namespace);        }
"cpp_include"        { return K.s(YYParser.tok_cpp_include);          }
"cpp_type"           { return K.s(YYParser.tok_cpp_type);             }
"java_package"       { return K.s(YYParser.tok_java_package);         }
"cocoa_prefix"       { return K.s(YYParser.tok_cocoa_prefix);         }
"csharp_namespace"   { return K.s(YYParser.tok_csharp_namespace);     }
"delphi_namespace"   { return K.s(YYParser.tok_delphi_namespace);     }
"php_namespace"      { return K.s(YYParser.tok_php_namespace);        }
"py_module"          { return K.s(YYParser.tok_py_module);            }
"perl_package"       { return K.s(YYParser.tok_perl_package);         }
"ruby_namespace"     { return K.s(YYParser.tok_ruby_namespace);       }
"smalltalk_category" { return K.s(YYParser.tok_smalltalk_category);   }
"smalltalk_prefix"   { return K.s(YYParser.tok_smalltalk_prefix);     }
"xsd_all"            { return K.s(YYParser.tok_xsd_all);              }
"xsd_optional"       { return K.s(YYParser.tok_xsd_optional);         }
"xsd_nillable"       { return K.s(YYParser.tok_xsd_nillable);         }
"xsd_namespace"      { return K.s(YYParser.tok_xsd_namespace);        }
"xsd_attrs"          { return K.s(YYParser.tok_xsd_attrs);            }
"include"            { return K.s(YYParser.tok_include);              }
"void"               { return K.s(YYParser.tok_void);                 }
"bool"               { return K.s(YYParser.tok_bool);                 }
"byte"               { return K.s(YYParser.tok_byte);                 }
"i16"                { return K.s(YYParser.tok_i16);                  }
"i32"                { return K.s(YYParser.tok_i32);                  }
"i64"                { return K.s(YYParser.tok_i64);                  }
"double"             { return K.s(YYParser.tok_double);               }
"string"             { return K.s(YYParser.tok_string);               }
"binary"             { return K.s(YYParser.tok_binary);               }
"slist"              { return K.s(YYParser.tok_slist);                }
"senum"              { return K.s(YYParser.tok_senum);                }
"map"                { return K.s(YYParser.tok_map);                  }
"list"               { return K.s(YYParser.tok_list);                 }
"set"                { return K.s(YYParser.tok_set);                  }
"oneway"             { return K.s(YYParser.tok_oneway);               }
"typedef"            { return K.s(YYParser.tok_typedef);              }
"struct"             { return K.s(YYParser.tok_struct);               }
"union"              { return K.s(YYParser.tok_union);                }
"exception"          { return K.s(YYParser.tok_xception);             }
"extends"            { return K.s(YYParser.tok_extends);              }
"throws"             { return K.s(YYParser.tok_throws);               }
"service"            { return K.s(YYParser.tok_service);              }
"enum"               { return K.s(YYParser.tok_enum);                 }
"const"              { return K.s(YYParser.tok_const);                }
"required"           { return K.s(YYParser.tok_required);             }
"optional"           { return K.s(YYParser.tok_optional);             }
"async" {
  K.c.pwarning(0, "\"async\" is deprecated.  It is called \"oneway\" now.\n");
  return K.s(YYParser.tok_oneway);
}


"BEGIN"              { K.c.thriftReservedKeyword(yytext()); }
"END"                { K.c.thriftReservedKeyword(yytext()); }
"__CLASS__"          { K.c.thriftReservedKeyword(yytext()); }
"__DIR__"            { K.c.thriftReservedKeyword(yytext()); }
"__FILE__"           { K.c.thriftReservedKeyword(yytext()); }
"__FUNCTION__"       { K.c.thriftReservedKeyword(yytext()); }
"__LINE__"           { K.c.thriftReservedKeyword(yytext()); }
"__METHOD__"         { K.c.thriftReservedKeyword(yytext()); }
"__NAMESPACE__"      { K.c.thriftReservedKeyword(yytext()); }
"abstract"           { K.c.thriftReservedKeyword(yytext()); }
"alias"              { K.c.thriftReservedKeyword(yytext()); }
"and"                { K.c.thriftReservedKeyword(yytext()); }
"args"               { K.c.thriftReservedKeyword(yytext()); }
"as"                 { K.c.thriftReservedKeyword(yytext()); }
"assert"             { K.c.thriftReservedKeyword(yytext()); }
"begin"              { K.c.thriftReservedKeyword(yytext()); }
"break"              { K.c.thriftReservedKeyword(yytext()); }
"case"               { K.c.thriftReservedKeyword(yytext()); }
"catch"              { K.c.thriftReservedKeyword(yytext()); }
"class"              { K.c.thriftReservedKeyword(yytext()); }
"clone"              { K.c.thriftReservedKeyword(yytext()); }
"continue"           { K.c.thriftReservedKeyword(yytext()); }
"declare"            { K.c.thriftReservedKeyword(yytext()); }
"def"                { K.c.thriftReservedKeyword(yytext()); }
"default"            { K.c.thriftReservedKeyword(yytext()); }
"del"                { K.c.thriftReservedKeyword(yytext()); }
"delete"             { K.c.thriftReservedKeyword(yytext()); }
"do"                 { K.c.thriftReservedKeyword(yytext()); }
"dynamic"            { K.c.thriftReservedKeyword(yytext()); }
"elif"               { K.c.thriftReservedKeyword(yytext()); }
"else"               { K.c.thriftReservedKeyword(yytext()); }
"elseif"             { K.c.thriftReservedKeyword(yytext()); }
"elsif"              { K.c.thriftReservedKeyword(yytext()); }
"end"                { K.c.thriftReservedKeyword(yytext()); }
"enddeclare"         { K.c.thriftReservedKeyword(yytext()); }
"endfor"             { K.c.thriftReservedKeyword(yytext()); }
"endforeach"         { K.c.thriftReservedKeyword(yytext()); }
"endif"              { K.c.thriftReservedKeyword(yytext()); }
"endswitch"          { K.c.thriftReservedKeyword(yytext()); }
"endwhile"           { K.c.thriftReservedKeyword(yytext()); }
"ensure"             { K.c.thriftReservedKeyword(yytext()); }
"except"             { K.c.thriftReservedKeyword(yytext()); }
"exec"               { K.c.thriftReservedKeyword(yytext()); }
"finally"            { K.c.thriftReservedKeyword(yytext()); }
"float"              { K.c.thriftReservedKeyword(yytext()); }
"for"                { K.c.thriftReservedKeyword(yytext()); }
"foreach"            { K.c.thriftReservedKeyword(yytext()); }
"function"           { K.c.thriftReservedKeyword(yytext()); }
"global"             { K.c.thriftReservedKeyword(yytext()); }
"goto"               { K.c.thriftReservedKeyword(yytext()); }
"if"                 { K.c.thriftReservedKeyword(yytext()); }
"implements"         { K.c.thriftReservedKeyword(yytext()); }
"import"             { K.c.thriftReservedKeyword(yytext()); }
"in"                 { K.c.thriftReservedKeyword(yytext()); }
"inline"             { K.c.thriftReservedKeyword(yytext()); }
"instanceof"         { K.c.thriftReservedKeyword(yytext()); }
"interface"          { K.c.thriftReservedKeyword(yytext()); }
"is"                 { K.c.thriftReservedKeyword(yytext()); }
"lambda"             { K.c.thriftReservedKeyword(yytext()); }
"module"             { K.c.thriftReservedKeyword(yytext()); }
"native"             { K.c.thriftReservedKeyword(yytext()); }
"new"                { K.c.thriftReservedKeyword(yytext()); }
"next"               { K.c.thriftReservedKeyword(yytext()); }
"nil"                { K.c.thriftReservedKeyword(yytext()); }
"not"                { K.c.thriftReservedKeyword(yytext()); }
"or"                 { K.c.thriftReservedKeyword(yytext()); }
"pass"               { K.c.thriftReservedKeyword(yytext()); }
"public"             { K.c.thriftReservedKeyword(yytext()); }
"print"              { K.c.thriftReservedKeyword(yytext()); }
"private"            { K.c.thriftReservedKeyword(yytext()); }
"protected"          { K.c.thriftReservedKeyword(yytext()); }
"public"             { K.c.thriftReservedKeyword(yytext()); }
"raise"              { K.c.thriftReservedKeyword(yytext()); }
"redo"               { K.c.thriftReservedKeyword(yytext()); }
"rescue"             { K.c.thriftReservedKeyword(yytext()); }
"retry"              { K.c.thriftReservedKeyword(yytext()); }
"register"           { K.c.thriftReservedKeyword(yytext()); }
"return"             { K.c.thriftReservedKeyword(yytext()); }
"self"               { K.c.thriftReservedKeyword(yytext()); }
"sizeof"             { K.c.thriftReservedKeyword(yytext()); }
"static"             { K.c.thriftReservedKeyword(yytext()); }
"super"              { K.c.thriftReservedKeyword(yytext()); }
"switch"             { K.c.thriftReservedKeyword(yytext()); }
"synchronized"       { K.c.thriftReservedKeyword(yytext()); }
"then"               { K.c.thriftReservedKeyword(yytext()); }
"this"               { K.c.thriftReservedKeyword(yytext()); }
"throw"              { K.c.thriftReservedKeyword(yytext()); }
"transient"          { K.c.thriftReservedKeyword(yytext()); }
"try"                { K.c.thriftReservedKeyword(yytext()); }
"undef"              { K.c.thriftReservedKeyword(yytext()); }
"union"              { K.c.thriftReservedKeyword(yytext()); }
"unless"             { K.c.thriftReservedKeyword(yytext()); }
"unsigned"           { K.c.thriftReservedKeyword(yytext()); }
"until"              { K.c.thriftReservedKeyword(yytext()); }
"use"                { K.c.thriftReservedKeyword(yytext()); }
"var"                { K.c.thriftReservedKeyword(yytext()); }
"virtual"            { K.c.thriftReservedKeyword(yytext()); }
"volatile"           { K.c.thriftReservedKeyword(yytext()); }
"when"               { K.c.thriftReservedKeyword(yytext()); }
"while"              { K.c.thriftReservedKeyword(yytext()); }
"with"               { K.c.thriftReservedKeyword(yytext()); }
"xor"                { K.c.thriftReservedKeyword(yytext()); }
"yield"              { K.c.thriftReservedKeyword(yytext()); }

{intconstant} {
  return K.s(YYParser.tok_int_constant,
      new java_cup.runtime.YYLVal(Long.parseLong(yytext())));
}

{hexconstant} {
  return K.s(YYParser.tok_int_constant,
      new java_cup.runtime.YYLVal(Long.parseLong(yytext().substring(2), 16)));
}

{dubconstant} {
  return K.s(YYParser.tok_dub_constant,
      new java_cup.runtime.YYLVal(Double.parseDouble(yytext())));
}

{identifier} {
  return K.s(YYParser.tok_identifier,
      new java_cup.runtime.YYLVal(yytext()));
}

{st_identifier} {
  return K.s(YYParser.tok_st_identifier,
      new java_cup.runtime.YYLVal(yytext()));
}

{single_quote_literal} {
  return K.s(YYParser.tok_literal,
      new java_cup.runtime.YYLVal(yytext()));
}

{double_quote_literal} {
  return K.s(YYParser.tok_literal,
      new java_cup.runtime.YYLVal(yytext()));
}


{doctext} {
 /* This does not show up in the parse tree. */
 /* Rather, the parser will grab it out of the global. */
  if (K.c.parseMode == Context.ParseMode.PROGRAM) {
    K.c.clear_doctext();
    K.c.doctext = new DText(yytext());
    K.c.doctextLineno = yyline;
  }
}

. {
  K.c.unexpectedToken(yytext());
}


