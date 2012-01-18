package jthrift.jparser;

import java.util.HashMap;
import java.util.Map;

public class TScope {
    private Map<Id, TType> types = new HashMap<Id, TType>();
    private Map<Id, TService> services = new HashMap<Id, TService>();
    private Map<Id, TConst> constants = new HashMap<Id, TConst>();

    public void addType(Id name, TType type) { types.put(name, type); }
    public void addService(Id name, TService service) { services.put(name, service); }
    public void addConstant(Id name, TConst constant) { constants.put(name, constant); }
    public void resolveConstValue(TConstValue value, TType type) {
        // TODO
    }

    public TType getType(Id name) { return types.get(name); }
    public TService getService(Id name) { return services.get(name); }
}