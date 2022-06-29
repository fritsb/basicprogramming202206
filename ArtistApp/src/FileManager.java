import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileManager {

    // Voorbeeld van methode die zonder een object gegevens wegschrijft
    public static void writeInfo( String info, int data ) {
        File dataFile = new File("data.txt"); // Vervang "data.txt" eventueel door "document.decrypted"
        try {
            FileWriter fw = new FileWriter(dataFile, true);
            BufferedWriter printer = new BufferedWriter(fw);
            printer.write( info + " - " + data );
            printer.newLine();
            printer.close();
        }
        catch(Exception ex) {
            System.out.println("Fout met bestand" + ex.getMessage());
        }

       /* if(dataFile.exists()) {
            System.out.println("Bestand bestaat");
        }
        else {
            System.out.println("Bestand bestaat niet");
        } */
    }

    // Voorbeeld van een methode die een object wegschrijft naar een tekst-bestand.
    public static void writeArtist( Artist newArtist ) {
        File dataFile = new File("data.txt");  // Vervang "data.txt" eventueel door "document.decrypted"
        try {
            FileWriter fw = new FileWriter(dataFile, true);
            BufferedWriter printer = new BufferedWriter(fw);
            printer.write( newArtist.getInfo() );
            printer.newLine();
            printer.close();
        }
        catch(Exception ex) {
            System.out.println("Fout met bestand" + ex.getMessage());
        }

       /* if(dataFile.exists()) {
            System.out.println("Bestand bestaat");
        }
        else {
            System.out.println("Bestand bestaat niet");
        } */
    }
}
