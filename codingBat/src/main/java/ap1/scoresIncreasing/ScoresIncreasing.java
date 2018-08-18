package ap1.scoresIncreasing;

public class ScoresIncreasing {

    public static boolean scoresIncreasing(int[] scores) {

        for (int i = 1; i < scores.length; i++) {
            if(scores[i] < scores[i - 1]){
                return false;
            }
        }
        return true;
    }

}
