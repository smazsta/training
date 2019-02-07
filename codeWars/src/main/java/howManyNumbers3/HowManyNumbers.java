package howManyNumbers3;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class HowManyNumbers {

    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        List<Long> resultList = new ArrayList<>();

        LongSummaryStatistics longSummaryStatistics =
                LongStream.rangeClosed((long) Math.pow(10, numDigits - 1), ((long) Math.pow(10, numDigits) - 1))
                        .filter(i -> getSumOfDigits(i) == sumDigits)
                        .filter(HowManyNumbers::areDigitsIncreasing)
                        .summaryStatistics();

//        if (longSummaryStatistics.getCount() == 0) {
//            return Collections.<Long>emptyList();
//        }

        areDigitsIncreasing(577);
        resultList.add(longSummaryStatistics.getCount());
        resultList.add(longSummaryStatistics.getMin());
        resultList.add(longSummaryStatistics.getMax());

        return resultList;
    }

    public static long getSumOfDigits(final long number) {
        long sum = 0;
        long temp = number;
        for (int i = 1; i <= String.valueOf(number).length(); i++) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        return sum;
    }

    public static boolean areDigitsIncreasing(final long number) {
        return String.valueOf(number).chars().sorted().equals(String.valueOf(number));
    }
}
