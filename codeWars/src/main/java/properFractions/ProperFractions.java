package properFractions;

import java.util.stream.LongStream;

public class ProperFractions {

    public static long properFractions(long n) {

        long number;

        if (n < 0) {
            number = -n;
        } else {
            number = n;
        }

        if(number == 0 || number == 1) return 0;
        else if(isPrime(number)) return n - 1;

        int counter = 2;
        boolean hasSameDivisor;

        long[] numberDivisors = LongStream.range(2, number).filter(i -> number % i == 0).toArray();

        for (int i = 2; i <= number / 2; i++) {
            hasSameDivisor = false;
            for (int j = 0; j < numberDivisors.length; j++) {
                if(i % numberDivisors[j] == 0){
                    hasSameDivisor = true;
                }
            }
            if(!hasSameDivisor){
                counter += 2;
            }
        }

        return counter;
    }

    public static boolean isPrime(long number){
        return LongStream.rangeClosed(2, number/2).noneMatch(i -> number % i == 0);
    }
}

