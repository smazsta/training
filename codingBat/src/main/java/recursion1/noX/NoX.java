package recursion1.noX;

public class NoX {

    public static String noX(String str) {
        if(str.isEmpty()) return "";
        else if(str.charAt(0) == 'x') return "" + noX(str.substring(1));
        else return str.charAt(0) + noX(str.substring(1));

    }
}
