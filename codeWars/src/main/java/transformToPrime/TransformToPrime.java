package transformToPrime;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TransformToPrime {

    public static int minimumNumber(int[] numbers) {

        int sum = Arrays.stream(numbers).sum();

        return IntStream.rangeClosed(sum, 2*sum)
                .filter(i -> isPrime(i))
                .findFirst()
                .orElse(sum) - sum;
    }

    private static boolean isPrime(int number){
        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(i -> number % i == 0);
    }
}
