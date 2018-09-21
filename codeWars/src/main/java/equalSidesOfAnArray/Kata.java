package equalSidesOfAnArray;

import java.util.Arrays;

public class Kata {

    public static int findEvenIndex(int[] arr) {

        long left;
        long right;

        for (int i = 0; i < arr.length; i++) {
            left = Arrays.stream(Arrays.copyOfRange(arr, 0, i)).sum();
            right = Arrays.stream(Arrays.copyOfRange(arr, i + 1, arr.length)).sum();

            if(left == right){
                return i;
            }
        }

        return -1;
    }

    public static int findEvenIndex2(int[] arr) {
        int sumRight = Arrays.stream(arr).sum() - arr[0];
        int sumLeft = 0;

        for (int i = 1; i < arr.length; i++) {
            if (sumLeft == sumRight) return i - 1;
            sumLeft += arr[i-1];
            sumRight -= arr[i];
        }
        return -1;
    }
}
