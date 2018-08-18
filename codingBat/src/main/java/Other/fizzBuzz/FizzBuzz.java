package Other.fizzBuzz;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static String[] fizzBuzz(int start, int end) {
        return IntStream.range(start, end)
                .boxed()
                .map(i -> i.toString())
                .map(i -> {
                    if (Integer.parseInt(i) % 3 == 0 && Integer.parseInt(i) % 5 == 0) {
                        return "FizzBuzz";
                    } else if (Integer.parseInt(i) % 3 == 0) {
                        return "Fizz";
                    } else if (Integer.parseInt(i) % 5 == 0) {
                        return "Buzz";
                    }
                    return i;
                })
                .collect(Collectors.toList()).toArray(new String[0]);
    }
}
