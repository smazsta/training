package findChildren;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class WhereIsMyParent {

    static String findChildren(final String text) {

        if(text.isEmpty()){
            return "";
        }

        String sorted = Stream.of(text.toLowerCase().split(""))
                .sorted()
                .collect(Collectors.joining());

        StringBuilder sb = new StringBuilder(sorted);
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

        for (int i = 1; i < sorted.length(); i++) {
            if(sorted.charAt(i) != sorted.charAt(i - 1)){
                sb.setCharAt(i, Character.toUpperCase(sorted.charAt(i)));
            }
        }

        return sb.toString();
    }

    static String findChildren2(final String text) {
        return Arrays.stream(text.split(""))
                .sorted()
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining(""));
    }
}


