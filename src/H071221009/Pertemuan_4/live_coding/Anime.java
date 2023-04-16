package H071221009.Pertemuan_4.live_coding;

public class Anime { //class anime
    private String title; 
    private int episodeCount;
    private String genre; // attribute
    private String studio;
    private String synopsis;

    public Anime(){} // constructor kosong untuk objek anime pertama

    public Anime(String title, int episodeCount, String genre, String studio, String synopsis) { // constructor objek anime kedua
        this.title = title;
        this.episodeCount = episodeCount;
        this.genre = genre;
        this.studio = studio;
        this.synopsis = synopsis;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEpisodeCount() {
        return episodeCount;
    }
    public void setEpisodeCount(int episodeCount) {
        this.episodeCount = episodeCount;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }
    public String getSynopsis() {
        return synopsis;
    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public void displayInfo() { // behavior displayInfo
        System.out.println("Judul Anime   : " + this.title);
        System.out.println("Jumlah Episode: " + this.episodeCount);
        System.out.println("Genre         : " + this.genre);
        System.out.println("Studio        : " + this.studio);
        System.out.println("Sinopsis      : " + this.synopsis);
    }


}
