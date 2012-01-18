package jthrift.jparser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TConstValue {
    public static enum Type {
        INTEGER,
        DOUBLE,
        STRING,
        MAP,
        LIST,
        IDENTIFIER
    }

    Map<TConstValue, TConstValue> mapVal;
    List<TConstValue> listVal;
    String stringVal;
    IConst intVal;
    DConst doubleVal;
    Id identifierVal;
    TEnum enumVal;
    Type valType;

    public TConstValue() {}
    public TConstValue(String s) {
        setString(s);
    }
    public TConstValue(IConst i) {
        setInteger(i);
    }

    private void setString(String s) {
        stringVal = s;
        valType = Type.STRING;
    }
    public void setEnum(TEnum tenum) {
        enumVal = tenum;
        // used with identifier
    }
    public void setInteger(IConst iconst) {
        intVal = iconst;
        valType = Type.INTEGER;
    }
    public void setDouble(DConst dconst) {
        doubleVal = dconst;
        valType = Type.DOUBLE;
    }
    public void setIdentifier(Id id) {
        identifierVal = id;
        valType = Type.IDENTIFIER;
    }
    public void addList(TConstValue value) {
        if (listVal == null) listVal = new LinkedList<TConstValue>();
        listVal.add(value);
    }
    public void setList() {
        valType = Type.LIST;
    }
    public void addMap(TConstValue key, TConstValue value) {
        if (mapVal == null) mapVal = new HashMap<TConstValue, TConstValue>();
        mapVal.put(key, value);
    }
    public void setMap() {
        valType = Type.MAP;
    }
}