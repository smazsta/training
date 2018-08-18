package recursion1.changePi;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChangePiTest {

    @Test
    public void globalTest(){
        assertEquals("x3.14x", ChangePi.changePi("xpix"));
        assertEquals("x3.14x3.14x3.14x", ChangePi.changePi("xpixpixpix"));
        assertEquals("3.14", ChangePi.changePi("pi"));
        assertEquals("ip", ChangePi.changePi("ip"));
        assertEquals("", ChangePi.changePi(""));
        assertEquals("3.143.14", ChangePi.changePi("3.14pi"));
        assertEquals("3.143.14i", ChangePi.changePi("3.14pii"));
    }
}