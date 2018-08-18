package ap1.userCompare;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserCompareTest {

    @Test
    public void globalTest(){
        assertEquals(-1, UserCompare.userCompare("bb", 1, "zz", 2));
        assertEquals(1, UserCompare.userCompare("bb", 1, "aa", 2));
        assertEquals(0, UserCompare.userCompare("bb", 1, "bb", 1));
    }
}