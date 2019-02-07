package functional1.noX;

import java.util.List;
import java.util.stream.Collectors;

public class NoX {

    public List<String> noX(List<String> strings) {
        return strings.stream()
                .map(i -> i.replaceAll("x", ""))
                .collect(Collectors.toList());
    }
}
