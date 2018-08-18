package ap1.dividesItself;

import java.util.OptionalInt;

public class DivideItself {

    public static boolean dividesSelf(int n) {
        for(int val = n; val != 0; val /= 10) {
            int digit = val % 10;
            if(digit == 0 || n % digit != 0)
                return false;
        }

        return true;
    }
}
