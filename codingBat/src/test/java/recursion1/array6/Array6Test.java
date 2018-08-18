package recursion1.array6;

import org.junit.Test;

import static org.junit.Assert.*;

public class Array6Test {

    @Test
    public void globalTest(){
        assertEquals(true, Array6.array6(new int[]{1, 6, 4}, 0));
        assertEquals(false, Array6.array6(new int[]{1, 4}, 0));
        assertEquals(false, Array6.array6(new int[]{1, 0, 4}, 0));
        assertEquals(true, Array6.array6(new int[]{6, 0, 4}, 0));
        assertEquals(true, Array6.array6(new int[]{6}, 0));
    }
}