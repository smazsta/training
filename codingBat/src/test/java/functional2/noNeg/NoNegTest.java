package functional2.noNeg;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NoNegTest {

    private NoNeg noNeg;

    @Before
    public void setup(){
        noNeg = new NoNeg();
    }

    @Test
    public void test1() {
        List<Integer> actual = Arrays.asList(1, -2, 3);
        List<Integer> expected = Arrays.asList(1, 3);

        assertTrue(expected.equals(noNeg.noNeg(actual)));
    }

    @Test
    public void test2() {
        List<Integer> actual = Arrays.asList(-5, -6, -3, -4);
        List<Integer> expected = Arrays.asList();

        assertTrue(expected.equals(noNeg.noNeg(actual)));
    }

    @Test
    public void test3() {
        List<Integer> actual = Arrays.asList(4, 6, 7, 4, -1);
        List<Integer> expected = Arrays.asList(4, 6, 7, 4);

        assertTrue(expected.equals(noNeg.noNeg(actual)));
    }
}