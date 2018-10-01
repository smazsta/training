package map1.topping2;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Topping2Test {

    private Topping2 t2;

    @Before
    public void setup(){
        t2 = new Topping2();
    }

    @Test
    public void test1(){
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("yogurt", "cherry");
        expectedMap.put("ice cream", "cherry");

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("ice cream", "cherry");

        Map<String, String> resultMap = t2.topping2(inputMap);

        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void test2(){
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("yogurt", "salt");

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("yogurt", "salt");

        Map<String, String> resultMap = t2.topping2(inputMap);

        assertEquals(expectedMap, resultMap);
    }

    @Test
    public void test3(){
        Map<String, String> expectedMap = new HashMap<>();
        expectedMap.put("yogurt", "cherry");
        expectedMap.put("spinach", "nuts");
        expectedMap.put("ice cream", "cherry");

        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("spinach", "dirt");
        inputMap.put("ice cream", "cherry");

        Map<String, String> resultMap = t2.topping2(inputMap);

        assertEquals(expectedMap, resultMap);
    }

}