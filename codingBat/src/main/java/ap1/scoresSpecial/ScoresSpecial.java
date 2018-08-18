package ap1.scoresSpecial;

import java.util.Arrays;

public class ScoresSpecial {

    public static int scoresSpecial(int[] a, int[] b) {
        int maxA = Arrays.stream(a)
                .filter(i -> i % 10 == 0)
                .max().orElse(0);

        int maxB = Arrays.stream(b)
                .filter(i -> i % 10 == 0)
                .max().orElse(0);

        return maxA + maxB;
    }
}
