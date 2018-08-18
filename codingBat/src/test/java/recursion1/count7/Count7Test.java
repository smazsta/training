package recursion1.count7;

import org.junit.Test;

import static org.junit.Assert.*;

public class Count7Test {

    @Test
    public void globalTest(){
        assertEquals(2, Count7.count7(717));
        assertEquals(0, Count7.count7(9));
        assertEquals(2, Count7.count7(77));
        assertEquals(1, Count7.count7(17));
    }

}