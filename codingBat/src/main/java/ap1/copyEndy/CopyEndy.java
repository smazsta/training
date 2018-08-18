package ap1.copyEndy;

import java.util.Arrays;

public class CopyEndy {

    public static int[] copyEndy(int[] nums, int count) {

//        return new int[] {};
    return Arrays.stream(nums)
            .filter(CopyEndy::test)
            .limit(count)
            .toArray();
    }

    private static boolean test(int i) {
        return (i >= 0 && i <= 10) || (i >= 90 && i <= 100);
    }
}
