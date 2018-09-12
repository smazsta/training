package enoughIsEnough;

import java.util.*;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(elements.length == 0 || maxOccurrences < 1) return elements;

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < elements.length; i++) {
            if(!map.containsKey(elements[i])) {
                map.put(elements[i], 0);
            }
            if(map.get(elements[i]) < maxOccurrences){
                map.put(elements[i], map.get(elements[i]) + 1);
                list.add(elements[i]);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    public static int[] deleteNth2(int[] elements, int max) {

        if (max < 1) return new int[0];

        final HashMap<Integer,Integer> map = new HashMap<>();
        final List<Integer> list = new ArrayList<>();

        for (final Integer i : elements) {
            final Integer v = map.put(i, map.getOrDefault(i, 0) + 1);
            if (v == null || v < max) list.add(i);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
