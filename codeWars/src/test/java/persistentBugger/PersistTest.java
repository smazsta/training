package persistentBugger;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersistTest {

    @Test
    public void globalTests(){
        assertEquals(3, Persist.persistence(39));
        assertEquals(4, Persist.persistence(999));
        assertEquals(0, Persist.persistence(4));
        assertEquals(1, Persist.persistence(10));
        assertEquals(1, Persist.persistence(90));
        assertEquals(3, Persist.persistence(88));
        assertEquals(2, Persist.persistence(25));
        assertEquals(3, Persist.persistence(888));
        assertEquals(1, Persist.persistence(100));
    }

}