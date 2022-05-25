import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        // Aanmaken van userInput en counter-variabelen, en het Scanner-object
        Scanner sc = new Scanner(System.in);
        int userInput = -1;
        int counter = 0;

        // While-lus controleert of userInput lager dan 0 OF hoger dan 10 is; zolang dit
        // waar is blijft de while-lus doorlopen
        while(userInput < 0 || userInput > 10) {
            if(counter > 0) { // Wanneer de counter hoger is dan 0 dan krijgt de gebruiker een melding over Ongeldige invoer.
                System.out.println("Ongeldige invoer.");
                if(counter == 3) { // Wanneer counter gelijk is dan 3 stopt de applicatie ermee.
                    System.out.println("Geef het op en ga terug naar groep 3");
                    System.exit(0);
                }
                //else {
                //    System.out.println("Je hebt nog zoveel pogingen over: " + (3 - counter) );
                //}
            }
            //else {
            //    System.out.println("Welkom bij mijn app. ");
            //}

            System.out.println("Geef een getal op tussen 1 en 10: ");
            userInput = sc.nextInt();

            counter++;
        }
        System.out.println("Het volgende getal is ingevoerd: " + userInput);

        /*
        // Voorbeeld met for-loop en een String
        // Hierbij gebruiken we de String-methoden length() en charAt().

        String courseName = "Basis Programmeren";

        for(int i = 0; i < courseName.length(); i++) {
            System.out.println( courseName.charAt(i)  );
        }

         */

        /*
        // Voorbeeld met for-loop van 0 t/m 9
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }*/

    }
}