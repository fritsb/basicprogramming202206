import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We kunnen de askUserInput()-methode uit de UserInteraction-klasse rechtstreeks aanroepen omdat het een statische methode is.
        // Er hoeft dus geen object aangemaakt te worden

        int userInput = UserInteraction.askUserInput(); // de askUserInput()-methode geeft een (positief) getal terug. Dit getal slaan we op in de variabele userInput
        printNumber(userInput); // We kunnen de userInput variabele vervolgens weer meegeven aan een andere methode.

    }

    public static void printNumber(int number) {
        System.out.println("Ook hier bestaat het getal: " + number);
    }


}