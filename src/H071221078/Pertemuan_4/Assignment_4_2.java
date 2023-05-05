package H071221078.Pertemuan_4;

public class Assignment_4_2 {
    public static void main(String[] args) {
        Film film1 = new Film();
        film1.setTitle("Upin & Ipin the Movie");
        film1.setDirector("Les' Qopaque");
        film1.setDuration(135);
        film1.setGenre("Adventure");
        film1.setSynopsys("Pergi main-main ke masa lalu");
        System.out.println("\n================INFO MOVIE================");
        film1.displayInfo();

        Film film2 = new Film("Boboiboy the Movie", 120, "Anas Abdul Aziz", "Action, Adventure", "Melawan serangan alien");
        System.out.println("\n================INFO MOVIE================");
        System.out.println("Judul   : " + film2.getTitle());
        System.out.println("Durasi  : " + film2.getDuration());
        System.out.println("Director: " + film2.getDirector());
        System.out.println("Genre   : " + film2.getGenre());
        System.out.println("Synopsis: " + film2.getSynopsys());

        SelfUtils.displaySelfData();
    }
}


class Film {
    private String title;
    private int duration;
    private String director;
    private String genre;
    private String synopsys;

    public Film() {}
    
    public Film(String title, int duration, String director, String genre, String synopsys) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.genre = genre;
        this.synopsys = synopsys;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getSynopsys() {
        return synopsys;
    }
    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public void displayInfo() {
        System.out.println("Judul   : " + this.title);
        System.out.println("Durasi  : " + this.duration);
        System.out.println("Director: " + this.director);
        System.out.println("Genre   : " + this.genre);
        System.out.println("Synopsis: " + this.synopsys);
    }
}


class SelfUtils {
    public static void displaySelfData() {
        System.out.println("\n================DATA DIRI================");
        System.out.println("Nama    : Andi Adnan");
        System.out.println("N I M   : H071221078");
    }
}