package functional1.noX;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NoXTest {

    private NoX noX;

    @Before
    public void setup(){
        noX = new NoX();
    }

    @Test
    public void test1() {
        List<String> actual = Arrays.asList("ax", "bb", "cx");
        List<String> expected = Arrays.asList("a", "bb", "c");

        assertTrue(expected.equals(noX.noX(actual)));
    }

    @Test
    public void test2() {
        List<String> actual = Arrays.asList("aaaxx", "xxbbb", "CxCxCx");
        List<String> expected = Arrays.asList("aaa", "bbb", "CCC");

        assertTrue(expected.equals(noX.noX(actual)));
    }

    @Test
    public void test3() {
        List<String> actual = Arrays.asList("x");
        List<String> expected = Arrays.asList("");

        assertTrue(expected.equals(noX.noX(actual)));
    }
}