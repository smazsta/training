import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private String word;
    private static final Map<Integer, Integer> letterScoreMap = new HashMap<>('Z' - 'A');

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        return word.toUpperCase()
                .chars()
                .map(i -> letterScoreMap.getOrDefault(i, 0))
                .reduce(0, (a, b)-> a + b);
    }

    private static void mapToScore(String letters, Integer score) {
        letters.chars().forEach(letter -> letterScoreMap.put(letter, score));
    }

    static {
        mapToScore("AEIOULNRST", 1);
        mapToScore("DG", 2);
        mapToScore("BCMP", 3);
        mapToScore("FHVWY", 4);
        mapToScore("K", 5);
        mapToScore("JX", 8);
        mapToScore("QZ", 10);
    }
}
