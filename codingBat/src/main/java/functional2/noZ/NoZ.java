package functional2.noZ;

import java.util.List;
import java.util.stream.Collectors;

public class NoZ {

    public List<String> noZ(List<String> strings) {
        return strings.stream()
                .filter(i -> i.indexOf("z") == -1)
                .collect(Collectors.toList());
    }
}
