package Other.evenOdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    @Test
    public void shouldReturnAnEmptyArrayWhenGivenAnEmptyArray(){
        assertArrayEquals(new int[] {}, EvenOdd.evenOdd(new int[] {}));
    }

    @Test
    public void shouldReturnOneElementArrayWhenGivenOneElementArray(){
        assertArrayEquals(new int[] {1}, EvenOdd.evenOdd(new int[] {1}));
        assertArrayEquals(new int[] {2}, EvenOdd.evenOdd(new int[] {2}));
    }

    @Test
    public void shouldReturnUnchangedArrayWhenGivenAlreadySortedArray(){
        assertArrayEquals(new int[] {2, 2, 1, 1}, EvenOdd.evenOdd(new int[] {2, 2, 1, 1}));
        assertArrayEquals(new int[] {2, 1}, EvenOdd.evenOdd(new int[] {2, 1}));
        assertArrayEquals(new int[] {2, 1, 1}, EvenOdd.evenOdd(new int[] {2, 1, 1}));
    }

    @Test
    public void shouldReturnASortedArray(){
        assertArrayEquals(new int[] {0, 0, 1, 1, 1}, EvenOdd.evenOdd(new int[] {1, 1, 0, 1, 0}));
        assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1, 1}, EvenOdd.evenOdd(new int[] {1, 0, 1, 0, 0, 1, 1}));
    }
}