package H071211014.Pertemuan_4.Tugas4;


public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        film.setTitle("Spiderman No Way Home");
        film.setDuration(120);
        film.setDirector("Jon Watts");
        film.setGenre("Action");
        film.setSynopsis("With Spider-Man's identity now revealed, our friendly neighborhood web-slinger is unmasked and no longer able to separate his normal life as Peter Parker from the high stakes of being a superhero. When Peter asks for help from Doctor Strange, the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.");
        film.displayInfo();
        System.out.println();

        Film film2 = new Film(
            "Black Panther",
             120,
              "Ryan Coogler",
            "Action",
                "Plot. Thousands of years ago, five African tribes war over a meteorite containing the metal vibranium. One warrior ingests a \"heart-shaped herb\" affected by the metal and gains superhuman abilities, becoming the first \"Black Panther\". He unites all but the Jabari Tribe to form the nation of Wakanda."
        );
        System.out.println("Judul: "+ film2.getTitle());
        System.out.println("Durasi: "+ film2.getDuration()+ " menit");
        System.out.println("Sutradara: "+ film2.getDirector());
        System.out.println("Genre: "+ film2.getGenre());
        System.out.println("Sinopsis: "+ film2.getSynopsis());

        System.out.println();
        SelfUtils.displaySelfData();

    }  
}
