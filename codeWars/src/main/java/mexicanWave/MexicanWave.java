package mexicanWave;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MexicanWave {

    public static String[] wave(String str) {

        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder(str.toLowerCase());

        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(sb.charAt(i))) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
                res.add(sb.toString());
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
        }

        return res.toArray(new String[0]);
    }

    public static String[] wave2(String str) {
        return IntStream.range(0, str.length())
                .filter(i -> str.charAt(i) != ' ')
                .mapToObj(i -> str.substring(0, i) +
                                Character.toUpperCase(str.charAt(i)) +
                                str.substring(i + 1))
                .toArray(String[]::new);
    }
}
