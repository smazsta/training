package humanReadableTime;

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int outSeconds = seconds % 60;
        int outMinutes = seconds / 60 % 60;
        int outHours = seconds / 3600;
        return String.format("%02d:%02d:%02d", outHours, outMinutes, outSeconds);
    }
}