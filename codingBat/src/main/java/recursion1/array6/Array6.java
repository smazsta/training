package recursion1.array6;

public class Array6 {

    public static boolean array6(int[] nums, int index) {

        if(nums.length == 0) return false;
        if(nums[index] == 6){
            return true;
        }
        else if(index == nums.length - 1) return false;
        return array6(nums, index+1);
    }
}

