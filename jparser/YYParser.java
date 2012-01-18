
/* A Bison parser, made by GNU Bison 2.4.1.  */

/* Skeleton implementation for Bison LALR(1) parsers in Java
   
      Copyright (C) 2007, 2008 Free Software Foundation, Inc.
   
   This program is free software: you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation, either version 3 of the License, or
   (at your option) any later version.
   
   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.
   
   You should have received a copy of the GNU General Public License
   along with this program.  If not, see <http://www.gnu.org/licenses/>.  */

/* As a special exception, you may create a larger work that contains
   part or all of the Bison parser skeleton and distribute that work
   under terms of your choice, so long as that work isn't itself a
   parser generator using the skeleton or a modified version thereof
   as a parser skeleton.  Alternatively, if you modify or redistribute
   the parser skeleton itself, you may (at your option) remove this
   special exception, which will cause the skeleton and the resulting
   Bison output files to be licensed under the GNU General Public
   License without this special exception.
   
   This special exception was added by the Free Software Foundation in
   version 2.2 of Bison.  */

/* First part of user declarations.  */

/* Line 32 of lalr1.java  */
/* Line 13 of "thrifty.jy"  */

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
 * Thrift parser.
 *
 * This parser is used on a thrift definition file.
 *
 */

/* "%code imports" blocks.  */

/* Line 33 of lalr1.java  */
/* Line 1 of "thrifty.jy"  */

package jthrift.jparser;

import java.util.Map;
import java.util.List;

class C {
      static Context c = Context.getInstance();
}




/* Line 33 of lalr1.java  */
/* Line 84 of "YYParser.java"  */

/**
 * A Bison parser, automatically generated from <tt>thrifty.jy</tt>.
 *
 * @author LALR (1) parser skeleton written by Paolo Bonzini.
 */
class YYParser
{
    /** Version number for the Bison executable that generated this parser.  */
  public static final String bisonVersion = "2.4.1";

  /** Name of the skeleton that generated this parser.  */
  public static final String bisonSkeleton = "lalr1.java";


  /** True if verbose error messages are enabled.  */
  public boolean errorVerbose = false;



  /** Token returned by the scanner to signal the end of its input.  */
  public static final int EOF = 0;

/* Tokens.  */
  /** Token number, to be returned by the scanner.  */
  public static final int tok_identifier = 258;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_literal = 259;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_doctext = 260;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_st_identifier = 261;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_int_constant = 262;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_dub_constant = 263;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_include = 264;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_namespace = 265;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_cpp_namespace = 266;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_cpp_include = 267;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_cpp_type = 268;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_php_namespace = 269;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_py_module = 270;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_perl_package = 271;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_java_package = 272;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_xsd_all = 273;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_xsd_optional = 274;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_xsd_nillable = 275;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_xsd_namespace = 276;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_xsd_attrs = 277;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_ruby_namespace = 278;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_smalltalk_category = 279;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_smalltalk_prefix = 280;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_cocoa_prefix = 281;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_csharp_namespace = 282;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_delphi_namespace = 283;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_void = 284;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_bool = 285;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_byte = 286;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_string = 287;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_binary = 288;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_slist = 289;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_senum = 290;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_i16 = 291;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_i32 = 292;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_i64 = 293;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_double = 294;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_map = 295;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_list = 296;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_set = 297;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_oneway = 298;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_typedef = 299;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_struct = 300;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_xception = 301;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_throws = 302;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_extends = 303;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_service = 304;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_enum = 305;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_const = 306;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_required = 307;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_optional = 308;
  /** Token number, to be returned by the scanner.  */
  public static final int tok_union = 309;



  

  /**
   * Communication interface between the scanner and the Bison-generated
   * parser <tt>YYParser</tt>.
   */
  public interface Lexer {
    

    /**
     * Method to retrieve the semantic value of the last scanned token.
     * @return the semantic value of the last scanned token.  */
    Object getLVal ();

    /**
     * Entry point for the scanner.  Returns the token identifier corresponding
     * to the next token and prepares to return the semantic value
     * of the token. 
     * @return the token identifier corresponding to the next token. */
    int yylex () throws java.io.IOException;

    /**
     * Entry point for error reporting.  Emits an error
     * in a user-defined way.
     *
     * 
     * @param s The string for the error message.  */
     void yyerror (String s);
  }

  /** The object doing lexical analysis for us.  */
  private Lexer yylexer;
  
  



  /**
   * Instantiates the Bison-generated parser.
   * @param yylexer The scanner that will supply tokens to the parser.
   */
  public YYParser (Lexer yylexer) {
    this.yylexer = yylexer;
    
  }

  private java.io.PrintStream yyDebugStream = System.err;

  /**
   * Return the <tt>PrintStream</tt> on which the debugging output is
   * printed.
   */
  public final java.io.PrintStream getDebugStream () { return yyDebugStream; }

  /**
   * Set the <tt>PrintStream</tt> on which the debug output is printed.
   * @param s The stream that is used for debugging output.
   */
  public final void setDebugStream(java.io.PrintStream s) { yyDebugStream = s; }

  private int yydebug = 0;

  /**
   * Answer the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   */
  public final int getDebugLevel() { return yydebug; }

  /**
   * Set the verbosity of the debugging output; 0 means that all kinds of
   * output from the parser are suppressed.
   * @param level The verbosity level for debugging output.
   */
  public final void setDebugLevel(int level) { yydebug = level; }

  private final int yylex () throws java.io.IOException {
    return yylexer.yylex ();
  }
  protected final void yyerror (String s) {
    yylexer.yyerror (s);
  }

  

  protected final void yycdebug (String s) {
    if (yydebug > 0)
      yyDebugStream.println (s);
  }

  private final class YYStack {
    private int[] stateStack = new int[16];
    
    private Object[] valueStack = new Object[16];

    public int size = 16;
    public int height = -1;
    
    public final void push (int state, Object value    	   	      	    ) {
      height++;
      if (size == height) 
        {
	  int[] newStateStack = new int[size * 2];
	  System.arraycopy (stateStack, 0, newStateStack, 0, height);
	  stateStack = newStateStack;
	  
	  
	  Object[] newValueStack = new Object[size * 2];
	  System.arraycopy (valueStack, 0, newValueStack, 0, height);
	  valueStack = newValueStack;

	  size *= 2;
	}

      stateStack[height] = state;
      
      valueStack[height] = value;
    }

    public final void pop () {
      height--;
    }

    public final void pop (int num) {
      // Avoid memory leaks... garbage collection is a white lie!
      if (num > 0) {
	java.util.Arrays.fill (valueStack, height - num + 1, height, null);
        
      }
      height -= num;
    }

    public final int stateAt (int i) {
      return stateStack[height - i];
    }

    public final Object valueAt (int i) {
      return valueStack[height - i];
    }

    // Print the state stack on the debug stream.
    public void print (java.io.PrintStream out)
    {
      out.print ("Stack now");
      
      for (int i = 0; i < height; i++)
        {
	  out.print (' ');
	  out.print (stateStack[i]);
        }
      out.println ();
    }
  }

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return success (<tt>true</tt>).  */
  public static final int YYACCEPT = 0;

  /**
   * Returned by a Bison action in order to stop the parsing process and
   * return failure (<tt>false</tt>).  */
  public static final int YYABORT = 1;

  /**
   * Returned by a Bison action in order to start error recovery without
   * printing an error message.  */
  public static final int YYERROR = 2;

  /**
   * Returned by a Bison action in order to print an error message and start
   * error recovery.  */
  public static final int YYFAIL = 3;

  private static final int YYNEWSTATE = 4;
  private static final int YYDEFAULT = 5;
  private static final int YYREDUCE = 6;
  private static final int YYERRLAB1 = 7;
  private static final int YYRETURN = 8;

  private int yyerrstatus_ = 0;

  /**
   * Return whether error recovery is being done.  In this state, the parser
   * reads token until it reaches a known state, and then restarts normal
   * operation.  */
  public final boolean recovering ()
  {
    return yyerrstatus_ == 0;
  }

  private int yyaction (int yyn, YYStack yystack, int yylen) 
  {
    Object yyval;
    

    /* If YYLEN is nonzero, implement the default value of the action:
       `$$ = $1'.  Otherwise, use the top of the stack.
    
       Otherwise, the following line sets YYVAL to garbage.
       This behavior is undocumented and Bison
       users should not rely upon it.  */
    if (yylen > 0)
      yyval = yystack.valueAt (yylen - 1);
    else
      yyval = yystack.valueAt (0);
    
    yy_reduce_print (yyn, yystack);

    switch (yyn)
      {
	  case 2:
  if (yyn == 2)
    
/* Line 353 of lalr1.java  */
/* Line 196 of "thrifty.jy"  */
    {
      C.c.pdebug("Program . Headers DefinitionList");
      /*
      TODO(dreiss): Decide whether full-program doctext is worth the trouble.
      if ($1 != null) {
        C.c.program.setDoc($1);
      }
      */
      C.c.clear_doctext();
    };
  break;
    

  case 3:
  if (yyn == 3)
    
/* Line 353 of lalr1.java  */
/* Line 208 of "thrifty.jy"  */
    {
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        yyval = C.c.doctext;
        C.c.doctext = null;
      } else {
        yyval = null;
      }
    };
  break;
    

  case 4:
  if (yyn == 4)
    
/* Line 353 of lalr1.java  */
/* Line 219 of "thrifty.jy"  */
    {
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.clear_doctext();
      }
    };
  break;
    

  case 5:
  if (yyn == 5)
    
/* Line 353 of lalr1.java  */
/* Line 229 of "thrifty.jy"  */
    {
      C.c.pdebug("HeaderList . HeaderList Header");
    };
  break;
    

  case 6:
  if (yyn == 6)
    
/* Line 353 of lalr1.java  */
/* Line 233 of "thrifty.jy"  */
    {
      C.c.pdebug("HeaderList . ");
    };
  break;
    

  case 7:
  if (yyn == 7)
    
/* Line 353 of lalr1.java  */
/* Line 239 of "thrifty.jy"  */
    {
      C.c.pdebug("Header . Include");
    };
  break;
    

  case 8:
  if (yyn == 8)
    
/* Line 353 of lalr1.java  */
/* Line 243 of "thrifty.jy"  */
    {
      C.c.pdebug("Header . tok_namespace tok_identifier tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(((Id)(yystack.valueAt (3-(2)))), ((Id)(yystack.valueAt (3-(3)))));
      }
    };
  break;
    

