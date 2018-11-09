package middlePermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MiddlePermutation {

    public static String findMidPerm(String strng) {
        String sortedString = Arrays.stream(strng.split("")).sorted().collect(Collectors.joining());
        char middleChar;
        String restOfTheString;

        if (sortedString.length() % 2 == 0) {
            middleChar = sortedString.charAt(sortedString.length() / 2 - 1);
            restOfTheString = sortedString.replace(Character.toString(middleChar), "");
            restOfTheString = new StringBuilder(restOfTheString).reverse().toString();

            return middleChar + restOfTheString;
        } else {
            middleChar = sortedString.charAt(strng.length() / 2);
            restOfTheString = sortedString.replace(Character.toString(middleChar), "");

            return middleChar + findMidPerm(restOfTheString);
        }
    }

    public static List<String> permutation(String input) {
        List<String> permutationsList = new ArrayList<>();
        permutationsList = permutation(permutationsList, "", input);
        Collections.sort(permutationsList);
        return permutationsList;
    }

    private static List<String> permutation(List<String> permutationsList, String perm, String word) {
        if (word.isEmpty() && !permutationsList.contains(perm + word)) {
            permutationsList.add(perm + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(permutationsList, perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
        return permutationsList;
    }
}
