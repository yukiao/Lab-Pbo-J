package H071221041.Pertemuan_4.live_coding;

public class Main{
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Supernova");
        book.setAuthor("Dee Lestari");
        book.setType("Fiksi");
        book.setYearPublished(2001);
        book.setPrice(80000);

        book.displayInfo();

        Book book2 = new Book("Supernova", "Dee Lestari", "Fiksi", 2001, 80000);
        book2.getTitle();
        book2.getAuthor();
        book2.getType();
        book2.getYearPublished();
        book2.getPrice();

        SelfUtils.displaySelfData();
    }
}