package ap1.wordsCount;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsCountTest {
    @Test
    public void globalTest(){
        assertEquals(2, WordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 1));
        assertEquals(1, WordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 3));
        assertEquals(0, WordsCount.wordsCount(new String[]{"a", "bb", "b", "ccc"}, 4));
    }
}