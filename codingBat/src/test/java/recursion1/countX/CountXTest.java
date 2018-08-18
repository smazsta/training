package recursion1.countX;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountXTest {

    @Test
    public void globalTest(){
        assertEquals(4, CountX.countX("xxhixx"));
        assertEquals(0, CountX.countX("hello"));
        assertEquals(1, CountX.countX("hellox"));
        assertEquals(1, CountX.countX("x"));
        assertEquals(2, CountX.countX("xhellox"));
        assertEquals(0, CountX.countX(""));
    }
}