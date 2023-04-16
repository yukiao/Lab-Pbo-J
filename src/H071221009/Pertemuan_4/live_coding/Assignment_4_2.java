package H071221009.Pertemuan_4.live_coding;

public class Assignment_4_2 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setTitle("Spy x Family");
        anime.setEpisodeCount(25);
        anime.setGenre("Aksi Komedi");
        anime.setStudio("WIT Studio dan CloverWorks");
        anime.setSynopsis("Spy x Family mengisahkan tentang agen mata-mata terampil bernama sandi 'Twillight' yang menjalankan Operasi Strix, yakni misi penting terkait perdamaian antarnegara mencakup Westalis di barat dan Ostania di timur.");

        anime.displayInfo();
        System.out.println();

        Anime anime2 = new Anime("One Piece", 1026, "Petualangan", "Toei Animation", "Anime One Piece menceritakan perjalanan Luffy, seorang anak laki-laki yang bertemu bajak laut hebat bernama Shanks, dimana Luffy terinspirasi oleh kehebatan Shanks dan bermimpi suatu hari nanti ingin menjadi bajak laut. Kemudian Shanks menjanjikan Luffy untuk reuni di masa depan dan memberikan topi jeraminya.");
        anime2.getTitle();
        anime2.getEpisodeCount();
        anime2.getGenre();
        anime2.getStudio();
        anime2.getSynopsis();
        anime2.displayInfo();
        System.out.println();

        SelfUtils.displaySelfData();
        
    }
}
    
