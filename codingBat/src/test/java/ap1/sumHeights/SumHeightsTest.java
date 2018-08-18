package ap1.sumHeights;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumHeightsTest {

    @Test
    public void globalTest(){
        assertEquals(6, SumHeights.sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, SumHeights.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
        assertEquals(11, SumHeights.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
    }
}