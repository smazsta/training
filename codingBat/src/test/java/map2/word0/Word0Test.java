package map2.word0;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Word0Test {

    private Word0 w0;

    @Before
    public void setup(){
        w0 = new Word0();
    }

    @Test
    public void test1(){
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("a", 0);
        expectedMap.put("b", 0);

        Map<String, Integer> resultMap = w0.word0(
                new String[]{"a", "b", "a", "b"});

        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void test2(){
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("a", 0);
        expectedMap.put("b", 0);
        expectedMap.put("c", 0);

        Map<String, Integer> resultMap = w0.word0(
                new String[]{"a", "b", "a", "c", "b"});

        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void test3(){
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("a", 0);
        expectedMap.put("b", 0);
        expectedMap.put("c", 0);

        Map<String, Integer> resultMap = w0.word0(
                new String[]{"c", "b", "a"});

        assertEquals(expectedMap, resultMap);
    }

}