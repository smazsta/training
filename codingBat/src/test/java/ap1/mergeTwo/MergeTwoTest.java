package ap1.mergeTwo;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoTest {

    @Test
    public void globalTest(){
        assertArrayEquals(new String[] {"a", "b", "c"},
                MergeTwo.mergeTwo(new String [] {"a", "c", "z"}, new String[] {"b", "f", "z"},
                        3));

        assertArrayEquals(new String[] {"a", "c", "f"},
                MergeTwo.mergeTwo(new String [] {"a", "c", "z"}, new String[] {"c", "f", "z"},
                        3));

        assertArrayEquals(new String[] {"c", "f", "g"},
                MergeTwo.mergeTwo(new String [] {"f", "g", "z"}, new String[] {"c", "f", "g"},
                        3));
    }
}