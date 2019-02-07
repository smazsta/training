package howManyNumbers3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class HowManyNumbersTest {

    @Test
    public void shouldReturnAnEmptyListWhenGivenAllArgumentsAreZeros(){
        assertEquals(Collections.<Long>emptyList(),
                HowManyNumbers.findAll(0, 0));
    }

    @Test
    public void shouldReturnAnEmptyListWhenNoResultsFound(){
        assertEquals(Collections.<Long>emptyList(),
                HowManyNumbers.findAll(84, 4));
    }

    @Test
    public void shouldReturnOneWhenGivenTwoOnes(){
        assertEquals(Arrays.asList(1l, 1l, 1l),
                HowManyNumbers.findAll(1, 1));
    }

    @Test
    public void shouldReturnTheSameMinAndMaxWhenFoundOnlyOneResult(){
        assertEquals(Arrays.asList(1, 999, 999),
                HowManyNumbers.findAll(27, 3));
    }

    @Test
    public void shouldReturnAListWhenGivenCorrectArguments(){
        assertEquals(Arrays.asList(8, 118, 334),
                HowManyNumbers.findAll(10, 3));
    }
}