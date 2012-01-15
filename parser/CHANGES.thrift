Thrift Changelog

Version 0.8.0

THRIFT-1330   PHP                  PHP Namespaces no longer generated
THRIFT-1392   PHP                  Enabling both namespaces and autoloading in generated PHP code won't work.
THRIFT-386    Python               Make it possible to build the Python library without the extension
THRIFT-1431   Node.js              Rename 'sys' module to 'util'
THRIFT-1435   Delphi               make TException.Message property conformant to the usual expectations
THRIFT-1432   JavaScript           Javascript struct constants declared in the same file as their struct cause an error
THRIFT-1391   Delphi               Improved Delphi XE test cases
THRIFT-1387   C++                  Build MSVC libraries with Boost Threads instead of Pthreads
THRIFT-1426   Build Process        Dist package missing files for release 0.8
THRIFT-1428   Tutorial             shared.thrft does not include namespace for php, compiler generate incorrect name
THRIFT-1411   Java                 java generator does not provide type parameter for TBaseProcessor
THRIFT-1425   Node.js              The Node package is incompatible with latest node (0.6) & npm (1.0.27)
THRIFT-1401   Delphi               JSON-protocol for Delphi XE Libraries
THRIFT-1424   Ruby                 Ruby specs fail when run with rake
THRIFT-1382   Ruby                 Bundle install doesnot work because thrift crashes
THRIFT-1251   Java                 Generated java code should indicate which fields are required and which are optional
THRIFT-1361   C++                  Optional replacement of pthread by boost::thread
THRIFT-1415   Delphi               delphi: add version Info to the library
THRIFT-1031   C++                  Patch to compile Thrift for vc++ 9.0 and 10.0
THRIFT-1420   Java                 Nonblocking and HsHa server should close all socket connections when the selector exits
THRIFT-1419   Java                 AbstractNonBlockingServer does not catch errors when invoking the processor
THRIFT-1416   Python               Python Unit test is broken on ci
THRIFT-1409   Delphi               Name conflict check does not work properly for exception object(Delphi).
THRIFT-1413   Delphi               Generated code does not read MapEnd / ListEnd / SetEnd
THRIFT-1408   Delphi               Delphi Test Server: Exception test case fails due to naming conflict with e.message
THRIFT-1407   Python               Typo in Python socket server causes Thrift to fail when we enable a global socket timout
THRIFT-1405   Delphi               Delphi compiler does not generates container serializer properly.
THRIFT-1399   Delphi               One of the TServerImpl.Create CTORs lacks implementation
THRIFT-1406   Delphi               Build error after applying THRIFT-1395
THRIFT-1404   Delphi               Delphi compiler generates struct reader code with problem.
THRIFT-1395   Delphi               Patch to prevent warnings for integer types in some cases
THRIFT-1400   Ruby                 Ruby native extension aborts with __stack_chk_fail in OSX
THRIFT-1397   Test Suite           CI server fails during build due to unused parameters in delphi generator
THRIFT-1396   Delphi               Dephi generator has dependacy on boost 1.42 later.
THRIFT-1390   Build Process        Debian packages build fix for Squeeze (build from the official  0.7.0 tarball)
THRIFT-1393   PHP                  TTransportException's thrown from THttpClient has extra slashes in the Exception message
THRIFT-1366   Delphi               Delphi generator, lirbrary and unit test.
THRIFT-1130   Compiler (General)   Add the ability to specify symbolic default value for optional boolean
THRIFT-1381   C++                  Thrift C++ libs have incorrectly versioned names
THRIFT-1384   Javame               Java help menu missing newline near javame flag
THRIFT-1373   C++                  Fix user-defined exception generation in thrift (python)
THRIFT-1379   C++                  fix uninitialized enum values in thrift C++ objects
THRIFT-1377   C++                  abort PHP deserialization on unknown field type
THRIFT-1376   C++                  Make port specification option in thrift remote
THRIFT-1375   C++                  fixed a hex char conversion bug in TJSONProtocol
THRIFT-1370   C glib               Debian packaging should Build-Depend on libglib2.0-dev
THRIFT-1121   Java                 Java server performance regression in 0.6
THRIFT-1365   Java                 TupleProtocol#writeBitSet unintentionally writes a variable length byte array
THRIFT-1359   C++                  --gen-cob cpp:cob_style does not compile anymore
THRIFT-1355   Ruby                 Running make in lib/rb doesn't build the native extensions
THRIFT-1354   Ruby                 Add rake task to build just the gem file
THRIFT-857    Test Suite           tests run by "make install" fail if generators are disabled
THRIFT-1339   Java                 Extend Tuple Protocol to TUnions
THRIFT-1331   Ruby                 Ruby library deserializes an empty map to nil
THRIFT-1350   Go                   Go library code does not build as of r60 (most recent release)
THRIFT-1227   Erlang               Erlang implementation of thrift JSON protocol
THRIFT-1335   C++                  Add accept timeout to TServerSocket
THRIFT-1345   Build Process        Allow building without tests
THRIFT-1342   Python               Compilation problem on Windows of fastbinary.c
THRIFT-1341   C++                  TProtocol.h endian detection wrong with boost
THRIFT-1243   C++                  TAsyncChannel callbacks
THRIFT-1238   JavaScript           Thrift JS client cannot read map of structures
THRIFT-1333   C++                  Make RWGuard not copyable
THRIFT-1334   C++                  Add more info to IllegalStateException
THRIFT-1332   Java                 TSSLTransportParameters class uses hard coded value keyManagerType: SunX509
THRIFT-1328   Java                 TBaseHelper.toString(...) appends ByteBuffer data outside of valid buffer range
THRIFT-1322   OCaml                OCaml lib fail to compile: Thrift.ml line 305, int vs int32 mismatch
THRIFT-1279   PHP                  type set is handled incorrectly when writing object
THRIFT-1320   C++                  Consistency of configure generated config.h
THRIFT-1319   Java                 Mismatch between how a union reads and writes a container
THRIFT-1316   C++                  thrift: update server classes to accept
THRIFT-1314   C++                  thrift: add TProcessorFactory
THRIFT-1315   C++                  thrift: generate server interface factory classes
THRIFT-1317   C++                  Remove copy constructibility from
THRIFT-1305   C++                  thrift: make TConnection a private inner class of
THRIFT-1286   Ruby                 Modernize the Thrift Ruby Library Dev Environment
THRIFT-1304   C++                  TNonblockingServer: pass in the connection context to
THRIFT-1302   C++                  thrift: raise an exception if send() times out in
THRIFT-1301   C++                  thrift: consolidate common code in TNonblockingServer
THRIFT-1298   Java                 Standard scheme doesn't read or write metadata along with field values
THRIFT-1257   Java                 thrift's dependency scope on javax.servlet:servlet-api should be 'provided'
THRIFT-1240   PHP                  TBinarySerializer invalid serialization due to TBufferTransport not flushing 
THRIFT-1295   C++                  Duplicate include in TSocket.cpp
THRIFT-1294   C++                  thrift: fix log message typos in TSimpleServer
THRIFT-1293   C++                  thrift: improve handling of exceptions thrown by
THRIFT-1292   C++                  thrift: silence log spew from TThreadedServer
THRIFT-1290   C++                  thrift: TNonblockingServer: clean up state in the
THRIFT-1289   C++                  thrift: implement TNonblockingServer::stop()
THRIFT-1288   C++                  Allow typedefed exceptions in throws clauses
THRIFT-1287   C++                  thrift: start refactoring some of the C++ processor
THRIFT-1280   C++                  Thrift: Improve Monitor exception-free interfaces
THRIFT-1281   Compiler (General)   add @generated to the docblock
THRIFT-1282   Java                 Upgrade httpclient to 4.1.2 (from 4.0.1)
THRIFT-1284   C++                  thrift: fix processor inheritance
THRIFT-1283   C++                  thrift: wrap t_cpp_generator::generate_process_function() to 80
THRIFT-1278   Java                 javadoc warnings - compilation
THRIFT-1254   JavaME               Code compiled against a regular JRE: Object.clone() override has a different return type
THRIFT-1271   C++                  thrift: fix missing namespace in generated local
THRIFT-1274   C++                  thrift: fail compilation if an unexpected token is
THRIFT-1275   C++                  thrift: always prefix namespaces with " ::"
THRIFT-1265   C++                  C++ container deserialize
THRIFT-1167   Java                 Java nonblocking server with more than one thread for select and handling IO
THRIFT-380    Python               Use setuptools for python build
THRIFT-1270   C++                  thrift: add --allow-neg-keys argument to allow
THRIFT-1263   Ruby                 publish ruby client to rubygems
THRIFT-1205   Java                 port server unduly fragile with arbitrary input
THRIFT-769    Java                 Pluggable Serializers
THRIFT-1239   Java                 TupleProtocol- An extremely compact, temporary protocol


