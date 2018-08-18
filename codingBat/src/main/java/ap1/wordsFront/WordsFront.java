package ap1.wordsFront;

import java.util.Arrays;

public class WordsFront {

    public static String[] wordsFront(String[] words, int n) {
        return Arrays.copyOfRange(words,0, n);
    }
}
