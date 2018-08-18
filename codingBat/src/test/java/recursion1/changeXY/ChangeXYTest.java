package recursion1.changeXY;

import org.junit.Test;

import static org.junit.Assert.*;

public class ChangeXYTest {

    @Test
    public void globalTest(){
        assertEquals("yhiyhiyhihi", ChangeXY.changeXY("xhixhixhihi"));
        assertEquals("hello", ChangeXY.changeXY("hello"));
        assertEquals("hiy", ChangeXY.changeXY("hix"));
        assertEquals("yhiyhiy", ChangeXY.changeXY("xhixhix"));
        assertEquals("y", ChangeXY.changeXY("x"));
        assertEquals("", ChangeXY.changeXY(""));
    }
}