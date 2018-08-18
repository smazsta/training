package ap1.hasOne;

import java.util.Optional;
import java.util.stream.Stream;

public class HasOne {

    public static boolean hasOne(int n) {
        Optional<String> opt = Stream.of(String.valueOf(n)
                .split(""))
                .filter(i -> i.equals("1"))
                .findAny();
        return opt.isPresent() ? true : false;
    }
}
