package ap1.wordsWithoutList;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class WordsWithoutListTest {

    @Test
    public void globalTest(){
        assertArrayEquals(new String[]{"bb", "ccc"}, WordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1).toArray());
        assertArrayEquals(new String[]{"a", "bb", "b"}, WordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3).toArray());
        assertArrayEquals(new String[]{"a", "bb", "b", "ccc"}, WordsWithoutList.wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4).toArray());
    }
}