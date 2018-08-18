package ap1.wordsWithoutList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsWithoutList {

    public static List<String> wordsWithoutList(String[] words, int len) {

        return Arrays.stream(words)
                .filter(i -> i.length() != len)
                .collect(Collectors.toList());
    }
}
