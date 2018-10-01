package map2.word0;

import java.util.HashMap;
import java.util.Map;

public class Word0 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String s : strings) {
            if(!resultMap.containsKey(s)) {
                resultMap.put(s, 0);
            }
        }
        return resultMap;
    }

}