Version 0.7.0

THRIFT-1252   Ruby                 Segfault in Ruby deserializer
THRIFT-940    Build                'make check' fails if boost is not in the std include and link paths (Christian Lavoie)
THRIFT-1038   Java                 Generated Java code for structures containing binary fields are not serializable correctly
THRIFT-1098   PHP                  Undefined properties in TBinaryProtocolFactory		
THRIFT-1076   Erlang               Erlang Thrift socket server causes java framed client to throw ""out of sequence"" exception"		
THRIFT-1171   Perl                 Perl write/readDouble assumes little-endian platform		
THRIFT-151    C                    TSSLServerSocket and TSSLSocket implementation		
THRIFT-1068   Python               Python SSL Socket Support		
THRIFT-1011   AS3                  Error generating package imports when using classes from other packages		
THRIFT-1069   Compiler (General)   Add command line option to prevent thrift from inserting gen-* directories		
THRIFT-1055   C#                   csharp TServerSocket and TSocket do not disable Nagle via Socket.NoDelay = true like cpp and java do		
THRIFT-638    PHP                  BufferedTransport + C extensions block until recv timeout is reached on last fread call		
THRIFT-867    PHP                  PHP accelerator module's output transport is incompatible with TFramedTransport		
THRIFT-1054                        explicit call to PKG_PROG_PKG_CONFIG is missing and first use of PKG_CHECK_MODULES may not happen
THRIFT-125    OCaml                OCaml libraries don't compile with 32-bit ocaml		
THRIFT-1200   JavaScript           JS compiler generates code that clobbers existing namespaces		
THRIFT-1102   Build                "typo in configure.ac: ""=="" operator in 'test' (instead of""'="")"		
THRIFT-994    Build                Don't try to invoke phpize if we don't have it		
THRIFT-864    Compiler (General)   default value fails if identifier is a struct		
THRIFT-1021   OCaml                Framed transport support for OCaml		
THRIFT-1032                        make dist fails due to c_glib problem		
THRIFT-1057   C++                  casts in TBinaryProtocol.tcc causing dereferencing type-punned pointer will break strict-aliasing rules
THRIFT-1053   Java                 Make remote client's IP address available for all socket related transports		
THRIFT-1036   C++                  "Auto-generated C++ code fails to compile with ""-Werror -Wextra -Wall"" g++ compiler flags"		
THRIFT-1063   Tutorial             Fix Erlang Tutorial Files		
THRIFT-625    Go                   Add support for 'Go'		
THRIFT-1093   Python               several bugs in python TCompactProtocol		
THRIFT-1101   Java                 bytebuffer length calculation in TBinaryProtocol writeBinary		
THRIFT-1094   Python               bug in TCompactProto python readMessageEnd method and updated test cases		
THRIFT-1100   Python               python TSSLSocket improvements, including certificate validation		
THRIFT-1104   Build                INSTALLDIRS should be included in configure script		
THRIFT-1103   Python               TZlibTransport for python, a zlib compressed transport		
THRIFT-1105   OCaml                OCaml generator does not prefix methods of included structs with their type		
THRIFT-1107   Python               improvement for compiler-generated python for 'None' object comparisons		
THRIFT-1109   Java                 Deploy fb303 along side libthrift to maven repo		
THRIFT-1111   Compiler (General)   The HTML generator does not distinguish between string and binary types		
THRIFT-1074   Java                 .keystore and .truststore are missing from the 0.6.0 distribution		
THRIFT-1119   C#                   TJSONProtocol fails to UTF8 decode strings		
THRIFT-1120   C# - Compiler        proto.WriteListEnd being called in the wrong place		
THRIFT-1126   Erlang               Extending struct_info for erlang bindings		
THRIFT-1132   C#                   Deserialization error in TApplicationException C#		
THRIFT-1131   C#                   C# JSON Protocol is unable to decode escaped characters in string		
THRIFT-1133   Tutorial             Java and JavaScript tutorial is broken since we have Java maven deployment		
THRIFT-1140   GlibC                Framed Transport Client using C (Glib) Library hangs when connecting to Ruby Server		
THRIFT-342    PHP                  PHP: can't have sets of complex types		
THRIFT-1149   Ruby                 Nonblocking server fails when client connection is reset		
THRIFT-363    Java                 Maven Deploy		
THRIFT-1155   Java				   Remove log4j dependency from java client		
THRIFT-1170   Java                 Thrift Generated Code and Java 5		
THRIFT-835    AS3                  Bad AS3 syntax in constructors that set default values		
THRIFT-1174   Build                Publish as3 client implementation via Maven for use by flex-mojos users		
THRIFT-1178   Java                 Java: TBase signature should be T extends TBase<?,?>		
THRIFT-1067   PHP                  Tons of bugs in php implementation		
THRIFT-1182   Ruby                 Native deserializer segfaults on incorrect list element type		
THRIFT-1190   Java                 readBufferBytesAllocated in TNonblockingServer.java should be AtomicLong to fix FD leakage 
THRIFT-1183   Ruby                 Pure-ruby CompactProtocol raises ArgumentError when deserializing under Ruby 1.9		
THRIFT-1192                        Typo: TProtocol.h tests for HAVE_SYS_PARAM_H_		
THRIFT-1194   Java                 Java lib does not install artifacts to local dir correctly		
THRIFT-1208   Python               python TCompactProtocol.py writeBool and readBool not follow the compact-proto-spec-2.txt spec 
THRIFT-1211   Java                 When using THttpClient, non 200 responses leave the connection open		
THRIFT-627    C++                  should c++ have setters for optional fields?		
THRIFT-1218   GLibC                c_glib uses wrong name in pkg-config		
THRIFT-1189   Ruby                 Ruby deserializer speed improvements		
THRIFT-1225   PHP                  TCompactProtocol for PHP		
THRIFT-1227   Erlang               Erlang implementation of thrift JSON protocol		
THRIFT-1228   PHP                  The php accelerator module calls flush incorrectly		
THRIFT-1234   Python               thrift --help is missing doc on py:utf8strings		
THRIFT-1237   Java                 Java fb303 missing some methods		
THRIFT-1248   C++                  pointer subtraction in TMemoryBuffer relies on undefined behavior		
THRIFT-1253   Java                 Code generated for maps is not compiling		
THRIFT-1255   Java                 Mismatch of method name between JavaME's lib and generated code (compareTo/compareObjects)		
THRIFT-1238   JavaScript           Thrift JS client cannot read map of structures		
THRIFT-1213                        Membuffer should provide a way to get back the buffer		
THRIFT-1117   JavaScript           JavaScript Unit Test does not work anymore because libthrift*.jar where moved by Maven Deployment		
THRIFT-1164   JavaScript           Segmentation fault on NULL pointer in t_js_generator::generate_const		
THRIFT-788    PHP                  thrift_protocol.so: multiget/multiget_slice does not handle more than 17 keys correctly		
THRIFT-1222   C++                  Unhandled exception for TEvhttpServer request		
THRIFT-1241   PHP                  php namespace generation		
THRIFT-1236   Erlang               Erlang Reconnecting Thrift Client		
THRIFT-1151   Erlang               Produce more informative runtime error in case of schema and data mismatch during serialization		
THRIFT-1146   Java                 Android Incompatibility : in Android < 2.3 java.io.IOException doesn't support for Throwable 
THRIFT-826    PHP                  PHP TSocket Write Timeout		
THRIFT-27     Erlang               Generated erlang types don't contain default values for records		
THRIFT-1153   C++                  HttpClient does not specify the connection close parameter		
THRIFT-1154   Cocoa                HttpClient does not specify the connection close parameter		
THRIFT-1081   PHP                  PHP tests broken and somewhat incomplete		
THRIFT-1078   Test Suite           ThriftTest.thrift generates invalid PHP library		
THRIFT-447    Java                 Make an abstract base Client class so we can generate less code		
THRIFT-1181   AS3                  AS3 compiler generates incorrect code for setting default values in constructor		
THRIFT-997    Java                 Using valueOf for base types in getFieldValue		
THRIFT-999    PHP                  Add TForkingServer		
THRIFT-1041   Java                 TDeserializer holds onto a reference of the array it reads after it is done deserializing		
THRIFT-1065   JavaScript           Unexpected exceptions not proper handled on JS		
THRIFT-993    C++                  Some improvements in C++ stubs for oneway operations		
THRIFT-1083   Python               Preforking python process pool server		
THRIFT-1092   Python               generated validate() method has wrong indentation		
THRIFT-1050   Java                 "Declaring an argument named ""manager"" to a service method produces code that fails compile 
THRIFT-1106   C++                  C++ code TAsyncProtocolProcessor.h & TAsyncBufferProcessor.h dont have virtual functions 
THRIFT-1080   Erlang               erlang test's 'make' fails on Mac OSX		
THRIFT-731    Java                 configure doesn't check for ant >= 1.7		
THRIFT-1180   AS3                  AS3 compiler generates uncompilable code for binary types.		
THRIFT-1187   Ruby                 nonblocking_server shutdown race under Ruby 1.9		
THRIFT-1193   Ruby                 Potential infinite loop in nonblocking_server		
THRIFT-891    Compiler (General)   Comments are not properly handled in some cases		
THRIFT-1216   Java                 build Java Library behind a proxy		
THRIFT-1177   Go                   Update thrift to reflect changes in Go's networking libraries		
THRIFT-1220   C++                  TProcessor::process never returns false		
THRIFT-1231   C++                  Remove bogus include		
THRIFT-1217   C++                  Use evutil_socketpair instead of pipe (Windows port)		
THRIFT-1215   JavaScript           Undefined property Thirft in lib/js/thrift.js		
THRIFT-418    Ruby                 Don't do runtime sorting of struct fields		
THRIFT-1244   C++                  'using' to disambiguate between functions in different bases does not conform to C++ standard
THRIFT-892    Erlang               Refactor erlang build system with rebar		
THRIFT-690    Compiler (General)   Update TApplicationException codes		
THRIFT-1199   Java                 Union structs should have generated methods to test whether a specific field is currently set		
THRIFT-113    Compiler (General)   to-string methods should omit optional null fields from output		
THRIFT-1049   Python               Allow for TServerSocket python library to bind to a specific host		
THRIFT-1152   PHP                  THRIFT-1144 Attributes from private to protected		
THRIFT-1207   Ruby                 "Support DESTDIR on ""make install"" of ruby libs"		
THRIFT-1123   C++                  Patch to compile Thrift server and client for vc++ 9.0 and 10.0		
THRIFT-1031   C++                  Patch to compile Thrift for vc++ 9.0 and 10.0		
THRIFT-1221   C++                  Remove SimpleCallback.h		
THRIFT-1233   C++                  Remove unused include in generated C++ code		
THRIFT-1246   Java                 Improve logging: Change TNonblockingServer internalRead to trace from warn		
THRIFT-1251   Java                 Generated java code should indicate which fields are required and which are optional


