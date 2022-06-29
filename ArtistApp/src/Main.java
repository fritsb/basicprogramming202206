import java.io.File;

public class Main {
    public static void main(String[] args) {
        String key = "Mary has one cat"; // String-key met 16 karakters
        File inputFile = new File("data.txt"); // Het originele bestand met data, dit bestand is alleen de 1e keer in principe nodig. Daarna kan je encrypted/decrypted-versies gebruiken
        File encryptedFile = new File("document.encrypted"); // Het encrypted bestand (wat na het uitvoeren van de applicatie bewaard moet blijven)
        File decryptedFile = new File("document.decrypted"); // Het decrypted bestand (wat tijdens het uitvoeren van de applicatie wordt gebruikt)

        // Hieronder wordt het encrypted-bestand ontsleuteld zodat de decrypted-bestand gebruikt kan worden tijdens het uitvoeren van de applicatie
        try {
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        // Hieronder wordt het encrypted & originele bestand verwijderd; deze zijn tijdens het uitvoeren van de applicatie niet nodig
        encryptedFile.delete();
        inputFile.delete();


        Artist diggy = new Artist("Diggy Dex"); // Artiest object wordt aangemaakt en gevuld
        diggy.addGenre( "Pop" );
        diggy.addGenre("Nederlands");
        diggy.addGenre("Nederhop");
        diggy.addGenre("Nederhop");
        diggy.showDetails(1);
        diggy.addAlbum("Greatest Hits");
        FileManager.writeArtist( diggy ); // Hier schrijven we data weg naar het originele tekst-bestand. "data.txt" in de FileManager klasse kan eventueel vervangen worden door het "document.decrypted" bestand

        Artist heideroosjes = new Artist("Heideroosjes"); // Artiest object wordt aangemaakt en gevuld
        heideroosjes.addGenre("Punk");
        heideroosjes.addGenre("Rock");
        heideroosjes.addGenre("Nederlands");
        heideroosjes.setName("Heidebloemen");
        heideroosjes.showDetails(2);
        heideroosjes.addAlbum("Greatest Hits");
        FileManager.writeArtist(heideroosjes);  // Hier schrijven we data weg naar het originele tekst-bestand. "data.txt" in de FileManager klasse kan eventueel vervangen worden door het "document.decrypted" bestand


        // Vervolgens wordt hier bij het afsluiten van de applicatie de data weer versleuteld opgeslagen in het encrypted-bestand
        try {
            CryptoUtils.encrypt(key, inputFile, encryptedFile); // inputFile kan eventueel worden vervangen door decryptedFile (van regel 8).
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

        // Bij het afsluiten kunnen we de decrypted-bestand weer verwijderd. Deze wordt volgende keer bij het uitvoeren weer aangemaakt.
        decryptedFile.delete();

    }
}