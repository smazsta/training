import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

    private String anagram;

    public Anagram(String wordToMatch) {
        anagram = wordToMatch.toLowerCase();
    }

    public List<String> match(List<String> wordsToMatch){
        List<String> matchedWordsList = new ArrayList<>();
        char[] lettersInWord;
        char[] anagramCharArray = anagram.toCharArray();
        Arrays.sort(anagramCharArray);

        for (String word : wordsToMatch){
            String wordToLower = word.toLowerCase();

            if (!wordToLower.equals(this.anagram)) {
                lettersInWord = wordToLower.toCharArray();
                Arrays.sort(lettersInWord);

                if (Arrays.equals(lettersInWord, anagramCharArray)) {
                    matchedWordsList.add(word);
                }
            }
        }
        return matchedWordsList;
    }
}
