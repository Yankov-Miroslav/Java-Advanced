package Google;

import java.util.LinkedHashMap;
import java.util.Map;

public class Children {
    Map<String, String> childMap = new LinkedHashMap<>();

    public Children(String childName, String childBirthday) {
        childMap.put(childName, childBirthday);
    }

    public Map<String, String> getChildMap() {
        return childMap;
    }

    public void setChildMap(String childName, String childBirthday) {
        childMap.put(childName, childBirthday);
    }
}
