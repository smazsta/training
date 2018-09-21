package numberExpandedForm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {

    @Test
    public void testSomething() {

        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        assertEquals("9000000", Kata.expandedForm(9000000));
    }
}