  case 9:
  if (yyn == 9)
    
/* Line 353 of lalr1.java  */
/* Line 250 of "thrifty.jy"  */
    {
      C.c.pdebug("Header . tok_namespace * tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("*"), ((Id)(yystack.valueAt (3-(3)))));
      }
    };
  break;
    

  case 10:
  if (yyn == 10)
    
/* Line 353 of lalr1.java  */
/* Line 258 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'cpp_namespace' is deprecated. Use 'namespace cpp' instead");
      C.c.pdebug("Header . tok_cpp_namespace tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("cpp"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 11:
  if (yyn == 11)
    
/* Line 353 of lalr1.java  */
/* Line 266 of "thrifty.jy"  */
    {
      C.c.pdebug("Header . tok_cpp_include tok_literal");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addCppInclude(((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 12:
  if (yyn == 12)
    
/* Line 353 of lalr1.java  */
/* Line 273 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'php_namespace' is deprecated. Use 'namespace php' instead");
      C.c.pdebug("Header . tok_php_namespace tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("php"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 13:
  if (yyn == 13)
    
/* Line 353 of lalr1.java  */
/* Line 282 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'py_module' is deprecated. Use 'namespace py' instead");
      C.c.pdebug("Header . tok_py_module tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("py"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 14:
  if (yyn == 14)
    
/* Line 353 of lalr1.java  */
/* Line 291 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'perl_package' is deprecated. Use 'namespace perl' instead");
      C.c.pdebug("Header . tok_perl_namespace tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("perl"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 15:
  if (yyn == 15)
    
/* Line 353 of lalr1.java  */
/* Line 300 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'ruby_namespace' is deprecated. Use 'namespace rb' instead");
      C.c.pdebug("Header . tok_ruby_namespace tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("rb"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 16:
  if (yyn == 16)
    
/* Line 353 of lalr1.java  */
/* Line 309 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'smalltalk_category' is deprecated. Use 'namespace smalltalk.category' instead");
      C.c.pdebug("Header . tok_smalltalk_category tok_st_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("smalltalk.category"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 17:
  if (yyn == 17)
    
/* Line 353 of lalr1.java  */
/* Line 318 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'smalltalk_prefix' is deprecated. Use 'namespace smalltalk.prefix' instead");
      C.c.pdebug("Header . tok_smalltalk_prefix tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("smalltalk.prefix"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 18:
  if (yyn == 18)
    
/* Line 353 of lalr1.java  */
/* Line 327 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'java_package' is deprecated. Use 'namespace java' instead");
      C.c.pdebug("Header . tok_java_package tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("java"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 19:
  if (yyn == 19)
    
/* Line 353 of lalr1.java  */
/* Line 336 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'cocoa_prefix' is deprecated. Use 'namespace cocoa' instead");
      C.c.pdebug("Header . tok_cocoa_prefix tok_identifier");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("cocoa"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 20:
  if (yyn == 20)
    
/* Line 353 of lalr1.java  */
/* Line 345 of "thrifty.jy"  */
    {
      C.c.pwarning(1, "'xsd_namespace' is deprecated. Use 'namespace xsd' instead");
      C.c.pdebug("Header . tok_xsd_namespace tok_literal");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.setNamespace(new Id("cocoa"), ((Id)(yystack.valueAt (2-(2)))));
      }
    };
  break;
    

  case 21:
  if (yyn == 21)
    
/* Line 353 of lalr1.java  */
/* Line 354 of "thrifty.jy"  */
    {
     C.c.pwarning(1, "'csharp_namespace' is deprecated. Use 'namespace csharp' instead");
     C.c.pdebug("Header . tok_csharp_namespace tok_identifier");
     if (C.c.parseMode == Context.ParseMode.PROGRAM) {
       C.c.program.setNamespace(new Id("csharp"), ((Id)(yystack.valueAt (2-(2)))));
     }
   };
  break;
    

  case 22:
  if (yyn == 22)
    
/* Line 353 of lalr1.java  */
/* Line 363 of "thrifty.jy"  */
    {
     C.c.pwarning(1, "'delphi_namespace' is deprecated. Use 'namespace delphi' instead");
     C.c.pdebug("Header . tok_delphi_namespace tok_identifier");
     if (C.c.parseMode == Context.ParseMode.PROGRAM) {
       C.c.program.setNamespace(new Id("delphi"), ((Id)(yystack.valueAt (2-(2)))));
     }
   };
  break;
    

  case 23:
  if (yyn == 23)
    
/* Line 353 of lalr1.java  */
/* Line 373 of "thrifty.jy"  */
    {
      C.c.pdebug("Include . tok_include tok_literal");
      if (C.c.parseMode == Context.ParseMode.INCLUDES) {
        Id path = C.c.includeFile(((Id)(yystack.valueAt (2-(2)))));
        if (path.rawString().length() > 0) {
          C.c.program.addInclude(path, ((Id)(yystack.valueAt (2-(2)))));
        }
      }
    };
  break;
    

  case 24:
  if (yyn == 24)
    
/* Line 353 of lalr1.java  */
/* Line 385 of "thrifty.jy"  */
    {
      C.c.pdebug("DefinitionList . DefinitionList Definition");
      if (((DText)(yystack.valueAt (3-(2)))) != null && ((TDoc)(yystack.valueAt (3-(3)))) != null) {
        ((TDoc)(yystack.valueAt (3-(3)))).setDoc(((DText)(yystack.valueAt (3-(2)))));
      }
    };
  break;
    

  case 25:
  if (yyn == 25)
    
/* Line 353 of lalr1.java  */
/* Line 392 of "thrifty.jy"  */
    {
      C.c.pdebug("DefinitionList . ");
    };
  break;
    

  case 26:
  if (yyn == 26)
    
/* Line 353 of lalr1.java  */
/* Line 398 of "thrifty.jy"  */
    {
      C.c.pdebug("Definition . Const");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addConst(((TConst)(yystack.valueAt (1-(1)))));
      }
      yyval = ((TConst)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 27:
  if (yyn == 27)
    
/* Line 353 of lalr1.java  */
/* Line 406 of "thrifty.jy"  */
    {
      C.c.pdebug("Definition . TypeDefinition");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.scope.addType(((TType)(yystack.valueAt (1-(1)))).getName(), ((TType)(yystack.valueAt (1-(1)))));
        if (C.c.parentScope != null) {
          C.c.parentScope.addType(new Id(C.c.parentPrefix + ((TType)(yystack.valueAt (1-(1)))).getName()), ((TType)(yystack.valueAt (1-(1)))));
        }
      }
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 28:
  if (yyn == 28)
    
/* Line 353 of lalr1.java  */
/* Line 417 of "thrifty.jy"  */
    {
      C.c.pdebug("Definition . Service");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.scope.addService(((TService)(yystack.valueAt (1-(1)))).getName(), ((TService)(yystack.valueAt (1-(1)))));
        if (C.c.parentScope != null) {
          C.c.parentScope.addService(new Id(C.c.parentPrefix + ((TService)(yystack.valueAt (1-(1)))).getName()), ((TService)(yystack.valueAt (1-(1)))));
        }
        C.c.program.addService(((TService)(yystack.valueAt (1-(1)))));
      }
      yyval = ((TService)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 29:
  if (yyn == 29)
    
/* Line 353 of lalr1.java  */
/* Line 431 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeDefinition . Typedef");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addTypedef(((TTypedef)(yystack.valueAt (1-(1)))));
      }
    };
  break;
    

  case 30:
  if (yyn == 30)
    
/* Line 353 of lalr1.java  */
/* Line 438 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeDefinition . Enum");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addEnum(((TEnum)(yystack.valueAt (1-(1)))));
      }
    };
  break;
    

  case 31:
  if (yyn == 31)
    
/* Line 353 of lalr1.java  */
/* Line 445 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeDefinition . Senum");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addTypedef(((TTypedef)(yystack.valueAt (1-(1)))));
      }
    };
  break;
    

  case 32:
  if (yyn == 32)
    
/* Line 353 of lalr1.java  */
/* Line 452 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeDefinition . Struct");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addStruct(((TStruct)(yystack.valueAt (1-(1)))));
      }
    };
  break;
    

  case 33:
  if (yyn == 33)
    
/* Line 353 of lalr1.java  */
/* Line 459 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeDefinition . Xception");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.program.addXception(((TStruct)(yystack.valueAt (1-(1)))));
      }
    };
  break;
    

  case 34:
  if (yyn == 34)
    
/* Line 353 of lalr1.java  */
/* Line 468 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeDef . tok_typedef FieldType tok_identifier");
      TTypedef td = new TTypedef(C.c.program, ((TType)(yystack.valueAt (3-(2)))), ((Id)(yystack.valueAt (3-(3)))));
      yyval = td;
    };
  break;
    

  case 35:
  if (yyn == 35)
    
/* Line 353 of lalr1.java  */
/* Line 476 of "thrifty.jy"  */
    {};
  break;
    

  case 36:
  if (yyn == 36)
    
/* Line 353 of lalr1.java  */
/* Line 478 of "thrifty.jy"  */
    {};
  break;
    

  case 37:
  if (yyn == 37)
    
/* Line 353 of lalr1.java  */
/* Line 480 of "thrifty.jy"  */
    {};
  break;
    

  case 38:
  if (yyn == 38)
    
/* Line 353 of lalr1.java  */
/* Line 484 of "thrifty.jy"  */
    {
      C.c.pdebug("Enum . tok_enum tok_identifier { EnumDefList }");
      yyval = ((TEnum)(yystack.valueAt (5-(4))));
      TEnum tenum = (TEnum)yyval;
      tenum.setName(((Id)(yystack.valueAt (5-(2)))));
      tenum.resolveValues();
      // make constants for all the enum values
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        List<TEnumValue> enum_values = tenum.getConstants();
        for (TEnumValue value : enum_values) {
          Id const_name = new Id(tenum.getName() + "." + value.getName());
          TConstValue const_val = new TConstValue(value.getValue());
          const_val.setEnum(tenum);
          C.c.scope.addConstant(const_name, new TConst(C.c.typeI32, value.getName(), const_val));
          if (C.c.parentScope != null) {
            C.c.parentScope.addConstant(new Id(C.c.parentPrefix + const_name),
	        new TConst(C.c.typeI32, value.getName(), const_val));
          }
        }
      }
    };
  break;
    

  case 39:
  if (yyn == 39)
    
/* Line 353 of lalr1.java  */
/* Line 508 of "thrifty.jy"  */
    {
      C.c.pdebug("EnumDefList . EnumDefList EnumDef");
      yyval = ((TEnum)(yystack.valueAt (2-(1))));
      ((TEnum)yyval).append(((TEnumValue)(yystack.valueAt (2-(2)))));
    };
  break;
    

  case 40:
  if (yyn == 40)
    
/* Line 353 of lalr1.java  */
/* Line 514 of "thrifty.jy"  */
    {
      C.c.pdebug("EnumDefList . ");
      yyval = new TEnum(C.c.program);
    };
  break;
    

  case 41:
  if (yyn == 41)
    
/* Line 353 of lalr1.java  */
/* Line 521 of "thrifty.jy"  */
    {
      C.c.pdebug("EnumDef . tok_identifier = tok_int_constant");
      if (((IConst)(yystack.valueAt (5-(4)))).getLong() < 0) {
        C.c.pwarning(1, "Negative value supplied for enum "+((Id)(yystack.valueAt (5-(2))))+".\n");
      }
      if (((IConst)(yystack.valueAt (5-(4)))).getLong() > Integer.MAX_VALUE) {
        C.c.pwarning(1, "64-bit value supplied for enum "+((Id)(yystack.valueAt (5-(2))))+".\n");
      }
      yyval = new TEnumValue(((Id)(yystack.valueAt (5-(2)))), ((IConst)(yystack.valueAt (5-(4)))));
      if (((DText)(yystack.valueAt (5-(1)))) != null) {
        ((TEnumValue)yyval).setDoc(((DText)(yystack.valueAt (5-(1)))));
      }
    };
  break;
    

  case 42:
  if (yyn == 42)
    
/* Line 353 of lalr1.java  */
/* Line 536 of "thrifty.jy"  */
    {
      C.c.pdebug("EnumDef . tok_identifier");
      yyval = new TEnumValue(((Id)(yystack.valueAt (3-(2)))));
      if (((DText)(yystack.valueAt (3-(1)))) != null) {
        ((TEnumValue)yyval).setDoc(((DText)(yystack.valueAt (3-(1)))));
      }
    };
  break;
    

  case 43:
  if (yyn == 43)
    
/* Line 353 of lalr1.java  */
/* Line 546 of "thrifty.jy"  */
    {
      C.c.pdebug("Senum . tok_senum tok_identifier { SenumDefList }");
      yyval = new TTypedef(C.c.program, ((TBaseType)(yystack.valueAt (5-(4)))), ((Id)(yystack.valueAt (5-(2)))));
    };
  break;
    

  case 44:
  if (yyn == 44)
    
/* Line 353 of lalr1.java  */
/* Line 553 of "thrifty.jy"  */
    {
      C.c.pdebug("SenumDefList . SenumDefList SenumDef");
      yyval = ((TBaseType)(yystack.valueAt (2-(1))));
      ((TBaseType)yyval).addStringEnumVal(((Id)(yystack.valueAt (2-(2)))));
    };
  break;
    

  case 45:
  if (yyn == 45)
    
/* Line 353 of lalr1.java  */
/* Line 559 of "thrifty.jy"  */
    {
      C.c.pdebug("SenumDefList . ");
      yyval = new TBaseType(new Id("string"), TType.ConcreteType.STRING);
      ((TBaseType)yyval).setStringEnum(true);
    };
  break;
    

  case 46:
  if (yyn == 46)
    
/* Line 353 of lalr1.java  */
/* Line 567 of "thrifty.jy"  */
    {
      C.c.pdebug("SenumDef . tok_literal");
      yyval = ((Id)(yystack.valueAt (2-(1))));
    };
  break;
    

  case 47:
  if (yyn == 47)
    
/* Line 353 of lalr1.java  */
/* Line 574 of "thrifty.jy"  */
    {
      C.c.pdebug("Const . tok_const FieldType tok_identifier = ConstValue");
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        C.c.scope.resolveConstValue(((TConstValue)(yystack.valueAt (6-(5)))), ((TType)(yystack.valueAt (6-(2)))));
        yyval = new TConst(((TType)(yystack.valueAt (6-(2)))), ((Id)(yystack.valueAt (6-(3)))), ((TConstValue)(yystack.valueAt (6-(5)))));
        C.c.validateConstType(((TConst)yyval));

        C.c.scope.addConstant(((Id)(yystack.valueAt (6-(3)))), ((TConst)yyval));
        if (C.c.parentScope != null) {
          C.c.parentScope.addConstant(new Id(C.c.parentPrefix + ((Id)(yystack.valueAt (6-(3))))), ((TConst)yyval));
        }
      } else {
        yyval = null;
      }
    };
  break;
    

  case 48:
  if (yyn == 48)
    
/* Line 353 of lalr1.java  */
/* Line 592 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstValue => tok_int_constant");
      yyval = new TConstValue();
      ((TConstValue)yyval).setInteger(((IConst)(yystack.valueAt (1-(1)))));
      if (!C.c.allow64bitConsts && (((IConst)(yystack.valueAt (1-(1)))).getLong() < Integer.MIN_VALUE || ((IConst)(yystack.valueAt (1-(1)))).getLong() > Integer.MAX_VALUE)) {
        C.c.pwarning(1, "64-bit constant may not work in all languages.\n"+((IConst)(yystack.valueAt (1-(1)))));
      }
    };
  break;
    

  case 49:
  if (yyn == 49)
    
/* Line 353 of lalr1.java  */
/* Line 601 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstValue => tok_dub_constant");
      yyval = new TConstValue();
      ((TConstValue)yyval).setDouble(((DConst)(yystack.valueAt (1-(1)))));
    };
  break;
    

  case 50:
  if (yyn == 50)
    
/* Line 353 of lalr1.java  */
/* Line 607 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstValue => tok_literal");
      yyval = new TConstValue(((Id)(yystack.valueAt (1-(1)))).rawString());
    };
  break;
    

  case 51:
  if (yyn == 51)
    
/* Line 353 of lalr1.java  */
/* Line 612 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstValue => tok_identifier");
      yyval = new TConstValue();
      ((TConstValue)yyval).setIdentifier(((Id)(yystack.valueAt (1-(1)))));
    };
  break;
    

  case 52:
  if (yyn == 52)
    
/* Line 353 of lalr1.java  */
/* Line 618 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstValue => ConstList");
      yyval = ((TConstValue)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 53:
  if (yyn == 53)
    
/* Line 353 of lalr1.java  */
/* Line 623 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstValue => ConstMap");
      yyval = ((TConstValue)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 54:
  if (yyn == 54)
    
/* Line 353 of lalr1.java  */
/* Line 630 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstList => [ ConstListContents ]");
      yyval = ((TConstValue)(yystack.valueAt (3-(2))));
    };
  break;
    

  case 55:
  if (yyn == 55)
    
/* Line 353 of lalr1.java  */
/* Line 637 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstListContents => ConstListContents ConstValue CommaOrSemicolonOptional");
      yyval = ((TConstValue)(yystack.valueAt (3-(1))));
      ((TConstValue)yyval).addList(((TConstValue)(yystack.valueAt (3-(2)))));
    };
  break;
    

  case 56:
  if (yyn == 56)
    
/* Line 353 of lalr1.java  */
/* Line 643 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstListContents =>");
      yyval = new TConstValue();
      ((TConstValue)yyval).setList();
    };
  break;
    

  case 57:
  if (yyn == 57)
    
/* Line 353 of lalr1.java  */
/* Line 651 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstMap => { ConstMapContents }");
      yyval = ((TConstValue)(yystack.valueAt (3-(2))));
    };
  break;
    

  case 58:
  if (yyn == 58)
    
/* Line 353 of lalr1.java  */
/* Line 658 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstMapContents => ConstMapContents ConstValue CommaOrSemicolonOptional");
      yyval = ((TConstValue)(yystack.valueAt (5-(1))));
      ((TConstValue)yyval).addMap(((TConstValue)(yystack.valueAt (5-(2)))), ((TConstValue)(yystack.valueAt (5-(4)))));
    };
  break;
    

  case 59:
  if (yyn == 59)
    
/* Line 353 of lalr1.java  */
/* Line 664 of "thrifty.jy"  */
    {
      C.c.pdebug("ConstMapContents =>");
      yyval = new TConstValue();
      ((TConstValue)yyval).setMap();
    };
  break;
    

  case 60:
  if (yyn == 60)
    
/* Line 353 of lalr1.java  */
/* Line 672 of "thrifty.jy"  */
    {
      yyval = C.c.structIsStruct;
    };
  break;
    

  case 61:
  if (yyn == 61)
    
/* Line 353 of lalr1.java  */
/* Line 676 of "thrifty.jy"  */
    {
      yyval = C.c.structIsUnion;
    };
  break;
    

  case 62:
  if (yyn == 62)
    
/* Line 353 of lalr1.java  */
/* Line 682 of "thrifty.jy"  */
    {
      C.c.pdebug("Struct . tok_struct tok_identifier { FieldList }");
      ((TStruct)(yystack.valueAt (7-(5)))).setXsdAll(((TBool)(yystack.valueAt (7-(3)))).toBoolean());
      ((TStruct)(yystack.valueAt (7-(5)))).setUnion(((IConst)(yystack.valueAt (7-(1)))).getLong() == C.c.structIsUnion);
      yyval = ((TStruct)(yystack.valueAt (7-(5))));
      ((TStruct)yyval).setName(((Id)(yystack.valueAt (7-(2)))));
      if (((TType)(yystack.valueAt (7-(7)))) != null) {
        ((TStruct)yyval).getAnnotations().putAll(((TType)(yystack.valueAt (7-(7)))).getAnnotations());
      }
    };
  break;
    

  case 63:
  if (yyn == 63)
    
/* Line 353 of lalr1.java  */
/* Line 695 of "thrifty.jy"  */
    {
      yyval = true;
    };
  break;
    

  case 64:
  if (yyn == 64)
    
/* Line 353 of lalr1.java  */
/* Line 699 of "thrifty.jy"  */
    {
      yyval = false;
    };
  break;
    

  case 65:
  if (yyn == 65)
    
/* Line 353 of lalr1.java  */
/* Line 705 of "thrifty.jy"  */
    {
      yyval = true;
    };
  break;
    

  case 66:
  if (yyn == 66)
    
/* Line 353 of lalr1.java  */
/* Line 709 of "thrifty.jy"  */
    {
      yyval = false;
    };
  break;
    

  case 67:
  if (yyn == 67)
    
/* Line 353 of lalr1.java  */
/* Line 715 of "thrifty.jy"  */
    {
      yyval = true;
    };
  break;
    

  case 68:
  if (yyn == 68)
    
/* Line 353 of lalr1.java  */
/* Line 719 of "thrifty.jy"  */
    {
      yyval = false;
    };
  break;
    

  case 69:
  if (yyn == 69)
    
/* Line 353 of lalr1.java  */
/* Line 725 of "thrifty.jy"  */
    {
      yyval = ((TStruct)(yystack.valueAt (4-(3))));
    };
  break;
    

  case 70:
  if (yyn == 70)
    
/* Line 353 of lalr1.java  */
/* Line 729 of "thrifty.jy"  */
    {
      yyval = null;
    };
  break;
    

  case 71:
  if (yyn == 71)
    
/* Line 353 of lalr1.java  */
/* Line 735 of "thrifty.jy"  */
    {
      C.c.pdebug("Xception . tok_xception tok_identifier { FieldList }");
      ((TStruct)(yystack.valueAt (5-(4)))).setName(((Id)(yystack.valueAt (5-(2)))));
      ((TStruct)(yystack.valueAt (5-(4)))).setXception(true);
      yyval = ((TStruct)(yystack.valueAt (5-(4))));
    };
  break;
    

  case 72:
  if (yyn == 72)
    
/* Line 353 of lalr1.java  */
/* Line 744 of "thrifty.jy"  */
    {
      C.c.pdebug("Service . tok_service tok_identifier { FunctionList }");
      yyval = ((TService)(yystack.valueAt (8-(6))));
      ((TService)yyval).setName(((Id)(yystack.valueAt (8-(2)))));
      ((TService)yyval).setExtends(((TService)(yystack.valueAt (8-(3)))));
    };
  break;
    

  case 73:
  if (yyn == 73)
    
/* Line 353 of lalr1.java  */
/* Line 752 of "thrifty.jy"  */
    {
       C.c.arglist = 1;
    };
  break;
    

  case 74:
  if (yyn == 74)
    
/* Line 353 of lalr1.java  */
/* Line 757 of "thrifty.jy"  */
    {
       C.c.arglist = 0;
    };
  break;
    

  case 75:
  if (yyn == 75)
    
/* Line 353 of lalr1.java  */
/* Line 763 of "thrifty.jy"  */
    {
      C.c.pdebug("Extends . tok_extends tok_identifier");
      yyval = null;
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        yyval = C.c.scope.getService(((Id)(yystack.valueAt (2-(2)))));
        if (yyval == null) {
          yyerror("Service "+((Id)(yystack.valueAt (2-(2))))+" has not been defined.");
          System.exit(1);
        }
      }
    };
  break;
    

  case 76:
  if (yyn == 76)
    
/* Line 353 of lalr1.java  */
/* Line 775 of "thrifty.jy"  */
    {
      yyval = null;
    };
  break;
    

  case 77:
  if (yyn == 77)
    
/* Line 353 of lalr1.java  */
/* Line 781 of "thrifty.jy"  */
    {
      C.c.pdebug("FunctionList . FunctionList Function");
      yyval = ((TService)(yystack.valueAt (2-(1))));
      ((TService)(yystack.valueAt (2-(1)))).addFunction(((TFunction)(yystack.valueAt (2-(2)))));
    };
  break;
    

  case 78:
  if (yyn == 78)
    
/* Line 353 of lalr1.java  */
/* Line 787 of "thrifty.jy"  */
    {
      C.c.pdebug("FunctionList . ");
      yyval = new TService(C.c.program);
    };
  break;
    

  case 79:
  if (yyn == 79)
    
/* Line 353 of lalr1.java  */
/* Line 794 of "thrifty.jy"  */
    {
      ((TStruct)(yystack.valueAt (9-(6)))).setName(new Id(((Id)(yystack.valueAt (9-(4)))) + "_args"));
      yyval = new TFunction(((TType)(yystack.valueAt (9-(3)))), ((Id)(yystack.valueAt (9-(4)))), ((TStruct)(yystack.valueAt (9-(6)))), ((TStruct)(yystack.valueAt (9-(8)))), ((TBool)(yystack.valueAt (9-(2)))));
      if (((DText)(yystack.valueAt (9-(1)))) != null) {
        ((TFunction)yyval).setDoc(((DText)(yystack.valueAt (9-(1)))));
      }
    };
  break;
    

  case 80:
  if (yyn == 80)
    
/* Line 353 of lalr1.java  */
/* Line 804 of "thrifty.jy"  */
    {
      yyval = true;
    };
  break;
    

  case 81:
  if (yyn == 81)
    
/* Line 353 of lalr1.java  */
/* Line 808 of "thrifty.jy"  */
    {
      yyval = false;
    };
  break;
    

  case 82:
  if (yyn == 82)
    
/* Line 353 of lalr1.java  */
/* Line 814 of "thrifty.jy"  */
    {
      C.c.pdebug("Throws . tok_throws ( FieldList )");
      yyval = ((TStruct)(yystack.valueAt (4-(3))));
      if (C.c.parseMode == Context.ParseMode.PROGRAM && !C.c.validateThrows(((TStruct)yyval))) {
        yyerror("Throws clause may not contain non-exception types");
        System.exit(1);
      }
    };
  break;
    

  case 83:
  if (yyn == 83)
    
/* Line 353 of lalr1.java  */
/* Line 823 of "thrifty.jy"  */
    {
      yyval = new TStruct(C.c.program);
    };
  break;
    

  case 84:
  if (yyn == 84)
    
/* Line 353 of lalr1.java  */
/* Line 829 of "thrifty.jy"  */
    {
      C.c.pdebug("FieldList . FieldList , Field");
      yyval = ((TStruct)(yystack.valueAt (2-(1))));
      if (!(((TStruct)yyval).append(((TField)(yystack.valueAt (2-(2))))))) {
      	Long key = ((TField)(yystack.valueAt (2-(2)))).getKey().getLong();
	String name = ((TField)(yystack.valueAt (2-(2)))).getName().rawString();
        yyerror("Field identifier "+key+" for \""+name+"\" has already been used");
        System.exit(1);
      }
    };
  break;
    

  case 85:
  if (yyn == 85)
    
/* Line 353 of lalr1.java  */
/* Line 840 of "thrifty.jy"  */
    {
      C.c.pdebug("FieldList . ");
      C.c.fieldVal = -1;
      yyval = new TStruct(C.c.program);
    };
  break;
    

  case 86:
  if (yyn == 86)
    
/* Line 353 of lalr1.java  */
/* Line 848 of "thrifty.jy"  */
    {
      C.c.pdebug("tok_int_constant : Field . FieldType tok_identifier");
      if (((TFieldId)(yystack.valueAt (11-(2)))).isAutoAssigned()) {
        C.c.pwarning(1, "No field key specified for "+((Id)(yystack.valueAt (11-(5))))+", resulting protocol may have conflicts or not be backwards compatible!\n");
        if (C.c.strict >= 192) {
          yyerror("Implicit field keys are deprecated and not allowed with -strict");
          System.exit(1);
        }
      }
      yyval = new TField(((TType)(yystack.valueAt (11-(4)))), ((Id)(yystack.valueAt (11-(5)))), ((TFieldId)(yystack.valueAt (11-(2)))).getValue());
      ((TField)yyval).setMod(((TField.Mods)(yystack.valueAt (11-(3)))));
      if (((TConstValue)(yystack.valueAt (11-(6)))) != null) {
        C.c.scope.resolveConstValue(((TConstValue)(yystack.valueAt (11-(6)))), ((TType)(yystack.valueAt (11-(4)))));
        C.c.validateFieldValue(((TField)yyval), ((TConstValue)(yystack.valueAt (11-(6)))));
        ((TField)yyval).setValue(((TConstValue)(yystack.valueAt (11-(6)))));
      }
      ((TField)yyval).setXsdOptional(((TBool)(yystack.valueAt (11-(7)))));
      ((TField)yyval).setXsdNillable(((TBool)(yystack.valueAt (11-(8)))));
      if (((DText)(yystack.valueAt (11-(1)))) != null) {
        ((TField)yyval).setDoc(((DText)(yystack.valueAt (11-(1)))));
      }
      if (((TStruct)(yystack.valueAt (11-(9)))) != null) {
        ((TField)yyval).setXsdAttrs(((TStruct)(yystack.valueAt (11-(9)))));
      }
      if (((TType)(yystack.valueAt (11-(10)))) != null) {
        ((TField)yyval).getAnnotations().putAll(((TType)(yystack.valueAt (11-(10)))).getAnnotations());
      }
    };
  break;
    

  case 87:
  if (yyn == 87)
    
/* Line 353 of lalr1.java  */
/* Line 879 of "thrifty.jy"  */
    {
      if (((IConst)(yystack.valueAt (2-(1)))).getLong() <= 0) {
        if (C.c.allowNegFieldKeys) {
          /*
           * allowNegFieldKeys exists to allow users to add explicitly
           * specified key values to old .thrift files without breaking
           * protocol compatibility.
           */
          if (((IConst)(yystack.valueAt (2-(1)))).getLong() != C.c.fieldVal) {
            /*
             * warn if the user-specified negative value isn't what
             * thrift would have auto-assigned.
             */
            C.c.pwarning(1, "Negative field key ("+((IConst)(yystack.valueAt (2-(1))))+") differs from what would be "+
                     "auto-assigned by thrift ("+C.c.fieldVal+").\n");
          }
          /*
           * Leave $1 as-is, and update fieldVal to be one less than $1.
           * The FieldList parsing will catch any duplicate key values.
           */
          C.c.fieldVal = ((IConst)(yystack.valueAt (2-(1)))).getLong() - 1;
          ((IConst)yyval).setLong(((IConst)(yystack.valueAt (2-(1)))).getLong());
          ((IConst)yyval).setIsAutoAssigned(false);
        } else {
          C.c.pwarning(1, "Nonpositive value ("+((IConst)(yystack.valueAt (2-(1))))+") not allowed as a field key.\n");
          ((IConst)yyval).setLong(C.c.fieldVal--);
          ((IConst)yyval).setIsAutoAssigned(true);
        }
      } else {
        ((IConst)yyval).setLong(((IConst)(yystack.valueAt (2-(1)))).getLong());
        ((IConst)yyval).setIsAutoAssigned(false);
      }
    };
  break;
    

  case 88:
  if (yyn == 88)
    
/* Line 353 of lalr1.java  */
/* Line 913 of "thrifty.jy"  */
    {
      ((IConst)yyval).setLong(C.c.fieldVal--);
      ((IConst)yyval).setIsAutoAssigned(true);
    };
  break;
    

  case 89:
  if (yyn == 89)
    
/* Line 353 of lalr1.java  */
/* Line 920 of "thrifty.jy"  */
    {
      yyval = TField.Mods.REQUIRED;
    };
  break;
    

  case 90:
  if (yyn == 90)
    
/* Line 353 of lalr1.java  */
/* Line 924 of "thrifty.jy"  */
    {
      if (C.c.arglist != 0) {
        if (C.c.parseMode == Context.ParseMode.PROGRAM) {
          C.c.pwarning(1, "optional keyword is ignored in argument lists.\n");
        }
        yyval = TField.Mods.OPT_IN_REQ_OUT;
      } else {
        yyval = TField.Mods.OPTIONAL;
      }
    };
  break;
    

  case 91:
  if (yyn == 91)
    
/* Line 353 of lalr1.java  */
/* Line 935 of "thrifty.jy"  */
    {
      yyval = TField.Mods.OPT_IN_REQ_OUT;
    };
  break;
    

  case 92:
  if (yyn == 92)
    
/* Line 353 of lalr1.java  */
/* Line 941 of "thrifty.jy"  */
    {
      if (C.c.parseMode == Context.ParseMode.PROGRAM) {
        yyval = ((TConstValue)(yystack.valueAt (2-(2))));
      } else {
        yyval = null;
      }
    };
  break;
    

  case 93:
  if (yyn == 93)
    
/* Line 353 of lalr1.java  */
/* Line 949 of "thrifty.jy"  */
    {
      yyval = null;
    };
  break;
    

  case 94:
  if (yyn == 94)
    
/* Line 353 of lalr1.java  */
/* Line 955 of "thrifty.jy"  */
    {
      C.c.pdebug("FunctionType . FieldType");
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 95:
  if (yyn == 95)
    
/* Line 353 of lalr1.java  */
/* Line 960 of "thrifty.jy"  */
    {
      C.c.pdebug("FunctionType . tok_void");
      yyval = C.c.typeVoid;
    };
  break;
    

  case 96:
  if (yyn == 96)
    
/* Line 353 of lalr1.java  */
/* Line 967 of "thrifty.jy"  */
    {
      C.c.pdebug("FieldType . tok_identifier");
      if (C.c.parseMode == Context.ParseMode.INCLUDES) {
        // Ignore identifiers in include mode
        yyval = null;
      } else {
        // Lookup the identifier in the current scope
        yyval = C.c.scope.getType(((Id)(yystack.valueAt (1-(1)))));
        if (yyval == null) {
          yyerror("Type "+((Id)(yystack.valueAt (1-(1))))+" has not been defined.");
          System.exit(1);
        }
      }
    };
  break;
    

  case 97:
  if (yyn == 97)
    
/* Line 353 of lalr1.java  */
/* Line 982 of "thrifty.jy"  */
    {
      C.c.pdebug("FieldType . BaseType");
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 98:
  if (yyn == 98)
    
/* Line 353 of lalr1.java  */
/* Line 987 of "thrifty.jy"  */
    {
      C.c.pdebug("FieldType . ContainerType");
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 99:
  if (yyn == 99)
    
/* Line 353 of lalr1.java  */
/* Line 993 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . SimpleBaseType TypeAnnotations");
      if (((TType)(yystack.valueAt (2-(2)))) != null) {
        yyval = new TBaseType((TBaseType)(((TType)(yystack.valueAt (2-(1))))));
        ((TBaseType)yyval).getAnnotations().putAll(((TType)(yystack.valueAt (2-(2)))).getAnnotations());
      } else {
        yyval = ((TType)(yystack.valueAt (2-(1))));
      }
    };
  break;
    

  case 100:
  if (yyn == 100)
    
/* Line 353 of lalr1.java  */
/* Line 1005 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_string");
      yyval = C.c.typeString;
    };
  break;
    

  case 101:
  if (yyn == 101)
    
/* Line 353 of lalr1.java  */
/* Line 1010 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_binary");
      yyval = C.c.typeBinary;
    };
  break;
    

  case 102:
  if (yyn == 102)
    
/* Line 353 of lalr1.java  */
/* Line 1015 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_slist");
      yyval = C.c.typeSlist;
    };
  break;
    

  case 103:
  if (yyn == 103)
    
/* Line 353 of lalr1.java  */
/* Line 1020 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_bool");
      yyval = C.c.typeBool;
    };
  break;
    

  case 104:
  if (yyn == 104)
    
/* Line 353 of lalr1.java  */
/* Line 1025 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_byte");
      yyval = C.c.typeByte;
    };
  break;
    

  case 105:
  if (yyn == 105)
    
/* Line 353 of lalr1.java  */
/* Line 1030 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_i16");
      yyval = C.c.typeI16;
    };
  break;
    

  case 106:
  if (yyn == 106)
    
/* Line 353 of lalr1.java  */
/* Line 1035 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_i32");
      yyval = C.c.typeI32;
    };
  break;
    

  case 107:
  if (yyn == 107)
    
/* Line 353 of lalr1.java  */
/* Line 1040 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_i64");
      yyval = C.c.typeI64;
    };
  break;
    

  case 108:
  if (yyn == 108)
    
/* Line 353 of lalr1.java  */
/* Line 1045 of "thrifty.jy"  */
    {
      C.c.pdebug("BaseType . tok_double");
      yyval = C.c.typeDouble;
    };
  break;
    

  case 109:
  if (yyn == 109)
    
/* Line 353 of lalr1.java  */
/* Line 1051 of "thrifty.jy"  */
    {
      C.c.pdebug("ContainerType . SimpleContainerType TypeAnnotations");
      yyval = ((TType)(yystack.valueAt (2-(1))));
      if (((TType)(yystack.valueAt (2-(2)))) != null) {
        ((TContainer)yyval).getAnnotations().putAll(((TType)(yystack.valueAt (2-(2)))).getAnnotations());
      }
    };
  break;
    

  case 110:
  if (yyn == 110)
    
/* Line 353 of lalr1.java  */
/* Line 1061 of "thrifty.jy"  */
    {
      C.c.pdebug("SimpleContainerType . MapType");
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 111:
  if (yyn == 111)
    
/* Line 353 of lalr1.java  */
/* Line 1066 of "thrifty.jy"  */
    {
      C.c.pdebug("SimpleContainerType . SetType");
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 112:
  if (yyn == 112)
    
/* Line 353 of lalr1.java  */
/* Line 1071 of "thrifty.jy"  */
    {
      C.c.pdebug("SimpleContainerType . ListType");
      yyval = ((TType)(yystack.valueAt (1-(1))));
    };
  break;
    

  case 113:
  if (yyn == 113)
    
/* Line 353 of lalr1.java  */
/* Line 1078 of "thrifty.jy"  */
    {
      C.c.pdebug("MapType . tok_map <FieldType, FieldType>");
      yyval = new TMap(((TType)(yystack.valueAt (7-(4)))), ((TType)(yystack.valueAt (7-(6)))));
      if (((Id)(yystack.valueAt (7-(2)))) != null) {
        ((TContainer)yyval).setCppName(((Id)(yystack.valueAt (7-(2)))));
      }
    };
  break;
    

  case 114:
  if (yyn == 114)
    
/* Line 353 of lalr1.java  */
/* Line 1088 of "thrifty.jy"  */
    {
      C.c.pdebug("SetType . tok_set<FieldType>");
      yyval = new TSet(((TType)(yystack.valueAt (5-(4)))));
      if (((Id)(yystack.valueAt (5-(2)))) != null) {
        ((TContainer)yyval).setCppName(((Id)(yystack.valueAt (5-(2)))));
      }
    };
  break;
    

  case 115:
  if (yyn == 115)
    
/* Line 353 of lalr1.java  */
/* Line 1098 of "thrifty.jy"  */
    {
      C.c.pdebug("ListType . tok_list<FieldType>");
      yyval = new TList(((TType)(yystack.valueAt (5-(3)))));
      if (((Id)(yystack.valueAt (5-(5)))) != null) {
        ((TContainer)yyval).setCppName(((Id)(yystack.valueAt (5-(5)))));
      }
    };
  break;
    

  case 116:
  if (yyn == 116)
    
/* Line 353 of lalr1.java  */
/* Line 1108 of "thrifty.jy"  */
    {
      yyval = ((Id)(yystack.valueAt (2-(2))));
    };
  break;
    

  case 117:
  if (yyn == 117)
    
/* Line 353 of lalr1.java  */
/* Line 1112 of "thrifty.jy"  */
    {
      yyval = null;
    };
  break;
    

  case 118:
  if (yyn == 118)
    
/* Line 353 of lalr1.java  */
/* Line 1118 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeAnnotations . ( TypeAnnotationList )");
      yyval = ((TType)(yystack.valueAt (3-(2))));
    };
  break;
    

  case 119:
  if (yyn == 119)
    
/* Line 353 of lalr1.java  */
/* Line 1123 of "thrifty.jy"  */
    {
      yyval = null;
    };
  break;
    

  case 120:
  if (yyn == 120)
    
/* Line 353 of lalr1.java  */
/* Line 1129 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeAnnotationList . TypeAnnotationList , TypeAnnotation");
      yyval = ((TType)(yystack.valueAt (2-(1))));
      ((TType)yyval).getAnnotations().put(((TAnnotation)(yystack.valueAt (2-(2)))).getKey(), ((TAnnotation)(yystack.valueAt (2-(2)))).getValue());
    };
  break;
    

  case 121:
  if (yyn == 121)
    
/* Line 353 of lalr1.java  */
/* Line 1135 of "thrifty.jy"  */
    {
      /* Just use a dummy structure to hold the annotations. */
      yyval = new TStruct(C.c.program);
    };
  break;
    

  case 122:
  if (yyn == 122)
    
/* Line 353 of lalr1.java  */
/* Line 1142 of "thrifty.jy"  */
    {
      C.c.pdebug("TypeAnnotation . tok_identifier = tok_literal");
      yyval = new TAnnotation();
      ((TAnnotation)yyval).setKey(((Id)(yystack.valueAt (4-(1)))));
      ((TAnnotation)yyval).setValue(((Id)(yystack.valueAt (4-(3)))));
    };
  break;
    



/* Line 353 of lalr1.java  */
/* Line 2110 of "YYParser.java"  */
	default: break;
      }

    yy_symbol_print ("-> $$ =", yyr1_[yyn], yyval);

    yystack.pop (yylen);
    yylen = 0;

    /* Shift the result of the reduction.  */
    yyn = yyr1_[yyn];
    int yystate = yypgoto_[yyn - yyntokens_] + yystack.stateAt (0);
    if (0 <= yystate && yystate <= yylast_
	&& yycheck_[yystate] == yystack.stateAt (0))
      yystate = yytable_[yystate];
    else
      yystate = yydefgoto_[yyn - yyntokens_];

    yystack.push (yystate, yyval);
    return YYNEWSTATE;
  }

  /* Return YYSTR after stripping away unnecessary quotes and
     backslashes, so that it's suitable for yyerror.  The heuristic is
     that double-quoting is unnecessary unless the string contains an
     apostrophe, a comma, or backslash (other than backslash-backslash).
     YYSTR is taken from yytname.  */
  private final String yytnamerr_ (String yystr)
  {
    if (yystr.charAt (0) == '"')
      {
        StringBuffer yyr = new StringBuffer ();
        strip_quotes: for (int i = 1; i < yystr.length (); i++)
          switch (yystr.charAt (i))
            {
            case '\'':
            case ',':
              break strip_quotes;

            case '\\':
	      if (yystr.charAt(++i) != '\\')
                break strip_quotes;
              /* Fall through.  */
            default:
              yyr.append (yystr.charAt (i));
              break;

            case '"':
              return yyr.toString ();
            }
      }
    else if (yystr.equals ("$end"))
      return "end of input";

    return yystr;
  }

  /*--------------------------------.
  | Print this symbol on YYOUTPUT.  |
  `--------------------------------*/

  private void yy_symbol_print (String s, int yytype,
			         Object yyvaluep				 )
  {
    if (yydebug > 0)
    yycdebug (s + (yytype < yyntokens_ ? " token " : " nterm ")
	      + yytname_[yytype] + " ("
	      + (yyvaluep == null ? "(null)" : yyvaluep.toString ()) + ")");
  }

  /**
   * Parse input from the scanner that was specified at object construction
   * time.  Return whether the end of the input was reached successfully.
   *
   * @return <tt>true</tt> if the parsing succeeds.  Note that this does not
   *          imply that there were no syntax errors.
   */
  public boolean parse () throws java.io.IOException
  {
    /// Lookahead and lookahead in internal form.
    int yychar = yyempty_;
    int yytoken = 0;

    /* State.  */
    int yyn = 0;
    int yylen = 0;
    int yystate = 0;

    YYStack yystack = new YYStack ();

    /* Error handling.  */
    int yynerrs_ = 0;
    

    /// Semantic value of the lookahead.
    Object yylval = null;

    int yyresult;

    yycdebug ("Starting parse\n");
    yyerrstatus_ = 0;


    /* Initialize the stack.  */
    yystack.push (yystate, yylval);

    int label = YYNEWSTATE;
    for (;;)
      switch (label)
      {
        /* New state.  Unlike in the C/C++ skeletons, the state is already
	   pushed when we come here.  */
      case YYNEWSTATE:
        yycdebug ("Entering state " + yystate + "\n");
        if (yydebug > 0)
          yystack.print (yyDebugStream);
    
        /* Accept?  */
        if (yystate == yyfinal_)
          return true;
    
        /* Take a decision.  First try without lookahead.  */
        yyn = yypact_[yystate];
        if (yyn == yypact_ninf_)
          {
            label = YYDEFAULT;
	    break;
          }
    
        /* Read a lookahead token.  */
        if (yychar == yyempty_)
          {
	    yycdebug ("Reading a token: ");
	    yychar = yylex ();
            
            yylval = yylexer.getLVal ();
          }
    
        /* Convert token to internal form.  */
        if (yychar <= EOF)
          {
	    yychar = yytoken = EOF;
	    yycdebug ("Now at end of input.\n");
          }
        else
          {
	    yytoken = yytranslate_ (yychar);
	    yy_symbol_print ("Next token is", yytoken,
	    		     yylval);
          }
    
        /* If the proper action on seeing token YYTOKEN is to reduce or to
           detect an error, take that action.  */
        yyn += yytoken;
        if (yyn < 0 || yylast_ < yyn || yycheck_[yyn] != yytoken)
          label = YYDEFAULT;
    
        /* <= 0 means reduce or error.  */
        else if ((yyn = yytable_[yyn]) <= 0)
          {
	    if (yyn == 0 || yyn == yytable_ninf_)
	      label = YYFAIL;
	    else
	      {
	        yyn = -yyn;
	        label = YYREDUCE;
	      }
          }
    
        else
          {
            /* Shift the lookahead token.  */
	    yy_symbol_print ("Shifting", yytoken,
	    		     yylval);
    
            /* Discard the token being shifted.  */
            yychar = yyempty_;
    
            /* Count tokens shifted since error; after three, turn off error
               status.  */
            if (yyerrstatus_ > 0)
              --yyerrstatus_;
    
            yystate = yyn;
            yystack.push (yystate, yylval);
            label = YYNEWSTATE;
          }
        break;
    
      /*-----------------------------------------------------------.
      | yydefault -- do the default action for the current state.  |
      `-----------------------------------------------------------*/
      case YYDEFAULT:
        yyn = yydefact_[yystate];
        if (yyn == 0)
          label = YYFAIL;
        else
          label = YYREDUCE;
        break;
    
      /*-----------------------------.
      | yyreduce -- Do a reduction.  |
      `-----------------------------*/
      case YYREDUCE:
        yylen = yyr2_[yyn];
        label = yyaction (yyn, yystack, yylen);
	yystate = yystack.stateAt (0);
        break;
    
      /*------------------------------------.
      | yyerrlab -- here on detecting error |
      `------------------------------------*/
      case YYFAIL:
        /* If not already recovering from an error, report this error.  */
        if (yyerrstatus_ == 0)
          {
	    ++yynerrs_;
	    yyerror (yysyntax_error (yystate, yytoken));
          }
    
        
        if (yyerrstatus_ == 3)
          {
	    /* If just tried and failed to reuse lookahead token after an
	     error, discard it.  */
    
	    if (yychar <= EOF)
	      {
	      /* Return failure if at end of input.  */
	      if (yychar == EOF)
	        return false;
	      }
	    else
	      yychar = yyempty_;
          }
    
        /* Else will try to reuse lookahead token after shifting the error
           token.  */
        label = YYERRLAB1;
        break;
    
      /*---------------------------------------------------.
      | errorlab -- error raised explicitly by YYERROR.  |
      `---------------------------------------------------*/
      case YYERROR:
    
        
        /* Do not reclaim the symbols of the rule which action triggered
           this YYERROR.  */
        yystack.pop (yylen);
        yylen = 0;
        yystate = yystack.stateAt (0);
        label = YYERRLAB1;
        break;
    
      /*-------------------------------------------------------------.
      | yyerrlab1 -- common code for both syntax error and YYERROR.  |
      `-------------------------------------------------------------*/
      case YYERRLAB1:
        yyerrstatus_ = 3;	/* Each real token shifted decrements this.  */
    
        for (;;)
          {
	    yyn = yypact_[yystate];
	    if (yyn != yypact_ninf_)
	      {
	        yyn += yyterror_;
	        if (0 <= yyn && yyn <= yylast_ && yycheck_[yyn] == yyterror_)
	          {
	            yyn = yytable_[yyn];
	            if (0 < yyn)
		      break;
	          }
	      }
    
	    /* Pop the current state because it cannot handle the error token.  */
	    if (yystack.height == 1)
	      return false;
    
	    
	    yystack.pop ();
	    yystate = yystack.stateAt (0);
	    if (yydebug > 0)
	      yystack.print (yyDebugStream);
          }
    
	

        /* Shift the error token.  */
        yy_symbol_print ("Shifting", yystos_[yyn],
			 yylval);
    
        yystate = yyn;
	yystack.push (yyn, yylval);
        label = YYNEWSTATE;
        break;
    
        /* Accept.  */
      case YYACCEPT:
        return true;
    
        /* Abort.  */
      case YYABORT:
        return false;
      }
  }

  // Generate an error message.
  private String yysyntax_error (int yystate, int tok)
  {
    if (errorVerbose)
      {
        int yyn = yypact_[yystate];
        if (yypact_ninf_ < yyn && yyn <= yylast_)
          {
	    StringBuffer res;

	    /* Start YYX at -YYN if negative to avoid negative indexes in
	       YYCHECK.  */
	    int yyxbegin = yyn < 0 ? -yyn : 0;

	    /* Stay within bounds of both yycheck and yytname.  */
	    int yychecklim = yylast_ - yyn + 1;
	    int yyxend = yychecklim < yyntokens_ ? yychecklim : yyntokens_;
	    int count = 0;
	    for (int x = yyxbegin; x < yyxend; ++x)
	      if (yycheck_[x + yyn] == x && x != yyterror_)
	        ++count;

	    // FIXME: This method of building the message is not compatible
	    // with internationalization.
	    res = new StringBuffer ("syntax error, unexpected ");
	    res.append (yytnamerr_ (yytname_[tok]));
	    if (count < 5)
	      {
	        count = 0;
	        for (int x = yyxbegin; x < yyxend; ++x)
	          if (yycheck_[x + yyn] == x && x != yyterror_)
		    {
		      res.append (count++ == 0 ? ", expecting " : " or ");
		      res.append (yytnamerr_ (yytname_[x]));
		    }
	      }
	    return res.toString ();
          }
      }

    return "syntax error";
  }


  /* YYPACT[STATE-NUM] -- Index in YYTABLE of the portion describing
     STATE-NUM.  */
  private static final short yypact_ninf_ = -133;
  private static final short yypact_[] =
  {
      -133,    16,    43,  -133,   123,    21,     8,    12,    25,    20,
      34,    39,    48,    49,    52,    50,    51,    55,    56,    70,
      73,  -133,  -133,   -15,  -133,    78,    81,  -133,  -133,  -133,
    -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,
      82,    88,  -133,    83,    92,    95,    88,  -133,  -133,  -133,
    -133,  -133,  -133,  -133,    97,  -133,  -133,  -133,  -133,  -133,
      57,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,
    -133,   104,    75,   104,   133,  -133,    79,  -133,    79,  -133,
    -133,  -133,    84,   105,    94,   151,   137,  -133,   152,    91,
      88,    93,  -133,  -133,  -133,  -133,  -133,   155,   102,  -133,
     101,  -133,   106,     4,  -133,    88,    96,    88,     1,   103,
    -133,  -133,   107,    19,  -133,   -24,  -133,  -133,   109,   104,
     100,   108,  -133,  -133,  -133,   162,  -133,  -133,  -133,   167,
    -133,  -133,  -133,  -133,  -133,  -133,  -133,   -24,  -133,  -133,
     112,  -133,  -133,  -133,    88,  -133,  -133,   168,   110,    -3,
     115,   -16,    10,     3,  -133,    79,   111,   -24,  -133,  -133,
    -133,    88,   132,   117,  -133,   170,  -133,  -133,   116,  -133,
     -24,  -133,  -133,  -133,   177,  -133,    72,  -133,   -24,    19,
    -133,   121,  -133,   179,  -133,  -133,   -24,    19,   164,   120,
    -133,  -133,  -133,   165,  -133,  -133,   166,   122,   128,    79,
     142,  -133,   -24,   126,   -24,   134,  -133,  -133,  -133,  -133,
     127,  -133
  };

  /* YYDEFACT[S] -- default rule to reduce with in state S when YYTABLE
     doesn't specify something else to do.  Zero means the default is an
     error.  */
  private static final byte yydefact_[] =
  {
         6,     0,     4,     1,     0,     3,     0,     0,     0,     0,
       0,     0,     0,     0,     0,     0,     0,     0,     0,     0,
       0,     5,     7,     0,    23,     0,     0,    10,    11,    12,
      13,    14,    18,    20,    15,    16,    17,    19,    21,    22,
       0,     0,    60,     0,     0,     0,     0,    61,    24,    27,
      29,    30,    31,    26,     0,    32,    33,    28,     8,     9,
       0,    96,   103,   104,   100,   101,   102,   105,   106,   107,
     108,   117,     0,   117,     0,    97,   119,    98,   119,   110,
     111,   112,     0,    76,     0,     0,    64,    45,     0,     0,
       0,     0,    34,   121,    99,   109,    85,     0,     0,    40,
       0,    63,     0,     0,   116,     0,     0,     0,     0,     3,
      75,    73,     3,     0,    85,    37,    43,    44,     0,   117,
       0,     0,   118,   120,    71,    88,    84,    78,    38,     0,
      39,    51,    50,    48,    49,    59,    56,    37,    52,    53,
       3,    35,    36,    46,     0,   115,   114,     0,     0,    91,
       3,    37,     0,     0,    47,   119,     0,    37,    87,    89,
      90,     0,    81,     0,    77,     0,    42,    57,     0,    54,
      37,    62,   113,   122,     0,    80,     0,    72,    37,     0,
      55,    93,    95,     0,    94,    41,    37,     0,    66,     0,
      58,    92,    65,    68,    85,    67,    70,     3,     0,   119,
      83,    85,    37,     0,    37,     3,    86,    85,    79,    69,
       3,    82
  };

  /* YYPGOTO[NTERM-NUM].  */
  private static final short yypgoto_[] =
  {
      -133,  -133,    -5,  -133,  -133,  -133,  -133,  -133,  -133,  -133,
    -133,  -132,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -105,
    -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,
    -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -133,  -111,
    -133,  -133,  -133,  -133,  -133,   -45,  -133,  -133,  -133,  -133,
    -133,  -133,  -133,   -64,   -76,  -133,  -133
  };

  /* YYDEFGOTO[NTERM-NUM].  */
  private static final short
  yydefgoto_[] =
  {
        -1,     1,   125,     4,     2,    21,    22,     5,    48,    49,
      50,   143,    51,   112,   130,    52,   103,   117,    53,   137,
     138,   153,   139,   152,    54,    55,   102,   193,   196,   199,
      56,    57,   127,   163,    98,   150,   164,   176,   204,   109,
     126,   149,   161,   188,   183,    74,    75,    76,    77,    78,
      79,    80,    81,    89,    94,   108,   123
  };

  /* YYTABLE[YYPACT[STATE-NUM]].  What to do in state STATE-NUM.  If
     positive, shift that token.  If negative, reduce the rule which
     number is the opposite.  If zero, do what YYDEFACT says.  */
  private static final short yytable_ninf_ = -75;
  private static final short
  yytable_[] =
  {
        23,    85,    95,   140,   121,   154,   131,   132,   115,    91,
     133,   134,    24,   131,   132,    25,     3,   133,   134,   166,
      40,    -2,   131,   132,    28,   173,   133,   134,    27,    41,
      42,    43,   141,   142,    44,    45,    46,    29,   180,    47,
     141,   142,    30,   -25,   165,   106,   185,   168,   170,   159,
     160,    31,    32,    34,   190,   145,    33,    35,    36,    37,
     118,   135,   120,   116,   136,   169,   122,    26,   135,   167,
     206,   136,   208,    38,   186,    61,    39,   135,   -25,   171,
     136,    58,   191,   197,    59,    60,    82,   -25,   -25,   -25,
     205,    61,   -25,   -25,   -25,    83,   210,   -25,    84,   156,
      86,   182,    62,    63,    64,    65,    66,   129,    67,    68,
      69,    70,    71,    72,    73,    87,   174,    88,    62,    63,
      64,    65,    66,   202,    67,    68,    69,    70,    71,    72,
      73,   184,     6,     7,     8,     9,    92,    10,    11,    12,
      13,    90,    96,    93,    14,   162,    15,    16,    17,    18,
      19,    20,    99,    97,   100,   101,   104,   105,   110,   107,
     111,   113,   124,   119,   114,   144,   128,   146,   147,   148,
     151,   155,   157,   158,   -74,   175,   177,   178,   172,   179,
     181,   187,   189,   192,   194,   195,   201,   200,   198,   203,
     207,     0,   211,   209
  };

  /* YYCHECK.  */
  private static final short
  yycheck_[] =
  {
         5,    46,    78,   114,     3,   137,     3,     4,     4,    73,
       7,     8,     4,     3,     4,     3,     0,     7,     8,   151,
      35,     0,     3,     4,     4,   157,     7,     8,     3,    44,
      45,    46,    56,    57,    49,    50,    51,     3,   170,    54,
      56,    57,     3,     0,    60,    90,   178,   152,   153,    52,
      53,     3,     3,     3,   186,   119,     4,     6,     3,     3,
     105,    58,   107,    59,    61,    62,    65,    55,    58,    59,
     202,    61,   204,     3,   179,     3,     3,    58,    35,   155,
      61,     3,   187,   194,     3,     3,     3,    44,    45,    46,
     201,     3,    49,    50,    51,     3,   207,    54,     3,   144,
       3,    29,    30,    31,    32,    33,    34,   112,    36,    37,
      38,    39,    40,    41,    42,    58,   161,    13,    30,    31,
      32,    33,    34,   199,    36,    37,    38,    39,    40,    41,
      42,   176,     9,    10,    11,    12,     3,    14,    15,    16,
      17,    66,    58,    64,    21,   150,    23,    24,    25,    26,
      27,    28,    58,    48,     3,    18,     4,    66,     3,    66,
      58,    60,    59,    67,    58,    56,    59,    67,    60,     7,
       3,    59,     4,    63,    59,    43,    59,     7,    67,    63,
       3,    60,     3,    19,    64,    20,    58,    65,    22,    47,
      64,    -1,    65,    59
  };

  /* STOS_[STATE-NUM] -- The (internal number of the) accessing
     symbol of state STATE-NUM.  */
  private static final byte
  yystos_[] =
  {
         0,    69,    72,     0,    71,    75,     9,    10,    11,    12,
      14,    15,    16,    17,    21,    23,    24,    25,    26,    27,
      28,    73,    74,    70,     4,     3,    55,     3,     4,     3,
       3,     3,     3,     4,     3,     6,     3,     3,     3,     3,
      35,    44,    45,    46,    49,    50,    51,    54,    76,    77,
      78,    80,    83,    86,    92,    93,    98,    99,     3,     3,
       3,     3,    30,    31,    32,    33,    34,    36,    37,    38,
      39,    40,    41,    42,   113,   114,   115,   116,   117,   118,
     119,   120,     3,     3,     3,   113,     3,    58,    13,   121,
      66,   121,     3,    64,   122,   122,    58,    48,   102,    58,
       3,    18,    94,    84,     4,    66,   113,    66,   123,   107,
       3,    58,    81,    60,    58,     4,    59,    85,   113,    67,
     113,     3,    65,   124,    59,    70,   108,   100,    59,    70,
      82,     3,     4,     7,     8,    58,    61,    87,    88,    90,
     107,    56,    57,    79,    56,   121,    67,    60,     7,   109,
     103,     3,    91,    89,    79,    59,   113,     4,    63,    52,
      53,   110,    70,   101,   104,    60,    79,    59,    87,    62,
      87,   122,    67,    79,   113,    43,   105,    59,     7,    63,
      79,     3,    29,   112,   113,    79,    87,    60,   111,     3,
      79,    87,    19,    95,    64,    20,    96,   107,    22,    97,
      65,    58,   122,    47,   106,   107,    79,    64,    79,    59,
     107,    65
  };

  /* TOKEN_NUMBER_[YYLEX-NUM] -- Internal symbol number corresponding
     to YYLEX-NUM.  */
  private static final short
  yytoken_number_[] =
  {
         0,   256,   257,   258,   259,   260,   261,   262,   263,   264,
     265,   266,   267,   268,   269,   270,   271,   272,   273,   274,
     275,   276,   277,   278,   279,   280,   281,   282,   283,   284,
     285,   286,   287,   288,   289,   290,   291,   292,   293,   294,
     295,   296,   297,   298,   299,   300,   301,   302,   303,   304,
     305,   306,   307,   308,   309,    42,    44,    59,   123,   125,
      61,    91,    93,    58,    40,    41,    60,    62
  };

  /* YYR1[YYN] -- Symbol number of symbol that rule YYN derives.  */
  private static final byte
  yyr1_[] =
  {
         0,    68,    69,    70,    71,    72,    72,    73,    73,    73,
      73,    73,    73,    73,    73,    73,    73,    73,    73,    73,
      73,    73,    73,    74,    75,    75,    76,    76,    76,    77,
      77,    77,    77,    77,    78,    79,    79,    79,    80,    81,
      81,    82,    82,    83,    84,    84,    85,    86,    87,    87,
      87,    87,    87,    87,    88,    89,    89,    90,    91,    91,
      92,    92,    93,    94,    94,    95,    95,    96,    96,    97,
      97,    98,    99,   100,   101,   102,   102,   103,   103,   104,
     105,   105,   106,   106,   107,   107,   108,   109,   109,   110,
     110,   110,   111,   111,   112,   112,   113,   113,   113,   114,
     115,   115,   115,   115,   115,   115,   115,   115,   115,   116,
     117,   117,   117,   118,   119,   120,   121,   121,   122,   122,
     123,   123,   124
  };

  /* YYR2[YYN] -- Number of symbols composing right hand side of rule YYN.  */
  private static final byte
  yyr2_[] =
  {
         0,     2,     2,     0,     0,     3,     0,     1,     3,     3,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     3,     0,     1,     1,     1,     1,
       1,     1,     1,     1,     3,     1,     1,     0,     5,     2,
       0,     5,     3,     5,     2,     0,     2,     6,     1,     1,
       1,     1,     1,     1,     3,     3,     0,     3,     5,     0,
       1,     1,     7,     1,     0,     1,     0,     1,     0,     4,
       0,     5,     8,     0,     0,     2,     0,     2,     0,     9,
       1,     0,     4,     0,     2,     0,    11,     2,     0,     1,
       1,     0,     2,     0,     1,     1,     1,     1,     1,     2,
       1,     1,     1,     1,     1,     1,     1,     1,     1,     2,
       1,     1,     1,     7,     5,     5,     2,     0,     3,     0,
       2,     0,     4
  };

  /* YYTNAME[SYMBOL-NUM] -- String name of the symbol SYMBOL-NUM.
     First, the terminals, then, starting at \a yyntokens_, nonterminals.  */
  private static final String yytname_[] =
  {
    "$end", "error", "$undefined", "tok_identifier", "tok_literal",
  "tok_doctext", "tok_st_identifier", "tok_int_constant",
  "tok_dub_constant", "tok_include", "tok_namespace", "tok_cpp_namespace",
  "tok_cpp_include", "tok_cpp_type", "tok_php_namespace", "tok_py_module",
  "tok_perl_package", "tok_java_package", "tok_xsd_all",
  "tok_xsd_optional", "tok_xsd_nillable", "tok_xsd_namespace",
  "tok_xsd_attrs", "tok_ruby_namespace", "tok_smalltalk_category",
  "tok_smalltalk_prefix", "tok_cocoa_prefix", "tok_csharp_namespace",
  "tok_delphi_namespace", "tok_void", "tok_bool", "tok_byte", "tok_string",
  "tok_binary", "tok_slist", "tok_senum", "tok_i16", "tok_i32", "tok_i64",
  "tok_double", "tok_map", "tok_list", "tok_set", "tok_oneway",
  "tok_typedef", "tok_struct", "tok_xception", "tok_throws", "tok_extends",
  "tok_service", "tok_enum", "tok_const", "tok_required", "tok_optional",
  "tok_union", "'*'", "','", "';'", "'{'", "'}'", "'='", "'['", "']'",
  "':'", "'('", "')'", "'<'", "'>'", "$accept", "Program",
  "CaptureDocText", "DestroyDocText", "HeaderList", "Header", "Include",
  "DefinitionList", "Definition", "TypeDefinition", "Typedef",
  "CommaOrSemicolonOptional", "Enum", "EnumDefList", "EnumDef", "Senum",
  "SenumDefList", "SenumDef", "Const", "ConstValue", "ConstList",
  "ConstListContents", "ConstMap", "ConstMapContents", "StructHead",
  "Struct", "XsdAll", "XsdOptional", "XsdNillable", "XsdAttributes",
  "Xception", "Service", "FlagArgs", "UnflagArgs", "Extends",
  "FunctionList", "Function", "Oneway", "Throws", "FieldList", "Field",
  "FieldIdentifier", "FieldRequiredness", "FieldValue", "FunctionType",
  "FieldType", "BaseType", "SimpleBaseType", "ContainerType",
  "SimpleContainerType", "MapType", "SetType", "ListType", "CppType",
  "TypeAnnotations", "TypeAnnotationList", "TypeAnnotation", null
  };

  /* YYRHS -- A `-1'-separated list of the rules' RHS.  */
  private static final byte yyrhs_[] =
  {
        69,     0,    -1,    72,    75,    -1,    -1,    -1,    72,    71,
      73,    -1,    -1,    74,    -1,    10,     3,     3,    -1,    10,
      55,     3,    -1,    11,     3,    -1,    12,     4,    -1,    14,
       3,    -1,    15,     3,    -1,    16,     3,    -1,    23,     3,
      -1,    24,     6,    -1,    25,     3,    -1,    17,     3,    -1,
      26,     3,    -1,    21,     4,    -1,    27,     3,    -1,    28,
       3,    -1,     9,     4,    -1,    75,    70,    76,    -1,    -1,
      86,    -1,    77,    -1,    99,    -1,    78,    -1,    80,    -1,
      83,    -1,    93,    -1,    98,    -1,    44,   113,     3,    -1,
      56,    -1,    57,    -1,    -1,    50,     3,    58,    81,    59,
      -1,    81,    82,    -1,    -1,    70,     3,    60,     7,    79,
      -1,    70,     3,    79,    -1,    35,     3,    58,    84,    59,
      -1,    84,    85,    -1,    -1,     4,    79,    -1,    51,   113,
       3,    60,    87,    79,    -1,     7,    -1,     8,    -1,     4,
      -1,     3,    -1,    88,    -1,    90,    -1,    61,    89,    62,
      -1,    89,    87,    79,    -1,    -1,    58,    91,    59,    -1,
      91,    87,    63,    87,    79,    -1,    -1,    45,    -1,    54,
      -1,    92,     3,    94,    58,   107,    59,   122,    -1,    18,
      -1,    -1,    19,    -1,    -1,    20,    -1,    -1,    22,    58,
     107,    59,    -1,    -1,    46,     3,    58,   107,    59,    -1,
      49,     3,   102,    58,   100,   103,   101,    59,    -1,    -1,
      -1,    48,     3,    -1,    -1,   103,   104,    -1,    -1,    70,
     105,   112,     3,    64,   107,    65,   106,    79,    -1,    43,
      -1,    -1,    47,    64,   107,    65,    -1,    -1,   107,   108,
      -1,    -1,    70,   109,   110,   113,     3,   111,    95,    96,
      97,   122,    79,    -1,     7,    63,    -1,    -1,    52,    -1,
      53,    -1,    -1,    60,    87,    -1,    -1,   113,    -1,    29,
      -1,     3,    -1,   114,    -1,   116,    -1,   115,   122,    -1,
      32,    -1,    33,    -1,    34,    -1,    30,    -1,    31,    -1,
      36,    -1,    37,    -1,    38,    -1,    39,    -1,   117,   122,
      -1,   118,    -1,   119,    -1,   120,    -1,    40,   121,    66,
     113,    56,   113,    67,    -1,    42,   121,    66,   113,    67,
      -1,    41,    66,   113,    67,   121,    -1,    13,     4,    -1,
      -1,    64,   123,    65,    -1,    -1,   123,   124,    -1,    -1,
       3,    60,     4,    79,    -1
  };

  /* YYPRHS[YYN] -- Index of the first RHS symbol of rule number YYN in
     YYRHS.  */
  private static final short yyprhs_[] =
  {
         0,     0,     3,     6,     7,     8,    12,    13,    15,    19,
      23,    26,    29,    32,    35,    38,    41,    44,    47,    50,
      53,    56,    59,    62,    65,    69,    70,    72,    74,    76,
      78,    80,    82,    84,    86,    90,    92,    94,    95,   101,
     104,   105,   111,   115,   121,   124,   125,   128,   135,   137,
     139,   141,   143,   145,   147,   151,   155,   156,   160,   166,
     167,   169,   171,   179,   181,   182,   184,   185,   187,   188,
     193,   194,   200,   209,   210,   211,   214,   215,   218,   219,
     229,   231,   232,   237,   238,   241,   242,   254,   257,   258,
     260,   262,   263,   266,   267,   269,   271,   273,   275,   277,
     280,   282,   284,   286,   288,   290,   292,   294,   296,   298,
     301,   303,   305,   307,   315,   321,   327,   330,   331,   335,
     336,   339,   340
  };

  /* YYRLINE[YYN] -- Source line where rule number YYN was defined.  */
  private static final short yyrline_[] =
  {
         0,   195,   195,   208,   219,   228,   233,   238,   242,   249,
     257,   265,   272,   281,   290,   299,   308,   317,   326,   335,
     344,   353,   362,   372,   384,   392,   397,   405,   416,   430,
     437,   444,   451,   458,   467,   475,   477,   480,   483,   507,
     514,   520,   535,   545,   552,   559,   566,   573,   591,   600,
     606,   611,   617,   622,   629,   636,   643,   650,   657,   664,
     671,   675,   681,   694,   699,   704,   709,   714,   719,   724,
     729,   734,   743,   752,   757,   762,   775,   780,   787,   793,
     803,   808,   813,   823,   828,   840,   847,   878,   913,   919,
     923,   935,   940,   949,   954,   959,   966,   981,   986,   992,
    1004,  1009,  1014,  1019,  1024,  1029,  1034,  1039,  1044,  1050,
    1060,  1065,  1070,  1077,  1087,  1097,  1107,  1112,  1117,  1123,
    1128,  1135,  1141
  };

  // Report on the debug stream that the rule yyrule is going to be reduced.
  private void yy_reduce_print (int yyrule, YYStack yystack)
  {
    if (yydebug == 0)
      return;

    int yylno = yyrline_[yyrule];
    int yynrhs = yyr2_[yyrule];
    /* Print the symbols being reduced, and their result.  */
    yycdebug ("Reducing stack by rule " + (yyrule - 1)
	      + " (line " + yylno + "), ");

    /* The symbols being reduced.  */
    for (int yyi = 0; yyi < yynrhs; yyi++)
      yy_symbol_print ("   $" + (yyi + 1) + " =",
		       yyrhs_[yyprhs_[yyrule] + yyi],
		       ((yystack.valueAt (yynrhs-(yyi + 1)))));
  }

  /* YYTRANSLATE(YYLEX) -- Bison symbol number corresponding to YYLEX.  */
  private static final byte yytranslate_table_[] =
  {
         0,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
      64,    65,    55,     2,    56,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,    63,    57,
      66,    60,    67,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,    61,     2,    62,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,    58,     2,    59,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     2,     2,     2,     2,
       2,     2,     2,     2,     2,     2,     1,     2,     3,     4,
       5,     6,     7,     8,     9,    10,    11,    12,    13,    14,
      15,    16,    17,    18,    19,    20,    21,    22,    23,    24,
      25,    26,    27,    28,    29,    30,    31,    32,    33,    34,
      35,    36,    37,    38,    39,    40,    41,    42,    43,    44,
      45,    46,    47,    48,    49,    50,    51,    52,    53,    54
  };

  private static final byte yytranslate_ (int t)
  {
    if (t >= 0 && t <= yyuser_token_number_max_)
      return yytranslate_table_[t];
    else
      return yyundef_token_;
  }

  private static final int yylast_ = 193;
  private static final int yynnts_ = 57;
  private static final int yyempty_ = -2;
  private static final int yyfinal_ = 3;
  private static final int yyterror_ = 1;
  private static final int yyerrcode_ = 256;
  private static final int yyntokens_ = 68;

  private static final int yyuser_token_number_max_ = 309;
  private static final int yyundef_token_ = 2;

/* User implementation code.  */

}


/* Line 879 of lalr1.java  */
/* Line 1149 of "thrifty.jy"  */



