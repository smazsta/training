package ap1.dividesItself;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivideItselfTest {

    @Test
    public void globalTest(){
        assertTrue(DivideItself.dividesSelf(128));
        assertTrue(DivideItself.dividesSelf(12));
        assertFalse(DivideItself.dividesSelf(120));
    }
}