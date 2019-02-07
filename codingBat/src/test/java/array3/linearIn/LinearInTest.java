package array3.linearIn;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinearInTest {

    @Test
    public void shouldReturnTrueWhenBothArraysEmpty(){
        int[] outerArray = new int[]{};
        int[] innerArray = new int[]{};
        Assert.assertTrue(LinearIn.linearIn(outerArray, innerArray));
    }

    @Test
    public void shouldReturnTrueWhenInnerArrayIsEmpty(){
        int[] outerArray = new int[]{5, 6, 7};
        int[] innerArray = new int[]{};
        Assert.assertTrue(LinearIn.linearIn(outerArray, innerArray));
    }

    @Test
    public void shouldReturnFalseWhenOuterArrayIsEmpty(){
        int[] outerArray = new int[]{};
        int[] innerArray = new int[]{5, 3, 9};
        Assert.assertFalse(LinearIn.linearIn(outerArray, innerArray));
    }

    @Test
    public void shouldReturnFalseWhenInnerArrayIsBiggerThanOuterArray(){
        int[] outerArray = new int[]{2, 1};
        int[] innerArray = new int[]{5, 3, 9};
        Assert.assertFalse(LinearIn.linearIn(outerArray, innerArray));
    }

    @Test
    public void shouldReturnTrueCases(){
        int[] outerArray = new int[]{2, 1, 5, 3, 9};
        int[] innerArray = new int[]{5, 3, 9};
        Assert.assertTrue(LinearIn.linearIn(outerArray, innerArray));
    }

    @Test
    public void shouldReturnFalseCases(){
        int[] outerArray = new int[]{2, 1, 5, 6, 4, 9,};
        int[] innerArray = new int[]{5, 3, 9};
        Assert.assertFalse(LinearIn.linearIn(outerArray, innerArray));
    }


}