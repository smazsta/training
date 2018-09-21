package transformToPrime;

import org.junit.Test;

import static org.junit.Assert.*;

public class TransformToPrimeTest {

    @Test
    public void checkSmallArraySize()
    {
        assertEquals(1, TransformToPrime.minimumNumber(new int[]{3,1,2}));
        assertEquals(0, TransformToPrime.minimumNumber(new int[]{5,2}));
        assertEquals(0, TransformToPrime.minimumNumber(new int[]{1,1,1}));
    }

    @Test
    public void checkLargerArraySize()
    {
        assertEquals(5, TransformToPrime.minimumNumber(new int[]{2,12,8,4,6}));
        assertEquals(2, TransformToPrime.minimumNumber(new int[]{50,39,49,6,17,28}));
    }

}