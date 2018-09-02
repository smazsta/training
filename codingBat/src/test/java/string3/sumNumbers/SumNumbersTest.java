package string3.sumNumbers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumNumbersTest {

    private SumNumbers sN;

    @Before
    public void setup(){
        sN = new SumNumbers();
    }

    @Test
    public void globalTest(){
        assertEquals(123, sN.sumNumbers("abc123xyz"));
        assertEquals(44, sN.sumNumbers("aa11b33"));
        assertEquals(18, sN.sumNumbers("7 11"));
        assertEquals(0, sN.sumNumbers(""));
        assertEquals(0, sN.sumNumbers("keklol"));
    }
}