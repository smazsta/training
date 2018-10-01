package map1.topping2;

import java.util.HashMap;
import java.util.Map;

public class Topping2 {

    public Map<String, String> topping2(Map<String, String> map) {
        Map<String, String> resultMap = new HashMap<>(map);

        if(map.containsKey("spinach") && !map.get("spinach").isEmpty()){
            resultMap.put("spinach", "nuts");
        }

        if(map.containsKey("ice cream") && !map.get("ice cream").isEmpty()){
            resultMap.put("yogurt", map.get("ice cream"));
        }

        return resultMap;
    }
}
