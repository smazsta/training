/**
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the even numbers come before all the odd numbers.
 * Other than that, the numbers can be in any order. You may modify and return
 * the given array, or make a new array.
 */

package Other.evenOdd;

import java.util.LinkedList;

public class EvenOdd {

    public static int[] evenOdd(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 1){
                list.addLast(nums[i]);
            } else {
                list.addFirst(nums[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
