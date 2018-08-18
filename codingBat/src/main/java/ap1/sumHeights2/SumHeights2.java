package ap1.sumHeights2;

public class SumHeights2 {

    public static int sumHeights(int[] heights, int start, int end) {
        int temp = 0;
        int multiplier;
        for (int i = start; i < end; i++) {
            if(heights[i + 1] > heights[i]){
                multiplier = 2;
            } else {
                multiplier = 1;
            }
            temp = temp + multiplier * Math.abs(heights[i + 1] - heights[i]);
        }
        return temp;
    }
}
