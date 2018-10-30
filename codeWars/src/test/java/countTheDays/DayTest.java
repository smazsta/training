package countTheDays;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import java.util.Date;
import java.util.Random;

public class DayTest {
    @Test
    public void standardTests() {
        Day d = new Day();
        assertEquals("The day is in the past!", d.countDays(new Date(2000-1900,12,24))); //year 2000
        assertEquals("Today is the day!", d.countDays(new Date()));
    }
}