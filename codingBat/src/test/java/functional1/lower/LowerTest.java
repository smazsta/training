package functional1.lower;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LowerTest {

    private Lower lower;

    @Before
    public void setup(){
        lower = new Lower();
    }

    @Test
    public void test1() {
        List<String> actual = Arrays.asList("Hello", "Hi");
        List<String> expected = Arrays.asList("hello", "hi");

        assertTrue(expected.equals(lower.lower(actual)));
    }

    @Test
    public void test2() {
        List<String> actual = Arrays.asList("AAA", "BBB", "CCC");
        List<String> expected = Arrays.asList("aaa", "bbb", "ccc");

        assertTrue(expected.equals(lower.lower(actual)));
    }

    @Test
    public void test3() {
        List<String> actual = Arrays.asList("KiTTeN", "CHOColaTE");
        List<String> expected = Arrays.asList("kitten", "chocolate");

        assertTrue(expected.equals(lower.lower(actual)));
    }
}