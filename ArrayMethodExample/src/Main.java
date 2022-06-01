import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] artists = askArtists(); // De askArtists()-methode geeft een String[]-verzameling terug, deze slaan we op in de String[]-verzameling artists die alleen binnen de main-methode bestaat

        if(checkArray(artists)) { // We geven de String[]-verzameling mee aan de checkArray-methode; deze controleert of de lengte van de verzameling groter is dan 0. Als dat zo is, dan krijgen we een true-waarde terug
            showArtists(artists);
        }
        else {
            System.out.println("Er zijn geen artiesten ingevoerd.");
        }
    }

    // de askArtists()-methode vraagt de gebruiker om artiesten in te voeren; de verzameling met artiesten wordt terug gegeven op regel 33
    public static String[] askArtists() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hoeveel artiesten wil je invoeren: ");
        int noArtists = input.nextInt();
        input.nextLine();

        // Hieronder in commentaar zijn de regels code waarmee we hard-coded een verzameling aanmaken voor 4 waarden; de regels daaronder worden de artiesten toegevoegd aan de verzameling.
        //String[] artists = new String[4];
        //artists[0] = "Diggy Dex";
        //artists[1] = "Heideroosjes";
        //artists[2] = "Green Lizard";
        String[] artists = new String[noArtists]; // Nu maken we een verzameling aan met het aantal waarden dat de gebruiker opgeeft
        for(int i = 0; i < noArtists; i++) {
            System.out.println("Voer artiestnaam in: ");
            artists[i] = input.nextLine();
        }

        return artists;
    }

    // de showArtists()-methode laat alle artiesten in de verzameling zien
    public static void showArtists(String[] artists) {
        System.out.println("De volgende artiesten zitten in de verzameling: ");

 /*       for(int i = 0; i < artists.length; i++) {
            System.out.println(artists[i]);
        }*/

        // for-each-loop die hetzelfde doet als de for-loop hierboven.
        for(String artist : artists ) {
            System.out.println(artist);
        }
    }

    // de checkArray()-methode controleert of de lengte van de verzameling groter is dan 0. Als dat zo is, dan krijgen we een true-waarde terug; anders false
    public static boolean checkArray(String[] artists) {
        if(artists.length > 0) { // met behulp van artists.length kan je automatisch de lengte van de verzameling opvragen
            return true;
        }
        return false;
    }
}