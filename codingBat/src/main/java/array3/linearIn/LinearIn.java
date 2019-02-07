package array3.linearIn;

import java.util.Arrays;

public class LinearIn {

    public static boolean linearIn(int[] outer, int[] inner) {
        if (outer.length == 0 && inner.length > 0) return false;
        else if (inner.length > outer.length) return false;
        else if (inner.length == 0) return true;
        else {
            return Arrays.asList(outer).containsAll(Arrays.asList(inner));
        }
    }
}
