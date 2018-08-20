import java.util.stream.Stream;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String temp = phrase.toLowerCase().replaceAll("[^a-zA-Z]", "");

        if(phrase.isEmpty() || phrase == null) {
            return true;
        }
        return Stream.of(temp.split(""))
                .distinct()
                .count() == temp.length();
    }

}
