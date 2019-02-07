package functional2.noNeg;

import java.util.List;
import java.util.stream.Collectors;

public class NoNeg {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(i -> i >= 0)
                .collect(Collectors.toList());
    }
}
