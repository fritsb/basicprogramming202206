import java.text.SimpleDateFormat;

public class Main2 {
    // Code based on https://stackoverflow.com/questions/23068676/how-to-get-current-timestamp-in-string-format-in-java-yyyy-mm-dd-hh-mm-ss
    // 3e optie: http://www.java2s.com/example/java/java.util/determines-if-were-in-the-morning-or-afternoon.html

    public static void main(String[] args) {
        String timeStamp = new SimpleDateFormat("HH").format(new java.util.Date());
        int timeHours = Integer.parseInt(timeStamp);
        if (timeHours >= 06 && timeHours <= 12) {
            System.out.println("Goedemorgen!");
        } else if (timeHours >= 13 && timeHours <= 17) {
            System.out.println("Goedemiddag!");
        } else if (timeHours >= 18 && timeHours <= 23) {
            System.out.println("Goedeavond!");
        } else if (timeHours >= 00 && timeHours <= 05) {
            System.out.println("Goedenacht!");
        }
    }
}