Version 0.6.0

THRIFT-940    Build                'make check' fails if boost is not in the std include and link paths (Christian Lavoie)
THRIFT-1032   Build                "make dist" fails due to c_glib problem (Michael Lum)
THRIFT-1002   C glib               CodeStyle: t_c_glib_generator.cc (Anatol Pomozov)
THRIFT-975    C glib               lib/c_glib/README is missing => breaks make dist (Michael Lum)
THRIFT-1003   C glib               Polishing c_glib code (Anatol Pomozov)
THRIFT-582    C glib               C implementation of Thrift (Anatol Pomozov)
THRIFT-992    C#                   Naming convention in C# constructor is not consistent with other fields causes compile errors (Roger Meier)
THRIFT-977    C++                  Hex Conversion Bug in C++ TJSONProtocol (Aravind Narayanan)
THRIFT-922    C++                  Templatized [de]serialization code for C++ (David Reiss)
THRIFT-923    C++                  Event-driven client and server support for C++ (David Reiss)
THRIFT-925    C++                  Provide name<->value map for enums in C++ (David Reiss)
THRIFT-926    C++                  Miscellaneous C++ improvements (David Reiss)
THRIFT-928    C++                  Make more statistics available in C++ servers (David Reiss)
THRIFT-929    C++                  Improvements to the C++ test suite (David Reiss)
THRIFT-868    Compiler (General)   Referencing constant values doesn't work with with typedef types (David Reiss)
THRIFT-1006   General              Impossible to correctly qualify an enum constant in an external thrift file (Bryan Duxbury)
THRIFT-932    Haskell              Haskell tests need to be run through 'make check' (and probably 'cabal check') too (Christian Lavoie)
THRIFT-933    Haskell              Haskell's Thrift.cabal has warnings (Christian Lavoie)
THRIFT-943    Haskell              Silly readme typo fix. (Christian Lavoie)
THRIFT-944    Haskell              Support all version-4s of base (Christian Lavoie)
THRIFT-950    Haskell              Haskell bindings treat 'byte' as unsigned 8-bit int (Data.Word.Word8), java/cpp as signed (byte/int8_t). (Christian Lavoie)
THRIFT-1009   Java                 TUnion does not correctly deep copy a ByteBuffer (Takashi Yonebayashi)
THRIFT-1013   Java                 generated java code may have name clashes with thrift library (Peter Schuller)
THRIFT-1015   Java                 TUnion does not handle ByteBuffer in toString (Takashi Yonebayashi)
THRIFT-1038   Java                 Generated Java code for structures containing binary fields (or collections thereof) are not serializable (in the Java sense) even though they implement java.io.Serializable (Mathias Herberts)
THRIFT-106    Java                 TSSLServerSocket (Nirmal Ranganathan)
THRIFT-377    Java                 TFileTransport port in Java (Joydeep Sen Sarma)
THRIFT-745    Java                 Make it easier to instantiate servers (Bryan Duxbury)
THRIFT-862    Java                 Async client issues / improvements (Ning Liang)
THRIFT-903    Java                 custom ThreadFactory in THsHaServer (Bryan Duxbury)
THRIFT-939    Java                 optional binary fields throw NPE on default byte[] getters (Bryan Duxbury)
THRIFT-947    Java                 Provide a helper method to determine the TProtocol used to serialize some data. (Mathias Herberts)
THRIFT-951    Java                 Add a new isServing() method to TServer (Bryan Duxbury)
THRIFT-957    Java                 THsHaServer: Change access modifier of the invoker field. (Benjamin Coverston)
THRIFT-958    Java                 Change accessmodifer on trans_ field in the FrameBuffer class to public. (Benjamin Coverston)
THRIFT-959    Java                 TSocket seems to do its own buffering inefficiently (Bryan Duxbury)
THRIFT-970    Java                 Under heavy load, THttpClient may fail with "too many open files" (Mathias Herberts)
THRIFT-971    Java                 java module can't be compiled without ivy and network connection (Roger Meier)
THRIFT-807    JavaScript           JavaScript: Initialization of Base Types with 0 instead of null (Roger Meier)
THRIFT-913    JavaScript           Test Case for Url encoded strings + simple enhancement to lib/js/test/RunTestServer.sh (Roger Meier)
THRIFT-961    JavaScript           JavaScript TestSuite using ant/ivy and Java's ServerTestBase Handler (Roger Meier)
THRIFT-1005   Java                 Give unions byte[] signature methods to go along with their ByteBuffer counterparts (Bryan Duxbury)
THRIFT-1008   Java                 byte[] accessors throw NPE on unset field (Bryan Duxbury)
THRIFT-517    Java                 TExceptions thrown by server result in cryptic error message on client - Tried to read 4 bytes, but only got 0 bytes (Bryan Duxbury)
THRIFT-946    Java                 Augment FieldValueMetaData so it differentiates 'string' and 'binary' fields. (Mathias Herberts)
THRIFT-949    Java                 Modify the TEnum interface so it defines a method similar to findByValue (Mathias Herberts)
THRIFT-960    Java                 add TestServer, TestNonblockingServer and TestClient again (Roger Meier)
THRIFT-969    Java                 Java Tutorial broken, move CalculatorHandler to a separate file (Roger Meier)
THRIFT-71     Misc                 Debian packaging for thrift (Roger Meier)
THRIFT-1020   OCaml                OCaml compiler generates invalid OCaml (Richard Low)
THRIFT-347    PHP                  PHP TSocket Timeout Issues (Tyler Hobbs)
THRIFT-924    PHP                  Fix generated php structure constants (David Reiss)
THRIFT-927    PHP                  Add option to modify the PHP include path (David Reiss)
THRIFT-935    PHP                  PHP Extension aborts the build if php-config is not installed (David Reiss)
THRIFT-941    PHP                  Make PHP C Extension use the defined Protocol writeMessageBegin function (Chris Goffinet)
THRIFT-955    PHP                  Thrift compiler for Windows uses lowercase names and directories which is inconsistent with compiling on other platforms (Roger Meier)
THRIFT-979    Ruby                 ruby bindings used to work on jruby (Jeff Hodges)
THRIFT-581    Test Suite           Add a testsuite for txThrift (Twisted) (Esteve Fernandez)
THRIFT-1024   Tutorial             Add Python Twisted example to the Tutorial (Roger Meier)
THRIFT-893    Tutorial             add JavaScript to the tutorial examples (Roger Meier)


