package middlePermutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MiddlePermutationTest {

    @Test
    public void basicTests() {
//        assertEquals("bac", MiddlePermutation.findMidPerm("abc"));
//        assertEquals("bdca", MiddlePermutation.findMidPerm("abcd"));
//        assertEquals("cbxda", MiddlePermutation.findMidPerm("abcdx"));
//        assertEquals("cxgdba", MiddlePermutation.findMidPerm("larvuxgwmytobzicsqjdnphke"));
//        assertEquals("dczxgba", MiddlePermutation.findMidPerm("abcdxgz"));
//        assertEquals("hzxgdcba", MiddlePermutation.findMidPerm("abchdxgz"));
    }

    @Test
    public void twoLettersSortedWords() {
        assertEquals("gh", MiddlePermutation.findMidPerm("gh"));
        assertEquals("er", MiddlePermutation.findMidPerm("er"));
        assertEquals("ds", MiddlePermutation.findMidPerm("ds"));
    }

    @Test
    public void twoLettersUnsortedWords() {
        assertEquals("rt", MiddlePermutation.findMidPerm("tr"));
        assertEquals("aj", MiddlePermutation.findMidPerm("ja"));
        assertEquals("eq", MiddlePermutation.findMidPerm("qe"));
    }

    @Test
    public void threeLettersSortedWords() {
        assertEquals("bac", MiddlePermutation.findMidPerm("abc"));
        assertEquals("jdx", MiddlePermutation.findMidPerm("djx"));
        assertEquals("ras", MiddlePermutation.findMidPerm("ars"));
    }

    @Test
    public void threeLettersUnsortedWords() {
        assertEquals("bac", MiddlePermutation.findMidPerm("cba"));
        assertEquals("rgt", MiddlePermutation.findMidPerm("gtr"));
        assertEquals("oap", MiddlePermutation.findMidPerm("oap"));
    }

    @Test
    public void fourLettersSortedWords() {
        assertEquals("bdca", MiddlePermutation.findMidPerm("abcd"));
        assertEquals("gkjd", MiddlePermutation.findMidPerm("dgjk"));
        assertEquals("cjea", MiddlePermutation.findMidPerm("acej"));
    }

    @Test
    public void fiveLettersWords() {
        assertEquals("cbwda", MiddlePermutation.findMidPerm("abcdw"));
        assertEquals("jgrkd", MiddlePermutation.findMidPerm("dgjkr"));
        assertEquals("ectja", MiddlePermutation.findMidPerm("acejt"));
    }
}