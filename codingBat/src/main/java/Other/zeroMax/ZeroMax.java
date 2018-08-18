package Other.zeroMax;

import java.util.stream.IntStream;

public class ZeroMax {

    public static int[] function(int[] nums){
        if (nums.length <= 1) {
            return nums;
        }

        int max = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i + 1;
                max = 0;
                while(j < nums.length) {
                    if (nums[j] % 2 == 1 && max < nums[j]){
                        max = nums[j];
                    }
                    j++;
                }
                nums[i] = max;
            }
        }
        return nums;
    }

    public static String dupa(int[] nums){
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", IntStream.of(nums).boxed().toArray());
    }
}
