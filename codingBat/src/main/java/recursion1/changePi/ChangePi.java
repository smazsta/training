package recursion1.changePi;

public class ChangePi {

    public static String changePi(String str) {
        if(str.isEmpty()) return "";
        else if(str.length() < 2) return str;
        else if(str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            return "3.14" + changePi(str.substring(2));
        }
        else return str.charAt(0) + changePi(str.substring(1));
    }
}
