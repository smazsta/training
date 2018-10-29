package worldBitsWar;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static worldBitsWar.BitWars.bitsWar;


public class BitWarsTest {

    static String ODDS = "odds win";
    static String EVENS = "evens win";
    static String TIE = "tie";

    @Test
    public void basicBitsWarTests() throws Exception {
//        assertThat(bitsWar(new int[]{1,5,12}), is(ODDS));
        assertThat(bitsWar(new int[]{7,-3,20}), is(EVENS));
        assertThat(bitsWar(new int[]{7,-3,-2,6}), is(TIE));
        assertThat(bitsWar(new int[]{-3,-5}), is(EVENS));
        assertThat(bitsWar(new int[]{}), is(TIE));
    }

}