package recursion1.countHi;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountHiTest {

    @Test
    public void globalTest(){
        assertEquals(4, CountHi.countHi("xhixhixhihi"));
        assertEquals(0, CountHi.countHi("hello"));
        assertEquals(1, CountHi.countHi("hix"));
        assertEquals(2, CountHi.countHi("xhixhix"));
        assertEquals(1, CountHi.countHi("hi"));
        assertEquals(0, CountHi.countHi("ih"));
        assertEquals(0, CountHi.countHi(""));
    }
}