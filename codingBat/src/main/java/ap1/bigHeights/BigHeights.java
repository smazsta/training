package ap1.bigHeights;

public class BigHeights {

    public static int sumHeights(int[] heights, int start, int end) {
        int bigSteps = 0;
        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i + 1] - heights[i]) >= 5) {
                bigSteps++;
            }
        }
        return bigSteps;
    }
}
