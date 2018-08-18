package recursion1.count8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Count8Test {

    @Test
    public void globalTest(){
        assertEquals(2, Count8.count8(818));
        assertEquals(0, Count8.count8(9));
        assertEquals(3, Count8.count8(88));
        assertEquals(1, Count8.count8(18));
        assertEquals(4, Count8.count8(8818));
    }
}