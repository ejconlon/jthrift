package jthrift;

import java.lang.reflect.*;

class TokLookup {
    public static String lookup(Integer value) {
	for (Field f : YYParser.class.getDeclaredFields()) {
	    //if (!f.isAccessible()) continue;
	    try {
		Object obj = f.get(null);
		if (value.equals(obj)) {
		    return f.getName();
		}
	    } catch (IllegalAccessException impossible) {
	    } catch (NullPointerException urgh) {}
	}
	return null;
    }
}