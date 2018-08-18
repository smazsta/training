package Other.plusOut;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOutTest {

    @Test
    public void shouldReturnChangedArray(){
        assertEquals("++xy++", PlusOut.plusOut("12xy34", "xy"));
        assertEquals("1+++++", PlusOut.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", PlusOut.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("+++++++XYZ", PlusOut.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++abc+++", PlusOut.plusOut("abXYabcXYZ", "abc"));
    }
}
