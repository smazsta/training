package map1.topping1;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Topping1Test {

    private Topping1 t1;

    @Before
    public void setup(){
        t1 = new Topping1();
    }

    @Test
    public void test1(){
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("ice cream", "cherry");
        expectedMap.put("bread", "butter");

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("ice cream", "peanut");

        Map<String, String> resultMap = t1.topping1(inputMap);

        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void test2(){
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("bread", "butter");

        Map<String, String> inputMap = new HashMap<>();

        Map<String, String> resultMap = t1.topping1(inputMap);

        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void test3(){
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("bread", "butter");
        expectedMap.put("pancake", "syrup");

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("pancake", "syrup");

        Map<String, String> resultMap = t1.topping1(inputMap);

        assertEquals(expectedMap, resultMap);
    }
}