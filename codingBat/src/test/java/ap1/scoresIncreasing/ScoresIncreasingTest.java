package ap1.scoresIncreasing;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoresIncreasingTest {

    @Test
    public void shouldReturnAnEmptyArrayWhenGivenAnEmptyArray(){
        assertEquals(true, ScoresIncreasing.scoresIncreasing(new int[]{1, 3, 4}));
        assertEquals(false, ScoresIncreasing.scoresIncreasing(new int[]{1, 3, 2}));
        assertEquals(true, ScoresIncreasing.scoresIncreasing(new int[]{1, 1, 4}));
    }
}
