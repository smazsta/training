package ap1.wordsCount;

import java.util.Arrays;

public class WordsCount {

    public static int wordsCount(String[] words, int len) {
        return (int) Arrays.stream(words).filter(i -> i.length() == len).count();
    }
}
