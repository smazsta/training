package ap1.scoresAverage;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoresAverageTest {
    @Test
    public void shouldReturnAnEmptyArrayWhenGivenAnEmptyArray(){
        assertEquals(4, ScoresAverage.scoresAverage(new int[]{2, 2, 4, 4}));
        assertEquals(4, ScoresAverage.scoresAverage(new int[]{4, 4, 4, 2, 2, 2}));
        assertEquals(4, ScoresAverage.scoresAverage(new int[]{3, 4, 5, 1, 2, 3}));
    }
}