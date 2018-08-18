package recursion1.countX;

public class CountX {

    public static int countX(String str) {
        if(str.isEmpty()) return 0;
        else if(str.charAt(0) == 'x')
            return 1 + countX(str.substring(1));
        else return countX(str.substring(1));
    }
}
