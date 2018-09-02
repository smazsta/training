package string3.sumNumbers;

import java.util.Arrays;

public class SumNumbers {

    public int sumNumbers(String str) {
        int sum = 0;
        if(!str.matches(".*\\d+.*")){
            return 0;
        }
        String numbers = str.replaceAll("\\D+", " ");

        return Arrays.asList(numbers.trim().split(" "))
                .stream()
                .mapToInt(i -> Integer.parseInt(i))
                .sum();
    }
}
