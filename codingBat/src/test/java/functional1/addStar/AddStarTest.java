package functional1.addStar;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AddStarTest {

    private AddStar addStar;

    @Before
    public void setup(){
        addStar = new AddStar();
    }

    @Test
    public void test1() {
        List<String> actual = Arrays.asList("ax", "bb", "cx");
        List<String> expected = Arrays.asList("ax*", "bb*", "cx*");

        assertTrue(expected.equals(addStar.addStar(actual)));
    }

    @Test
    public void test2() {
        List<String> actual = Arrays.asList("aaaxx", "xxbbb", "CxCxCx");
        List<String> expected = Arrays.asList("aaaxx*", "xxbbb*", "CxCxCx*");

        assertTrue(expected.equals(addStar.addStar(actual)));
    }

    @Test
    public void test3() {
        List<String> actual = Arrays.asList("x");
        List<String> expected = Arrays.asList("x*");

        assertTrue(expected.equals(addStar.addStar(actual)));
    }
}