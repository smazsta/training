package recursion1.triangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void globalTest(){
        assertEquals(0, Triangle.triangle(0));
        assertEquals(1, Triangle.triangle(1));
        assertEquals(3, Triangle.triangle(2));
    }
}