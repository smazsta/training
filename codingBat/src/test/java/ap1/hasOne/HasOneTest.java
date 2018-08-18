package ap1.hasOne;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HasOneTest {

    @Test
    public void globalTest(){
        assertTrue(HasOne.hasOne(10));
        assertFalse(HasOne.hasOne(220));
        assertFalse(HasOne.hasOne(320));
    }
}