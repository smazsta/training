package panagramChecker;

import org.junit.Test;

import static org.junit.Assert.*;

public class PangramCheckerTest {

    @Test
    public void test1() {
        String pangram1 = "The quic4k brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }
}