package ap1.bigHeights;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigHeightsTest {

    @Test
    public void globalTest(){
        assertEquals(1, BigHeights.sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
        assertEquals(0, BigHeights.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
        assertEquals(1, BigHeights.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
    }
}