Version 0.5.0

THRIFT-505   Build                Make configure give a summary of the enabled components (David Reiss)
THRIFT-506   Build                Allow Thrift to be built without the C++ library (David Reiss)
THRIFT-844   Build                Build Requirements state autoconf 2.59+ is required, but 2.60+ is needed (Harlan Lieberman-Berg)
THRIFT-850   Build                Perl runtime requires Bit::Vector which may not be installed by default, but configure does not fail (Michael Lum)
THRIFT-854   Build                Provide configure option and make rules to build/install php extension (Anthony Molinaro)
THRIFT-858   Build                Have bootstrap.sh check for a suitable autoconf version before running (David Reiss)
THRIFT-871   Build                Thrift compiler for WIndows (binary distribution) (David Reiss)
THRIFT-323   C#                   TJSONProtocol (Roger Meier)
THRIFT-634   C#                   C# Compiler Generates Incorrect Code For Fields which begin with an uppercase letter (Jon S Akhtar)
THRIFT-881   C#                   add csharp to the tutorial (Roger Meier)
THRIFT-856   C++                  Building cpp library fails on OS X with malloc and free not being declared in scope (James Clarke)
THRIFT-865   C++                  C++ compiler build depends on libfl even when flex/lex not detected (David Reiss)
THRIFT-900   C++                  Unix domain socket (Roger Meier)
THRIFT-920   C++                  C++ Test and Tutorial does not compile anymore due to the change within Enum handling (Roger Meier)
THRIFT-567   C++                  Can't immediately stop a TSimpleServer thread that is idle (Rush Manbert)
THRIFT-756   C++                  Exposing TSocket(int) constructor to public (Rajat Goel)
THRIFT-798   C++                  TNonblockingServer leaks resources when destroyed (David Reiss)
THRIFT-812   C++, Python          Demo of Thrift over ZeroMQ (David Reiss)
THRIFT-629   Cocoa                Unused Field In TSocketServer Appears To Break iPhone Build (Jon S Akhtar)
THRIFT-838   Cocoa                Generated Cocoa classes have useless @dynamic declarations (Kevin Ballard)
THRIFT-805   Cocoa                Don't generate process_XXXX methods for oneway methods (Brad Taylor)
THRIFT-507   Compiler             Remove the compiler's dependency on Boost (David Reiss)
THRIFT-895   Compiler (General)   Thrift compiler does not allow two different enumerations to have the same key name for one of the enum values (David Reiss)
THRIFT-852   Compiler (General)   Missing newline causes many compiler warnings (Anthony Molinaro)
THRIFT-877   Compiler (General)   smalltalk namespace doesn't work (Bruce Lowekamp)
THRIFT-897   Compiler (General)   Don't allow unqualified constant access to enum values (Bryan Duxbury)
THRIFT-9     Compiler (General)   Add a default namespace declaration for all languages (David Reiss)
THRIFT-599   Erlang               Don't use unnecessary processes in the Erlang transports and clients (David Reiss)
THRIFT-646   Erlang               Erlang library is missing install target (David Reiss)
THRIFT-698   Erlang               Generated module list should contain atoms, not strings (Anthony Molinaro)
THRIFT-866   Erlang               term() in spec definitions seems to not work in erlang R12 (Anthony Molinaro)
THRIFT-886   Erlang               Dialyzer warning (Anthony Molinaro)
THRIFT-785   Erlang               Framed transport server problems (Anthony Molinaro)
THRIFT-884   HTML                 HTML Generator: add Key attribute to the Data Types Tables (Roger Meier)
THRIFT-652   Haskell              Generated field name for strut is not capitalized correctly (Christian Lavoie)
THRIFT-743   Haskell              compile error with GHC 6.12.1 (Christian Lavoie)
THRIFT-901   Haskell              Allow the bindings to compile without -fglasgow-exts and with -Wall -Werror (Christian Lavoie)
THRIFT-905   Haskell              Make haskell thrift bindings use automake to compile and install (Christian Lavoie)
THRIFT-906   Haskell              Improve type mappings (Christian Lavoie)
THRIFT-914   Haskell              Make haskell bindings 'easily' compilable (Christian Lavoie)
THRIFT-918   Haskell              Make haskell tests run again (Christian Lavoie)
THRIFT-919   Haskell              Update Haskell bindings README (Christian Lavoie)
THRIFT-787   Haskell              Enums are not read correctly (Christian Lavoie)
THRIFT-250   Java                 ExecutorService as a constructor parameter for TServer (Ed Ceaser)
THRIFT-693   Java                 Thrift compiler generated java code that throws compiler warnings about deprecated methods. (Bryan Duxbury)
THRIFT-843   Java                 TNonblockingSocket connects without a timeout (Bryan Duxbury)
THRIFT-845   Java                 async client does not respect timeout (Ning Liang)
THRIFT-870   Java                 Java constants don't get Javadoc comments (Bryan Duxbury)
THRIFT-873   Java                 Java tests fail due to Too many open files (Todd Lipcon)
THRIFT-876   Java                 Add SASL support (Aaron T. Myers)
THRIFT-879   Java                 Remove @Override from TUnion.clear (Dave Engberg)
THRIFT-882   Java                 deep copy of binary fields does not copy ByteBuffer characteristics (arrayOffset, position) (Bryan Duxbury)
THRIFT-888   Java                 async client should also have nonblocking connect (Eric Jensen)
THRIFT-890   Java                 Java tutorial doesn't work (Todd Lipcon)
THRIFT-894   Java                 Make default accessors for binary fields return byte[]; provide new accessors to get ByteBuffer version (Bryan Duxbury)
THRIFT-896   Java                 TNonblockingSocket.isOpen() returns true even after close() (Eric Jensen)
THRIFT-907   Java                 libfb303 doesn't compile in 0.4.0 (Todd Lipcon)
THRIFT-912   Java                 Improvements and bug fixes to SASL implementation (Todd Lipcon)
THRIFT-917   Java                 THsHaServer should not accept an ExecutorService without catching RejectedExecutionException (Ed Ceaser)
THRIFT-931   Java                 Use log4j for Java tests (Todd Lipcon)
THRIFT-880   JavaME               JavaME code generator and runtime library (Dave Engberg)
THRIFT-846   JavaScript           JavaScript Test Framwork: extended Testcases (Roger Meier)
THRIFT-885   JavaScript           Url encoded strings never get decoded? How do we fix this? (T Jake Luciani)
THRIFT-911   JavaScript           (JavaScript compiler) Const structs, maps, sets, and lists generate a trailing comma (T Jake Luciani)
THRIFT-860   OCaml                copy method and reset method (Lev Walkin)
THRIFT-682   PHP                  PHP extension doesn't compile on Mac OS X (Bryan Duxbury)
THRIFT-851   PHP                  php extension fails to compile on centos 5.x (Todd Lipcon)
THRIFT-840   Perl                 Perl protocol handler could be more robust against unrecognised types (Conrad Hughes)
THRIFT-758   Perl                 incorrect deference in exception handling (Yann Kerherve)
THRIFT-257   Python               Support validation of required fields (Esteve Fernandez)
THRIFT-335   Python               Compact Protocol for Python (David Reiss)
THRIFT-596   Python               Make Python's TBufferedTransport use a configurable input buffer (David Reiss)
THRIFT-597   Python               Python THttpServer performance improvements (David Reiss)
THRIFT-598   Python               Allow Python's threading servers to use daemon threads (David Reiss)
THRIFT-666   Python               Allow the handler to override HTTP responses in THttpServer (David Reiss)
THRIFT-673   Python               Generated Python code has whitespace issues (Ian Eure)
THRIFT-721   Python               THttpClient ignores url parameters (Thomas Kho)
THRIFT-824   Python               TApplicationException.__str__() refers to class constants as globals (Peter Schuller)
THRIFT-855   Python               Include optimized compiled python objects in install (Anthony Molinaro)
THRIFT-859   Python               Allow py:twisted to be generated in different namespace than py (Bruce Lowekamp)
THRIFT-869   Python               TSocket.py on Mac (and FreeBSD) doesn't handle ECONNRESET from recv() (Steven Knight)
THRIFT-875   Python               Include python setup.cfg in dist (Anthony Molinaro)
THRIFT-610   Ruby                 binary_protocol.rb segfaults [line 86] (Unassigned)
THRIFT-899   Ruby                 Ruby read timeouts can sometimes be 2x what they should be (Ryan King)
THRIFT-909   Ruby                 allow block argument to struct constructor (Michael Stockton)
THRIFT-456   Test Suite           Bad IP address string in test/cpp/src/main.cpp (Rush Manbert)


