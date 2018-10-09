package sumSquaredDivisors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {

        List<String> resultList = new ArrayList<>();
        String resultString;

        long divisorsSquaredSum;
        long sqrtSum;

        while(m <= n){
            divisorsSquaredSum = sumSquaredDivisors(m);
            sqrtSum = (long) Math.sqrt(divisorsSquaredSum);

            if(Math.pow(sqrtSum, 2) == divisorsSquaredSum){
                resultString = "[" + String.valueOf(m) + ", " + String.valueOf(divisorsSquaredSum) + "]";
                resultList.add(resultString);
            }
            m++;
        }

        return Arrays.toString(resultList.toArray());
    }

    public static long sumSquaredDivisors(long m) {

        return LongStream.rangeClosed(1, m)
                .filter(i -> m % i == 0)
                .map(i -> i*i)
                .sum();
    }
}
