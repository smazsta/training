/**
 * Given a string and a non-empty word string, return a version
 * of the original String where all chars have been replaced
 * by pluses ("+"), except for appearances of the word string,
 * which are preserved unchanged.
 */

package Other.plusOut;

public class PlusOut {

    public static String plusOut(String str, String word) {
        return str.replaceAll("[^(" + word + ")]", "+");
    }
}

