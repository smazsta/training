package ap1.sumHeights2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumHeights2Test {

    @Test
    public void globalTest(){
        assertEquals(7, SumHeights2.sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
        assertEquals(2, SumHeights2.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
        assertEquals(15, SumHeights2.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
    }
}