package H071221041.Pertemuan_4.live_coding;

public class Book {
    String title;
    String author;
    String type;
    int yearPublished;
    int price;

    
    public Book(){}

    public Book(String title, String author, String type, int yearPublished, int price) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getType() {
        return type;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getPrice() {
        return price;
    }


    public void displayInfo(){
        System.out.println("Judul Buku: " + title);
        System.out.println("Author Buku: " + author);
        System.out.println("Tipe Buku: " + type);
        System.out.println("Tahun Terbit: " + yearPublished);
        System.out.println("Harga Buku: " + price);
    }
}
