package ap1.scoresClump;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoresClumpTest {
    @Test
    public void shouldReturnAnEmptyArrayWhenGivenAnEmptyArray(){
        assertEquals(true, ScoresClump.scoresClump(new int[]{3, 4, 5}));
        assertEquals(false, ScoresClump.scoresClump(new int[]{3, 4, 6}));
        assertEquals(true, ScoresClump.scoresClump(new int[]{1, 3, 5, 5}));
    }
}