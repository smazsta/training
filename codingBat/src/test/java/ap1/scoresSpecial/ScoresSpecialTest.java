package ap1.scoresSpecial;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoresSpecialTest {

    @Test
    public void globalTest(){
        assertEquals(40, ScoresSpecial.scoresSpecial(new int[] {12, 10, 4}, new int[] {2, 20, 30}));
        assertEquals(40, ScoresSpecial.scoresSpecial(new int[] {20, 10, 4}, new int[] {2, 20, 10}));
        assertEquals(20, ScoresSpecial.scoresSpecial(new int[] {12, 11, 4}, new int[] {2, 20, 31}));
    }
}