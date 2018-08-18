/**
 * The number 89 is the first integer with more than one digit that fulfills
 * the property partially introduced in the title of this kata. What's
 * the use of saying "Eureka"? Because this sum gives the same number.
 *
 * In effect: 89 = 8^1 + 9^2
 *
 * The next number in having this property is 135.
 *
 * See this property again: 135 = 1^1 + 3^2 + 5^3
 *
 * We need a function to collect these numbers, that may receive two integers a, b
 * that defines the range [a, b] (inclusive) and outputs a list of the sorted numbers
 * in the range that fulfills the property described above.
 *
 * If there are no numbers of this kind in the range [a, b] the function should output
 * an empty list.
 */

package eureka;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class SumDigPower {

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> list = LongStream.range(a, b)
                .filter(i -> isValid(i))
                .boxed()
                .collect(Collectors.toList());

        return list;
    }

    public static boolean isValid(long number){
        long sum = 0;
        String[] array = String.valueOf(number).split("");
        for (int i = 0; i < array.length; i++) {
            sum = sum + (long) Math.pow(Long.parseLong(array[i]), i + 1);
        }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumDigPow(1, 90).toArray()));
    }
}







