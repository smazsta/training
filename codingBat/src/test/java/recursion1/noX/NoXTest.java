package recursion1.noX;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoXTest {

    @Test
    public void globalTest2(){
        assertEquals("ab", NoX.noX("abx"));
        assertEquals("ab", NoX.noX("xabx"));
        assertEquals("ab", NoX.noX("xab"));
        assertEquals("ab", NoX.noX("xaxbx"));
        assertEquals("", NoX.noX(""));
        assertEquals("", NoX.noX("x"));
    }
}