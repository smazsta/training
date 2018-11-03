package luckyTickets;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class LuckyTicketTest {
    LuckyTicket luckyTicket;

    @Before
    public void setUp() {
        luckyTicket = new LuckyTicket();
    }

    @Test
    public void testAll() {
        assertEquals(50412, luckyTicket.numberOfTickets(100000, 999999));
    }
}