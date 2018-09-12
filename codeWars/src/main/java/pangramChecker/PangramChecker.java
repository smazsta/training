package panagramChecker;

import java.util.stream.Stream;

public class PangramChecker {

    private static final long ALPHABET_LENGTH = 26;

    public boolean check(String sentence){

        return Stream.of(sentence.toLowerCase()
                        .replaceAll("[\\W\\d]", "")
                        .split(""))
                .distinct()
                .count() == ALPHABET_LENGTH;
    }

    public boolean check2(String sentence){
        return sentence.chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;
    }
}
