package zooDisaster;

import java.util.*;
import java.util.stream.Collectors;

public class Dinglemouse {

    public static final Map<String, List<String>> eatingHabitsMap = new HashMap<>();

    private static void initWhoEats() {
        eatingHabitsMap.put("antelope", new ArrayList<>(Arrays.asList("grass")));
        eatingHabitsMap.put("big-fish", new ArrayList<>(Arrays.asList("little-fish")));
        eatingHabitsMap.put("bug", new ArrayList<>(Arrays.asList("leaves")));
        eatingHabitsMap.put("bear", new ArrayList<>(Arrays.asList("big-fish", "bug", "chicken", "cow", "leaves", "sheep")));
        eatingHabitsMap.put("chicken", new ArrayList<>(Arrays.asList("bug")));
        eatingHabitsMap.put("cow", new ArrayList<>(Arrays.asList("grass")));
        eatingHabitsMap.put("fox", new ArrayList<>(Arrays.asList("chicken", "sheep")));
        eatingHabitsMap.put("giraffe", new ArrayList<>(Arrays.asList("leaves")));
        eatingHabitsMap.put("lion", new ArrayList<>(Arrays.asList("antelope", "cow")));
        eatingHabitsMap.put("panda", new ArrayList<>(Arrays.asList("leaves")));
        eatingHabitsMap.put("sheep", new ArrayList<>(Arrays.asList("grass")));
    }

    public static String[] whoEatsWho(final String zoo) {
        initWhoEats();

        if (zoo.equals(", ")) return new String[]{", "};
        List<String> splitInputArray = Arrays.stream(zoo.split(",")).collect(Collectors.toList());
        List<String> resultList = new ArrayList<>();
        resultList.add(zoo);

        for (int i = 0; i < splitInputArray.size(); i++) {
            String animal = splitInputArray.get(i);
            if (eatingHabitsMap.containsKey(animal)) {
                if (i != 0 &&
                        eatingHabitsMap.get(animal).contains(splitInputArray.get(i - 1))) {
                    resultList.add(splitInputArray.get(i) + " eats " + splitInputArray.get(i - 1));
                    splitInputArray.remove(splitInputArray.get(i - 1));
                    i = -1;
                } else if (splitInputArray.size() - 1 != i &&
                        eatingHabitsMap.get(animal).contains(splitInputArray.get(i + 1))) {
                    resultList.add(splitInputArray.get(i) + " eats " + splitInputArray.get(i + 1));
                    splitInputArray.remove(splitInputArray.get(i + 1));
                    i = -1;
                }
            }
        }

        resultList.add(String.join(",", splitInputArray));
        System.out.println(resultList);
        return resultList.toArray(new String[resultList.size()]);
    }
}
