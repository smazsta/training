package ap1.commonTwo;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CommonTwoTest {

    @Test
    public void globalTest() {
            assertEquals(2, CommonTwo.commonTwo(new String[]{"a", "c", "x"}, new String[]{"b", "c", "d", "x"}));
            assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "c", "x"}, new String[]{"a", "b", "c", "x", "z"}));
            assertEquals(3, CommonTwo.commonTwo(new String[]{"a", "b", "c"}, new String[]{"a", "b", "c"}));
        }
}