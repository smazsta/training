package trailingZeros;

public class TrailingZeros {

    public static int zeros(int n) {

        if (n/5 == 0) {
            return 0;
        } else {
            return n/5 + zeros(n/5);
        }
    }
}
