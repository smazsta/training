package scramblies;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Scramblies {

    public static boolean scramble2(String str1, String str2) {
        List<String> array2 = Stream.of(str2.split("")).collect(Collectors.toList());
        List<String> array1 = Stream.of(str1.split("")).collect(Collectors.toList());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < array2.size(); i++) {
            if (array1.contains(array2.get(i))) {
                result.add(array2.get(i));
                array1.remove(array2.get(i));
            }
        }
        if(result.size() == str2.length()){
            return true;
        }

        return false;
    }

    public static boolean scramble(String str1, String str2) {
        if (str2.length() > str1.length()) return false;
        for (String s: str2.split("")) {
            if (!str1.contains(s))  return false;
            str1 = str1.replaceFirst(s,"");
        }

        return true;
    }
}