package nextBiggerNumber;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {

    public static long nextBiggerNumber(long n) {

        int[] numberDigits = Long.toString(n).chars().map(c -> c-'0').toArray();
        int i = numberDigits.length - 1;
        while(i != 0 && numberDigits[i] < numberDigits[i-1]){
            i--;
        }

        String c = Arrays.stream(Long.toString(n).substring(i).split(""))
                .sorted()
                .collect(Collectors.joining());

        String preDigits = Long.toString(n).substring(0, i-1);
        String middleDigits = c.substring(0,1) + Long.toString(numberDigits[i-1]);
        String postDigits = c.substring(1);

        return Long.parseLong(preDigits + middleDigits + postDigits);
    }

}
