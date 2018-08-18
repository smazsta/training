package ap1.wordsFront;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordsFrontTest {

    @Test
    public void globalTest(){
        assertArrayEquals(new String[]{"a"}, WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 1));
        assertArrayEquals(new String[]{"a", "b"}, WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 2));
        assertArrayEquals(new String[]{"a", "b", "c"}, WordsFront.wordsFront(new String[]{"a", "b", "c", "d"}, 3));
    }
}