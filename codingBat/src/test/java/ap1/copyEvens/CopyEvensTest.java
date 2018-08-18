package ap1.copyEvens;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyEvensTest {

    @Test
    public void globalTest(){
        assertArrayEquals(new int[] {2, 4}, CopyEvens.copyEvens(new int[] {3, 2, 4, 5, 8},2));
        assertArrayEquals(new int[] {2, 4, 8}, CopyEvens.copyEvens(new int[] {3, 2, 4, 5, 8},3));
        assertArrayEquals(new int[] {6, 2, 4}, CopyEvens.copyEvens(new int[] {6, 1, 2, 4, 5, 8},3));
    }
}