package recursion1.count7;

public class Count7 {

    public static int count7(int n) {
        if(n == 0) return n;
        else if(n % 10 == 7) return 1 + count7(n / 10);
        else return count7(n / 10);
    }
}
