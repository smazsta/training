package nextBiggerNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

    public static long nextBiggerNumber(long n) {
        System.out.println(n);
        List<Long> numbersList = permutation(String.valueOf(n));
        Collections.sort(numbersList);
        long indexOfN = numbersList.indexOf(new Long(n));
        if(indexOfN == numbersList.size()){
            return -1;
        } else {
            return numbersList.get((int)indexOfN + 1);
        }
    }

    public static List<Long> permutation(String input) {
        List<Long> numbersList = new ArrayList<>();
        numbersList = permutation(numbersList, "", input);
        return numbersList;
    }

    private static List<Long> permutation(List<Long> numbersList, String perm, String word) {
        if (word.isEmpty() && !numbersList.contains(Long.parseLong(perm + word))) {
            numbersList.add(Long.parseLong(perm + word));
        } else {
            for (int i = 0; i < word.length(); i++) {
                permutation(numbersList, perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
            }
        }
        return numbersList;
    }

    public static void main(String args[]) {
        permutation("123");
    }

}
