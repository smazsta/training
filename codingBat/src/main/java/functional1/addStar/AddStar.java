package functional1.addStar;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(i -> i + "*")
                .collect(Collectors.toList());
    }
}
