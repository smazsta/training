package recursion1.sumDigits;

public class SumDigits {

    public static int sumDigits(int n) {
        if(n < 10) return n;
        else return n % 10 + sumDigits(n/10);
    }
}
