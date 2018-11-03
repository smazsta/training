package luckyTickets;

import java.util.stream.IntStream;

public class LuckyTicket {

    public int numberOfTickets(int from, int to) {
        return (int)IntStream.rangeClosed(from, to).filter(i -> isLucky(i)).count();
    }

    private boolean isLucky(int ticketNumber){
        int firstHalf = ticketNumber / 1000;
        int secondHalf = ticketNumber % 1000;
        return sumOfDigits(firstHalf) == sumOfDigits(secondHalf);
    }

    private int sumOfDigits(int number){
        int sumOfDigits = 0;
        while (number > 0) {
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
        }
        return sumOfDigits;
    }


}
