import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");  // Deze regel code wordt standaard toegevoegd door IntelliJ, met de //-tekens zetten we dit in commentaar.

        int teacherAge = 36; // Op deze regel maken we een variabele aan van het type int, met de naam teacherAge en de waarde 36.
        System.out.println("De leeftijd van de docent is: \n\t" + teacherAge); // Via deze regel kunnen we de waarde van de variabele op het scherm tonen. \n staat voor nieuwe regel, en \t voor een tab. \n\t kan je ook weglaten.

/*
        // Onderstaande regels code staan in commentaar; dit was als voorbeeld bedoeld om informatie aan te passen
        teacherAge = 37; // We overschrijven de oude waarde met een nieuwe waarde
        System.out.println("De leeftijd van de docent is: " + teacherAge);
        teacherAge++; // We verhogen de oude waarde met 1 door middel van de ++ operators
        System.out.println("De leeftijd van de docent is: " + teacherAge);
        teacherAge = teacherAge  / 2; // We delen de oude waarde door 2 door middel van de / operator
        System.out.println("De leeftijd van de docent is: " + teacherAge);*/

        // Via een Scanner object kunnen we de gebruiker gegevens laten invoeren.
        Scanner input = new Scanner(System.in); // We maken een Scanner-object aan met de naam input
        System.out.println("Voer naam in: ");
       // String teacherName = "Frits";   // Deze regel staat in commentaar; we maakte hier een String-variabele aan met de naam teacherAge en de waarde Frits
        String teacherName = input.nextLine(); // Via deze regel kunnen we de gebruiker de waarde laten invullen voor de teacherName-variabele; hiervoor gebruiken we het Scanner-object met de naam input, en de methode nextLine() om een regel tekst op te slaan.
        System.out.print("De naam van de docent is: ");
        System.out.println(teacherName.toLowerCase()); // Via deze regel kunnen we de waarde van de teacherName-variabele op het scherm afbeelden. We gebruiken ook de toLowerCase()-methode om alles naar kleine letters om te zetten.
        // Zie overzicht van String-methoden op: https://www.w3schools.com/java/java_ref_string.asp

        boolean teacherOlderThan70 = teacherAge > 70; // We maken een boolean-variabele aan met de naam teacherOlderThan70, en de waarde is WAAR / ONWAAR (true / false)
        // uit de check teacherAge > 70 komt een boolean-waarde; dit is waar of onwaar (in dit geval onwaar)

        // if(teacherAge > 70) { // Deze regel is vervangen door de onderstaande regel met de bovenstaande boolean.
        if (teacherOlderThan70) { // Als dit  WAAR is, dan wordt regel 33 uitgevoerd. Als dit ONWAAR is, dan wordt regel 35 uitgevoerd.
            System.out.println("U mag met pensioen");
        } else {
            System.out.println("U mag niet met pensioen");
        }

    }
}
