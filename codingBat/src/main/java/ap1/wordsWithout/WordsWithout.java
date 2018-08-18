package ap1.wordsWithout;

import java.util.Arrays;
import java.util.stream.Collectors;

public class WordsWithout {

    public static String[] wordsWithout(String[] words, String target) {
        return Arrays.stream(words)
                .filter(i -> !i.equals(target))
                .collect(Collectors.toList())
                .toArray(new String[]{});
    }
}
