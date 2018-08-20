import java.util.stream.Stream;

public class PangramChecker {

    public boolean isPangram(String input) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        return Stream.of(input.toLowerCase().split(""))
                .distinct()
                .filter(i -> alphabet.contains(i))
                .count() == alphabet.length();
    }

}
