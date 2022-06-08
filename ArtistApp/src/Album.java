public class Album {
    protected String albumName;
    protected int year;
   // protected ArrayList<Track> tracks;

    public Album(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() { // toString-methode, gegenereerd via Alt+Insert
        return  albumName;
    }
}
