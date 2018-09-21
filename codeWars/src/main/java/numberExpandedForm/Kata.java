package numberExpandedForm;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    public static String expandedForm(int num) {

        if(num <= 10) return String.valueOf(num);

        String numberText = String.valueOf(num);
        long[] table = new long[numberText.length()];

        for (int i = 0, j = numberText.length() - 1; i < numberText.length(); i++, j--) {
            if(numberText.charAt(i) != '0'){
                table[i] = Character.getNumericValue(numberText.charAt(i)) * (int) Math.pow(10, j);
            }
        }

        return Arrays.stream(table)
                .filter(i -> i != 0)
                .mapToObj(Long::toString)
                .collect(Collectors.joining(" + "));
    }

    public static String expandedForm2(int num) {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;

        return outs;
    }
}
