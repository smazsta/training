/**
 * Write a function, persistence, that takes in a positive parameter num
 * and returns its multiplicative persistence, which is the number of times
 * you must multiply the digits in num until you reach a single digit.
 */

package persistentBugger;

public class Persist {

    public static int persistence(long n) {
        if (n < 10) return 0;

        long newValue;
        int output = 0;

        do {
            newValue = 1L;

            while (n > 0) {
                newValue = newValue * (n % 10);
                n = n / 10;
            }

            n = newValue;
            output++;
        } while (newValue / 10 > 0);

        return output;
    }

    public static int persistence2(long n) {
        if (n / 10 == 0) {
            return 0;
        }

        long newValue = 1, currentValue = n;

        for (currentValue = n; currentValue != 0; currentValue /= 10)
            newValue *= currentValue % 10;

        return persistence(newValue) + 1;
    }
}