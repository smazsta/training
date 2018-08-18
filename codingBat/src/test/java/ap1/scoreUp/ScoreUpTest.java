package ap1.scoreUp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScoreUpTest {

    @Test
    public void globalTest(){
        assertEquals(6, ScoreUp.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "c", "b", "c"}));
        assertEquals(11, ScoreUp.scoreUp(new String[] {"a", "a", "b", "b"},new String[] {"a", "a", "b", "c"}));
        assertEquals(16, ScoreUp.scoreUp(new String[] {"a", "a", "b", "b"},new String[] {"a", "a", "b", "b"}));
    }
}