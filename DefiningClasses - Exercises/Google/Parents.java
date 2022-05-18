package Google;

import java.util.LinkedHashMap;
import java.util.Map;

public class Parents {

    Map<String, String> parentsMap = new LinkedHashMap<>();

    public Parents(String parentName, String parentBirthday) {
        parentsMap.put(parentName, parentBirthday);
    }

    public Map<String, String> getParentsMap() {
        return parentsMap;
    }

    public void setParentsMap(String parentName, String parentBirthday) {
        parentsMap.put(parentName, parentBirthday);
    }
}

