package ap1.copyEndy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyEndyTest {

    @Test
    public void globalTest(){
        assertArrayEquals(new int[] {9, 90}, CopyEndy.copyEndy(new int[] {9, 11, 90, 22, 6},2));
        assertArrayEquals(new int[] {9, 90, 6}, CopyEndy.copyEndy(new int[] {9, 11, 90, 22, 6},3));
        assertArrayEquals(new int[] {1, 1}, CopyEndy.copyEndy(new int[] {12, 1, 1, 13, 0, 20},2));
    }
}