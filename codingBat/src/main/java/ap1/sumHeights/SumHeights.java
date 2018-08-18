package ap1.sumHeights;

public class SumHeights {

    public static int sumHeights(int[] heights, int start, int end) {
        int temp = 0;
        for (int i = start; i < end; i++) {
            temp = temp + Math.abs(heights[i + 1] - heights[i]);
        }
        return temp;
    }
}
