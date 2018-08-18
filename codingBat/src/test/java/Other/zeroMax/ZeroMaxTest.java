package Other.zeroMax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroMaxTest {

    @Test
    public void globalTests(){
        assertArrayEquals(new int[]{5, 5, 3, 3}, ZeroMax.function(new int[]{0, 5, 0, 3}));
        assertArrayEquals(new int[]{3, 4, 3, 3}, ZeroMax.function(new int[]{0, 4, 0, 3}));
        assertArrayEquals(new int[]{1, 1, 0}, ZeroMax.function(new int[]{1, 1, 0}));
    }
}