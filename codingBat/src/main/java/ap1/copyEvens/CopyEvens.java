package ap1.copyEvens;

import java.util.Arrays;
import java.util.Collections;

public class CopyEvens {

    public static int[] copyEvens(int[] nums, int count) {

//        return new int[] {};
        return Arrays.stream(nums)
                .filter(i -> i % 2 == 0)
                .limit(count)
                .toArray();
    }

}
