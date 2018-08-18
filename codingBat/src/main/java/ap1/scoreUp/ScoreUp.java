package ap1.scoreUp;

public class ScoreUp {

    public static int scoreUp(String[] key, String[] answers) {
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if(!answers[i].equals("?")) {
                if (answers[i].equals(key[i])) {
                    count = count + 4;
                } else {
                    count = count - 1;
                }
            }
        }

        return count;
    }

}
