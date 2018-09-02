import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

class Gigasecond {

    private LocalDateTime birthDateTime;
    private final long BILLION = 1_000_000_000;

    Gigasecond(LocalDate birthDate) {
        this.birthDateTime = Optional.ofNullable(birthDate.atStartOfDay())
                                        .orElse(LocalDateTime.now().with(LocalDateTime.MIN));
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.birthDateTime = Optional.ofNullable(birthDateTime)
                                        .orElse(LocalDateTime.now().with(LocalDateTime.MIN));
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(BILLION);
    }
}
