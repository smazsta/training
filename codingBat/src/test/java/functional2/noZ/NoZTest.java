package functional2.noZ;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NoZTest {

    private NoZ noZ;

    @Before
    public void setup() {
        noZ = new NoZ();
    }

    @Test
    public void test1() {
        List<String> actual = Arrays.asList("axz", "bbz", "cx");
        List<String> expected = Arrays.asList("cx");

        assertTrue(expected.equals(noZ.noZ(actual)));
    }

    @Test
    public void test2() {
        List<String> actual = Arrays.asList("aaaxx", "xxbbb", "CxCxCxz");
        List<String> expected = Arrays.asList("aaaxx", "xxbbb");

        assertTrue(expected.equals(noZ.noZ(actual)));
    }

    @Test
    public void test3() {
        List<String> actual = Arrays.asList("z");
        List<String> expected = Arrays.asList();

        assertTrue(expected.equals(noZ.noZ(actual)));
    }
}