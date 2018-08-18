package Other.fizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void shouldReturnChangedArray(){
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz"},
                FizzBuzz.fizzBuzz(1, 6));
        assertArrayEquals(new String[] {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"},
                FizzBuzz.fizzBuzz(1, 8));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz",
                "7", "8", "Fizz", "Buzz"},
                FizzBuzz.fizzBuzz(1, 11));
    }

    @Test
    public void shouldReturnAnEmptyArrayWhenGivenAnEmptyArray(){
        assertArrayEquals(new String[]{}, FizzBuzz.fizzBuzz(0, 0));
    }

    @Test
    public void shouldReturnAnEmptyArrayWhenArgumentsProvidedInReverseOrder(){
        assertArrayEquals(new String[]{}, FizzBuzz.fizzBuzz(5, 1));
    }


}