Version 0.4.0

THRIFT-650   Build        Make Check fails on Centos/OSX with 0.2.0 tarball (Anthony Molinaro)
THRIFT-770   Build        Get 'make dist' to work without first compiling source code (Anthony Molinaro)
THRIFT-160   C#           Created THttpTransport for the C# library based on WebHttpRequest (Michael Greene)
THRIFT-834   C#           THttpClient resends contents of message after transport errors (Anatoly Fayngelerin)
THRIFT-247   C++          THttpServer Transport (Unassigned)
THRIFT-676   C++          Change C++ code generator so that generated classes can be wrapped with SWIG (Unassigned)
THRIFT-570   Compiler     Thrift compiler does not error when duplicate method names are present (Bruce Simpson)
THRIFT-808   Compiler     Segfault when constant declaration references a struct field that doesn't exist (Bryan Duxbury)
THRIFT-646   Erlang       Erlang library is missing install target (Anthony Molinaro)
THRIFT-544   General      multiple enums with the same key generate invalid code (Ben Taitelbaum)
THRIFT-434   General      ruby compiler should warn when a reserved word is used (Michael Stockton)
THRIFT-799   General      Files missing proper Apache license header (Bryan Duxbury)
THRIFT-832   HTML         HTML generator shows unspecified struct fields as 'required' (Bryan Duxbury)
THRIFT-226   Java         Collections with binary keys or values break equals() (Bryan Duxbury)
THRIFT-484   Java         Ability to use a slice of a buffer instead of a direct byte[] for binary fields (Bryan Duxbury)
THRIFT-714   Java         maxWorkerThreads parameter to THsHaServer has no effect (Bryan Duxbury)
THRIFT-751   Java         Add clear() method to TBase (Bryan Duxbury)
THRIFT-765   Java         Improved string encoding and decoding performance (Bryan Duxbury)
THRIFT-768   Java         Async client for Java (Bryan Duxbury)
THRIFT-774   Java         TDeserializer should provide a partialDeserialize method for primitive types (Piotr Kozikowski)
THRIFT-783   Java         .equals java method is broken on structs containing binary-type fields (Unassigned)
THRIFT-804   Java         CompareTo is broken for unions set to map, set, or list (Bryan Duxbury)
THRIFT-814   Java         Include a TServlet in the standard Thrift distribution (Mathias Herberts)
THRIFT-818   Java         Async client doesn't send method args (Bryan Duxbury)
THRIFT-830   Java         Switch binary field implementation from byte[] to ByteBuffer (Bryan Duxbury)
THRIFT-831   Java         FramedTransport implementation that reuses its buffers (Bryan Duxbury)
THRIFT-833   Java         build.xml in lib/java is missing a classpathref attribute for the javadoc task (Bryan Duxbury)
THRIFT-836   Java         Race condition causes CancelledKeyException in TAsyncClientManager (Bryan Duxbury)
THRIFT-842   Java         Upgrade to current version of commons-lang (2.5 instead of 2.4) and/or change dependency in ivy.xml to not be exact (Bryan Duxbury)
THRIFT-815   JavaScript   Deserialization of lists is critically broken. (T Jake Luciani)
THRIFT-827   OCaml        OCaml generator to take default values into account (Lev Walkin)
THRIFT-647   PHP          PHP library is missing install target (Anthony Molinaro)
THRIFT-682   PHP          PHP extension doesn't compile on Mac OS X (Bryan Duxbury)
THRIFT-718   PHP          Thrift PHP library includes closing tags and extraneous whitespace (Nicholas Telford)
THRIFT-778   PHP          PHP socket listening server (Nick Jones)
THRIFT-780   PHP          PHP extension sometimes causes an abort with two exceptions at the same time (David Reiss)
THRIFT-837   PHP          PHP accelerator bug for writes > 8k (Thomas Kho)
THRIFT-782   Perl         Perl code for writing containers doesn't count length of write*Begin or write*End (Conrad Hughes)
THRIFT-395   Python       Python library + compiler does not support unicode strings (Unassigned)
THRIFT-133   Ruby         'namespace ruby' should error out, or be an alias to 'namespace rb' (Bryan Duxbury)
THRIFT-664   Ruby         Ruby extension fails to build with Ruby 1.9.1 (Rajesh Malepati)
THRIFT-699   Ruby         Excise unused "native protocol method table" stuff from thrift_native (Bryan Duxbury)
THRIFT-767   Ruby         ruby compiler does not keep comments for enum values (Bryan Duxbury)
THRIFT-811   Ruby         http_client_transport.rb: allow custom http headers (Tony Kamenick)
THRIFT-459   Ruby         Ruby installation always tries to write to /Library/Ruby/site (Matthieu Imbert)


Version 0.1.0 RC1 / Unreleased

Compatibility Breaking Changes:
  C++:
    * It's quite possible that regenerating code and rebuilding will be
      required.  Make sure your headers match your libs!

  Java:

  Python:

  Ruby:
    * Generated files now have underscored names [THRIFT-421]
    * The library has been rearranged to be more Ruby-like [THRIFT-276]

  Erlang:
    * Generated code will have to be regenerated, and the new code will
      have to be deployed atomically with the new library code [THRIFT-136]
  
  
New Features and Bug Fixes:
  C++:
    * Support for TCompactProtocol [THRIFT-333]

  Java:
    * Support for TCompactProtocol [THRIFT-110]

  Python:
    * Support for Twisted [THRIFT-148]

  Ruby:
    * Support for TCompactProtocol [THRIFT-332]

