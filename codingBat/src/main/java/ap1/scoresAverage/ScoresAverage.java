package ap1.scoresAverage;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;


public class ScoresAverage {

    public static int scoresAverage(int[] scores) {
        int[] firstHalf = Arrays.copyOfRange(scores, 0, scores.length /2);
        int[] secondHalf = Arrays.copyOfRange(scores, scores.length /2, scores.length);
        OptionalDouble firstHalfAvg = IntStream.of(firstHalf).average();
        OptionalDouble secondHalfAvg = IntStream.of(secondHalf).average();

        return (int) (firstHalfAvg.getAsDouble() > secondHalfAvg.getAsDouble()
                        ? firstHalfAvg.getAsDouble() : secondHalfAvg.getAsDouble());
    }

}
