package H071221009.Pertemuan_3;

public class Product {
    String name;
    int price; // attribute
    int stock;

    public Product(String name, int price, int stock) { 
        this.name = name;
        this.price = price; // constructor
        this.stock = stock;
    }

    String getName() { // get
        return name;
    }
    int getPrice() { // get
        return price;
    }
    int getStock() { // get
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int kurangiJumlahStock() { // method utk mengurangi jumlah stok jika berhasil menjual
        this.stock -= 1;
        return this.stock;
    }

    public Product(String name, String price, int stock) { // constructor
        this.name = name;
        price = price.replace("k", "000").replace("K", "000"); // konversi/ method replace utk mengubah atau menggantikan data dari beberapa karakter lama menjadi sebuah karakter baru
        Integer numPrice = Integer.parseInt(price); // parseint utk untuk mengubah String menjadi Integer atau mengubah kebilangan bulat
        this.price = numPrice;
        this.stock = stock;

    } 

}