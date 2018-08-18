package vasyaClerk;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LineTest {

    @Test
    public void globalTests(){
        Assert.assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
        assertEquals("NO", Line.Tickets(new int[] {25, 100}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50, 100, 25, 25}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50, 100, 25, 50}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25,25,25,25,25,25,25,100,100,100,100}));
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 100, 100, 100, 100}));
        assertEquals("NO", Line.Tickets(new int[] {100,100,100,100, 25, 25, 25, 25, 25, 25,25,25,25,25,25,25}));
        assertEquals("NO", Line.Tickets(new int[] {100,100,100, 25, 25, 25, 25, 25, 25,25,25,25,25,25,100}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25,25,25,25,25,25,25,50,50,50,50}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25,25,25,25,25,25,50,50,50,50,100}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25}));
        assertEquals("NO", Line.Tickets(new int[] {50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
        assertEquals("NO", Line.Tickets(new int[] {100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 50, 100, 50}));
        assertEquals("NO", Line.Tickets(new int[] {50, 50, 100}));
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 100}));
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 50, 50, 100}));
        assertEquals("NO", Line.Tickets(new int[] {25, 50, 50}));
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 100}));
        assertEquals("YES", Line.Tickets(new int[] {25, 50, 25, 100}));
        assertEquals("NO", Line.Tickets(new int[] {25, 25, 25, 25, 25, 100, 100}));
    }
}