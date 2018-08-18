package recursion1.bunnyEars2;

import org.junit.Test;

import static org.junit.Assert.*;

public class BunnyEars2Test {

    @Test
    public void globalTest(){
        assertEquals(0, BunnyEars2.bunnyEars2(0));
        assertEquals(2, BunnyEars2.bunnyEars2(1));
        assertEquals(5, BunnyEars2.bunnyEars2(2));
    }

}