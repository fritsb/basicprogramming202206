import java.util.ArrayList;

// Voorbeeld-klasse van een Artiest
public class Artist {
    // public String name
    private String name; // Gebruik private als je gebruik wilt maken van de constructor / setName-methode
    private ArrayList<String> genres; // Verzameling van type String voor de genres
    private ArrayList<Album> albums; // Verzameling van type Album voor de albums

    public void setName(String name) { // set-methode, gegenereerd via Alt+Insert
        this.name = name;
    }

    public Artist(String name) {  // Constructor, gegenereerd via Alt+Insert. De constructor wordt aangeroepen bij het aanmaken van een object
        this.name = name; // We nemen de naam over die wordt meegegeven aan de constructor
        this.genres = new ArrayList<String>(); // We zetten een lege verzameling van type String klaar bij het aanmaken van het object
        this.albums = new ArrayList<Album>(); // We zetten een lege verzameling van het type Alubm klaar bij het aanmaken van het object
    }

    public void addGenre(String genre) { // Deze methode voegt een genre toe (als deze niet voorkomt in de huidige lijst van genres)
        if(!this.genres.contains(genre)) {
            this.genres.add(genre);
        }

    }
    public void addAlbum(String albumName) { // Deze methode maakt een album-object aan en voegt deze toe aan de verzameling van Albums
        Album tmpAlbum = new Album(albumName);
        albums.add(tmpAlbum);
    }

    public void showDetails(int number) { // Deze methode geeft de info van de artiest weer op het scherm
        System.out.println("Artiest "+number+":" + name );
        for(int i = 0; i < genres.size(); i++) {
            String tmpGenre = genres.get(i);
            System.out.println(tmpGenre );
        }
    }

    public String getInfo() { // Deze methode geeft de info van de artiest terug als een String
        String tmp = this.name;
       /* for(int i = 0; i < genres.size(); i++) {
            tmp += ", " + genres.get(i);
        }*/
        tmp += genres.toString();
        tmp += albums.toString();
        return tmp;
    }

}
