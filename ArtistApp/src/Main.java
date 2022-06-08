import java.io.File;

public class Main {
    public static void main(String[] args) {
        Artist diggy = new Artist("Diggy Dex"); // Artiest object wordt aangemaakt en gevuld
        diggy.addGenre( "Pop" );
        diggy.addGenre("Nederlands");
        diggy.addGenre("Nederhop");
        diggy.addGenre("Nederhop");
        diggy.showDetails(1);
        diggy.addAlbum("Greatest Hits");
        FileManager.writeArtist( diggy ); // Hier schrijven we data weg naar een tekst-bestand.

        Artist heideroosjes = new Artist("Heideroosjes"); // Artiest object wordt aangemaakt en gevuld
        heideroosjes.addGenre("Punk");
        heideroosjes.addGenre("Rock");
        heideroosjes.addGenre("Nederlands");
        heideroosjes.setName("Heidebloemen");
        heideroosjes.showDetails(2);
        heideroosjes.addAlbum("Greatest Hits");
        FileManager.writeArtist(heideroosjes);  // Hier schrijven we data weg naar een tekst-bestand.

    }
}