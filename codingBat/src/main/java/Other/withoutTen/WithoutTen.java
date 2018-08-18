package Other.withoutTen;

import java.util.ArrayList;
import java.util.List;

public class WithoutTen {

    public static int[] function(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int numberOfTens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                list.add(Integer.valueOf(nums[i]));
            } else {
                numberOfTens++;
            }
        }

        while(numberOfTens > 0){
            list.add(0);
            numberOfTens--;
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
