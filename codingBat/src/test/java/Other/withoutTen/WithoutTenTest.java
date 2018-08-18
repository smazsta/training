package Other.withoutTen;

import org.junit.Test;

import static org.junit.Assert.*;

public class WithoutTenTest {

    @Test
    public void globalTests(){
        assertArrayEquals(new int[] {1, 2, 0, 0}, WithoutTen.function(new int[] {1, 10, 10, 2}));
        assertArrayEquals(new int[] {10, 2, 10}, WithoutTen.function(new int[] {2, 0, 0}));
        assertArrayEquals(new int[] {1, 99, 10}, WithoutTen.function(new int[] {1, 99, 0}));
        assertArrayEquals(new int[] {10, 13, 10, 14}, WithoutTen.function(new int[] {13, 14, 0, 0}));
        assertArrayEquals(new int[] {10, 13, 10, 14, 10}, WithoutTen.function(new int[] {13, 14, 0, 0, 0}));
        assertArrayEquals(new int[] {1}, WithoutTen.function(new int[] {1}));
        assertArrayEquals(new int[] {1, 12}, WithoutTen.function(new int[] {1, 12}));
        assertArrayEquals(new int[] {10}, WithoutTen.function(new int[] {0}));
        assertArrayEquals(new int[] {}, WithoutTen.function(new int[] {}));
    }
}