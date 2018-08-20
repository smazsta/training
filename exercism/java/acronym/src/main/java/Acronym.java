import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        return this.convertToAcronym();
    }

    private String convertToAcronym(){

        return Stream.of(phrase.toUpperCase()
                .split(Pattern.compile("[ -]").toString()))
                .map(i -> i.charAt(0))
                .map(Object::toString)
                .collect(Collectors.joining());
    }
}
