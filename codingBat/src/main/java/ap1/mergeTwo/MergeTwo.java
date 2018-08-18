package ap1.mergeTwo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MergeTwo {

    public static String[] mergeTwo(String[] a, String[] b, int n) {
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(b));
        set.addAll(Arrays.asList(a));
        return set.stream()
                .sorted()
                .limit(n)
                .toArray(String[]::new);
    }

}
