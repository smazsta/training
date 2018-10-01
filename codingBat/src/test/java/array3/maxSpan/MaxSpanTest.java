package array3.maxSpan;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSpanTest {
    private MaxSpan maxSpan;

    @Before
    public void setup(){
        maxSpan = new MaxSpan();
    }

    @Test
    public void globalTest(){
        long start = System.currentTimeMillis();
        assertEquals(4, maxSpan.maxSpan(new int[] {1, 2, 1, 1, 3}));
        assertEquals(6, maxSpan.maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
        assertEquals(6, maxSpan.maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
        assertEquals(0, maxSpan.maxSpan(new int[] {}));
        assertEquals(1, maxSpan.maxSpan(new int[] {1}));
        assertEquals(3, maxSpan.maxSpan(new int[] {3, 3, 3}));

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}