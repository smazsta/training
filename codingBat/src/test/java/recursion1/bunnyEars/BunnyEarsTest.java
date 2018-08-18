package recursion1.bunnyEars;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunnyEarsTest {

    @Test
    public void globalTest(){
        assertEquals(0, BunnyEars.bunnyEars(0));
        assertEquals(2, BunnyEars.bunnyEars(1));
        assertEquals(4, BunnyEars.bunnyEars(2));
    }
}