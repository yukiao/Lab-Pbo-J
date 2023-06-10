package H071211014.Pertemuan_4.Tugas4;

public class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsis;

    
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    Film(){
        
    }

    Film(String title, int duration, String director, String genre, String synopsis){
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsis = synopsis;
    }

    public void displayInfo(){
        System.out.println("Judul: "+ title);
        System.out.println("Durasi: "+ duration + " menit");
        System.out.println("Sutradara: "+ director);
        System.out.println("Genre: "+ genre);
        System.out.println("Sinopsis: "+ synopsis);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    
    
}
