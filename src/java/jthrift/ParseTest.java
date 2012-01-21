package jthrift;

import java.util.*;

public class ParseTest implements Runnable {

    final String example = ""+
            "" +
            "  1: i32 uid,"+
            "  2: string name,"+
            "  3: string blurb"+
            "}"+
            "service UserStorage {"+
            "  void store(1: UserProfile user),"+
            "  UserProfile retrieve(1: i32 uid)"+
            "}";

    public void massert(boolean cond) {
        assert(cond);
        if (!cond) throw new RuntimeException("");
    }


    public void testParse() throws Exception {
        java.io.Reader reader = new java.io.StringReader(example);
        YYParser parser = JParse.makeParser(reader);
        massert(parser.parse());

        TProgram program = C.c.program;
        List<TStruct> structs = program.getStructs();
        massert(structs.size() == 1);
        TStruct profile = structs.get(0);
        massert(profile.getName().equals(new Id("")));
    }

    @Override
    public void run() {
        try {
            testParse();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}