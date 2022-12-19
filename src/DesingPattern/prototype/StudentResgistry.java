package DesingPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentResgistry { //should be singleton!!
    Map<String,Student> registryValues = new HashMap();
    
    void register(String key, Student s){
        registryValues.put(key, s);
    }

    Student get(String key) {
        return registryValues.get(key);
    }
}
