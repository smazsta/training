package recursion1.countHi;

public class CountHi {

    public static int countHi(String str) {
        if(str.indexOf("hi") != -1)
            return 1 + countHi(str.substring(str.indexOf("hi") + 2));
        else return 0;
    }
}
