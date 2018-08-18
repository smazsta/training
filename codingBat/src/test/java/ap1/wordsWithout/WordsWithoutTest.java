package ap1.wordsWithout;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsWithoutTest {

    @Test
    public void globalTest(){
        assertArrayEquals(new String[]{"b", "c"}, WordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "a"));
        assertArrayEquals(new String[]{"a", "c", "a"}, WordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "b"));
        assertArrayEquals(new String[]{"a", "b", "a"}, WordsWithout.wordsWithout(new String[]{"a", "b", "c", "a"}, "c"));
    }

}