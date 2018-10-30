package piano;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BlackOrWhiteKey {

    public static final int[] BLACK_KEYS = new int[]
            {2, 5, 7, 10, 12, 14, 17, 19, 22,
            24, 26, 29, 31, 34, 36, 38, 41, 43,
            46, 48, 50, 53, 55, 58, 60, 62, 65,
            67, 70, 72, 74, 77, 79, 82, 84, 86};

    public static final int NUMBER_OF_KEYS = 88;

    public static String blackOrWhiteKey(int keyPressCount) {

        return Arrays.stream(BLACK_KEYS)
                .boxed()
                .collect(Collectors.toList())
                .contains(keyPressCount % NUMBER_OF_KEYS) ? "black" : "white";
    }
}
