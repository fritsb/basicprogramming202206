import java.util.Scanner;

public class UserInteraction {
    public static int askUserInput() {
        // Code below is based on: https://kodejava.org/how-do-i-validate-input-when-using-scanner/
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            // was: System.out.println("Voer een positief getal in: ");
            System.out.println("Voer een getal in tussen 1 en 5: ");
            while(!scanner.hasNextInt()) {
                String input = scanner.next();
                System.out.println("Dit is geen geldige invoer: " + input);
               // was: System.out.println("Voer nogmaals een positief getal in: ");
                System.out.println("Voer nogmaals een getal in tussen 1 en 5: ");
            }
            number = scanner.nextInt();
                // System.out.println("Ingevoerde getal is: " + number);
        }
        // was: while(number < 0);
        while(number < 0 || number > 5);

        return number;
    }
}
