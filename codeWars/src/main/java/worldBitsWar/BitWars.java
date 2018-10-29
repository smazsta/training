package worldBitsWar;

import java.util.Arrays;

public class BitWars {

    public static String bitsWar(int[] numbers) {
        int oddSum = Arrays.stream(numbers)
                .filter(i -> (i&1) != 0)
                .map(i -> Integer.bitCount(Math.abs(i)) * (i < 0 ? -1 : 1))
                .sum();

        int evenSum = Arrays.stream(numbers)
                .filter(i -> (i&1) == 0)
                .map(i -> Integer.bitCount(Math.abs(i)) * (i < 0 ? -1 : 1))
                .sum();

        if (evenSum < oddSum) {
            return "odds win";
        } else if (evenSum > oddSum) {
            return "evens win";
        }

        return "tie";
    }

}