package ap1.matchUp;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatchUpTest {
    @Test
    public void globalTest(){
        assertEquals(1, MatchUp.matchUp(new String[] {"aa", "bb", "cc"},new String[] {"aaa", "xx", "bb"}));
        assertEquals(2, MatchUp.matchUp(new String[] {"aa", "bb", "cc"},new String[] {"aaa", "b", "bb"}));
        assertEquals(1, MatchUp.matchUp(new String[] {"aa", "bb", "cc"},new String[] {"", "", "ccc"}));
    }
}