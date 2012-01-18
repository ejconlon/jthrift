package jthrift.jparser;

import java.util.*;

public class TProgram extends TDoc {
    private String path;
    private String name;
    private TScope scope;
    private Map<Id, Id> namespaces = new HashMap<Id, Id>();
    private List<Id> cppIncludes = new LinkedList<Id>();
    private List<TProgram> includes = new LinkedList<TProgram>();
    private List<TConst> consts = new LinkedList<TConst>();
    private List<TTypedef> typedefs = new LinkedList<TTypedef>();
    private List<TEnum> tenums = new LinkedList<TEnum>();
    private List<TStruct> structs = new LinkedList<TStruct>();
    private List<TStruct> xceptions = new LinkedList<TStruct>();
    private List<TService> services = new LinkedList<TService>();

    public TProgram(String path, String name) {
        this.path = path;
        this.name = name;
        this.scope = new TScope();
    }

    public void setNamespace(Id lang, Id ns) {
        namespaces.put(lang, ns);
    }

    public void addCppInclude(Id path) {
        cppIncludes.add(path);
    }

    public void addInclude(Id path, Id include_site) {
        TProgram prog = new TProgram(path.toString(), this.name);
        // TODO
        //prog.setIncludePrefix(include_site)
        includes.add(prog);
    }

    public void addConst(TConst a) {
        consts.add(a);
    }

    public void addService(TService a) {
        services.add(a);
    }

    public void addTypedef(TTypedef a) {
        typedefs.add(a);
    }

    public void addEnum(TEnum a) {
        tenums.add(a);
    }

    public void addStruct(TStruct a) {
        structs.add(a);
    }

    public void addXception(TStruct a) {
        xceptions.add(a);
    }
}