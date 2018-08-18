package ap1.commonTwo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonTwo {

    public static int commonTwo(String[] a, String[] b) {
        int count = 0;
        Set<String> aSet = Arrays.stream(a).collect(Collectors.toSet());
        Set<String> bSet = Arrays.stream(b).collect(Collectors.toSet());
        for (Iterator<String> itA = aSet.iterator(); itA.hasNext();) {
            String c = itA.next();
            for (Iterator<String> itB = bSet.iterator(); itB.hasNext();) {
                if (itB.next().equals(c)) {
                    count++;
                }
            }
        }
        return count;
    }
}
