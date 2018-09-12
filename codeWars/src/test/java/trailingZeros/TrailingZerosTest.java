package trailingZeros;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrailingZerosTest {

    @Test
    public void shouldReturnZeroWhenGivenAZero() throws Exception {
        assertEquals(0, TrailingZeros.zeros(0));
    }

    @Test
    public void shouldReturnOneWhenGivenAFive() throws Exception {
        assertEquals(1, TrailingZeros.zeros(5));
    }

    @Test
    public void shouldReturnTwoWhenGivenATen() throws Exception {
        assertEquals(2, TrailingZeros.zeros(10));
    }

    @Test
    public void shouldReturnThreeWhenGivenAFifteen() throws Exception {
        assertEquals(3, TrailingZeros.zeros(15));
    }

    @Test
    public void shouldReturnThreeWhenGivenAThousand() throws Exception {
        assertEquals(249, TrailingZeros.zeros(1000));
    }

    @Test
    public void shouldReturnThreeWhenGivenTwentyThousand() throws Exception {
        assertEquals(2499, TrailingZeros.zeros(10_000));
    }

    @Test
    public void shouldReturnThreeWhenGivenHundredThousands() throws Exception {
        assertEquals(24_999, TrailingZeros.zeros(100_000));
    }

    @Test
    public void shouldReturnThreeWhenGivenMillion() throws Exception {
        assertEquals(249_998, TrailingZeros.zeros(1_000_000));
    }

    @Test
    public void shouldReturnThreeWhenGivenIntegerMaxValue() throws Exception {
        assertEquals(536_870_902, TrailingZeros.zeros(Integer.MAX_VALUE));
    }
}