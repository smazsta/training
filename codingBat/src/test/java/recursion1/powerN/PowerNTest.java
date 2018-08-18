package recursion1.powerN;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerNTest {

    @Test
    public void globalTest(){
        assertEquals(3, PowerN.powerN(3, 1));
        assertEquals(9, PowerN.powerN(3, 2));
        assertEquals(1, PowerN.powerN(3, 0));
        assertEquals(27, PowerN.powerN(3, 3));
    }
}