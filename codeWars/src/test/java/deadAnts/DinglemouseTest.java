package deadAnts;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class DinglemouseTest {

    // Validate
    private static int expectedDeadAntCount(final String ants) {
        if (ants == null || ants.isEmpty()) return 0;
        final String remains = ants.replaceAll("ant","").replaceAll("[^ant]",""); // remove the live ants
        final String heads = remains.replaceAll("n","").replaceAll("t","");
        final String bodies = remains.replaceAll("a","").replaceAll("t","");
        final String tails = remains.replaceAll("a","").replaceAll("n","");
        return Math.max(heads.length(), Math.max(bodies.length(), tails.length()));
    }

    @Test
    public void noDeadAnts() {
        assertEquals(0, Dinglemouse.deadAntCount("ant ant ant ant"));
    }

    @Test
    public void noAntsAtAll() {
        assertEquals(0, Dinglemouse.deadAntCount(""));
        assertEquals(0, Dinglemouse.deadAntCount(null));
    }

    @Test
    public void someDeadAnts() {
        assertEquals(2, Dinglemouse.deadAntCount("ant anantt aantnt"));
        assertEquals(1, Dinglemouse.deadAntCount("antatn ant ant"));
    }

    @Test
    public void moreBitsOfAnts() {
        assertEquals(4, Dinglemouse.deadAntCount("ant a ant anatttt"));
        assertEquals(1, Dinglemouse.deadAntCount("antantantan"));
        assertEquals(5, Dinglemouse.deadAntCount("aaaaannnntttt"));
        assertEquals(5, Dinglemouse.deadAntCount("aaaannnnntttt"));
        assertEquals(5, Dinglemouse.deadAntCount("aaaannnnttttt"));
        assertEquals(1, Dinglemouse.deadAntCount("a n t"));
    }

    @Test
    public void otherJunk() {
        assertEquals(0, Dinglemouse.deadAntCount("... .. ..."));
        assertEquals(1, Dinglemouse.deadAntCount("$$$ant..a"));
    }

    @Test
    public void reportedBugs() {
        final String ants =  ".n..tt.n.nt..t.ntant..aaaaa..tn.na.aaat..n..tn.ntan.t";
        assertEquals(10, Dinglemouse.deadAntCount(ants));
        assertEquals(10, expectedDeadAntCount(ants));
    }

    @Test
    public void randomDeadAnts() {
        final String parts[] = "ant..ant..ant..ant..ant..ant..ant..ant..ant..ant..ant".split("");
        final List<String> partsList = Arrays.asList(parts);
        for (int i = 0; i < 20; i++) {
            Collections.shuffle(partsList);
            final String ants = String.join("",partsList);
            final int expectedCount = expectedDeadAntCount(ants);
            System.out.println(ants+" --> "+expectedCount);
            assertEquals(expectedCount, Dinglemouse.deadAntCount(ants));
        }
    }
}