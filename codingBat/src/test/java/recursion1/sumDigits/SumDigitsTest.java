package recursion1.sumDigits;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumDigitsTest {

    @Test
    public void globalTest(){
        assertEquals(9, SumDigits.sumDigits(126));
        assertEquals(0, SumDigits.sumDigits(0));
        assertEquals(3, SumDigits.sumDigits(3));
        assertEquals(7, SumDigits.sumDigits(16));
        assertEquals(10, SumDigits.sumDigits(91));
    }

}