import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
    sayGreeting();
    }

    public static void sayGreeting() {
        // Code based on https://stackoverflow.com/questions/70433017/reading-time-from-string-into-morning-afternoon-evening-night

        LocalTime time = LocalTime.now();
        int d = 100*time.getHour() + time.getMinute();


        //Debug info:
        System.out.println(time.toString() + " - " + d );

        String greeting = "Good ";


        if (d <= 800 || d > 2330) {
            greeting += "Night";
        } else if (d <= 1200) {
            greeting += "Morning";
        } else if (d <= 1800) {
            greeting += "Afternoon";
        } else {
            greeting += "Evening";
        }

        System.out.println(greeting);
    }
}