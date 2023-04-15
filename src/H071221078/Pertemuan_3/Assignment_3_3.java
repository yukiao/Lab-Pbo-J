package H071221078.Pertemuan_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment_3_3 {
    public static void main(String[] args) {
        // instance objek User dengan langsung menambahkan nilai sesuai parameter pada constructornya
        User user = new User("Adnan", 10000);

        // membuat objek produk dengan langsung menambahkan nilai sesuai parameter pada constructornya
        Product product1 = new Product("Pensil", "5k", 5);
        Product product2 = new Product("Pulpen", "5k", 3);
        Product product3 = new Product("Stip-X", 7000, 4);

        ArrayList<Product> products = new ArrayList<>(); // buat objek baru berupa array list

        Store toko = new Store("Toko Alat Tulis"); // buat objek store baru dengan langsung menambahkan nilai name
        toko.products = products; // mengisi atribut products pada objek toko dengan nilai berupa objek products yang telah dibuat di atas

        // mengisi array list products pada toko dengan objek-objek Produk yang telah dibuat sebelumnya
        toko.addProduct(product1);
        toko.addProduct(product2);
        toko.addProduct(product3);

        Scanner input = new Scanner(System.in);
        while (true) {
            // info nama dan saldo dari objek user
            System.out.println("-------card-------");
            System.out.println(user.getName());
            System.out.println(user.getBalance());
            System.out.println("------------------");

            // menampilkan menu produk dalam objek toko yang telah ditambahkan
            toko.listProducts();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt(); // inputan untuk memilih yang tertera pada menu
            
            // kondisi jika 1 <= pilihan <= jumlah data dalam arraylist products
            if (pilihan >= 1 && pilihan <= toko.products.size()) {
                while (true) {
                    System.out.println("Apakah anda yakin ingin membeli?");
                    System.out.println("1. Konfirmasi");
                    System.out.println("2. Batal");
                    System.out.print("> ");
                    int konfirmasi = input.nextInt();
                    if (konfirmasi == 1 ){
                            toko.buyProduct(user, pilihan-1); // pembeliann terkonfirmasi, maka saldo user berkurang seharga barang
                            break;
                    } else {
                        break;
                    }
                }
            } else if (pilihan != 0) {
                System.out.println("Hanya dapat memilih yang ada di menu"); // ditampilkan jika menginput yang tidak ada di menu
            } else {
                break; // menghentikan perulangan ketika menginput 0
            }
        }
            input.close();
    }
}

class User {
    private String name;
    private int balance;

    // constructor User
    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
    // setter & getter untuk atribut dari User
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    } 
}

class Product {
    private String name;
    private int price;
    private int stock;

    // constructor Product
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    // constructor Product tapi parameter pricenya beda
    public Product(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;
        
        if (price.contains("k")) {
            price = price.replace("k", ""); // menghilangkan "k" pada nilai price jika ada
            this.price = Integer.parseInt(price) * 1000; // mengubah price yang tipe String ke tipe Integer
        } else {
            this.price = Integer.parseInt(price);
        }
    }
    // setter & getter atribut pada class Product
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    // behaviour mengurangi jumlah stock sbanyak 1 jika terjual
    public void sell() {
        stock--;
    }
}
class Store {
    public String name;
    public ArrayList<Product> products; // menambah atribut bertipe arrayList

    // constructor Store
    public Store(String name){
        this.name = name;
    }

    // behaviour menambahkan objek Product ke atribut arrayList products
    public void addProduct(Product product) {
        products.add(product); 
    }

    // method mencetak list product yang ada dalam arrayList products
    public void listProducts() {
        System.out.printf("Selamat Datang di %s%n", this.name);
        System.out.println("Daftar Produk :");
        // prulangan utk mengecek tiap data dalam arrayList products
        for (int i = 0; i < products.size(); i++) {
            // mengambil data dengan method getter dari setiap objek Product yang menjadi anggota dari arrayList products
            System.out.println((i + 1) + ". " + products.get(i).getName() + " - Rp." + products.get(i).getPrice() + " | stok " + products.get(i).getStock());
        }
    }
    // method untuk membeli product yg parameter productIndex nya di method Main adalah pilihan-1
    public void buyProduct(User user, int productIndex) {
        Product product = products.get(productIndex); // mengambil objek Product dalam arrayList products dengan indeks dari parameter
        if (user.getBalance() >= product.getPrice()) {
            user.setBalance(user.getBalance()-product.getPrice()); // menjual dan mengurangi balance dari user jika balance lebih besar dari harga produk
            product.sell();

            if (product.getStock() == 0) {
                products.remove(productIndex); // menghapus objek product dari arrayList products jika nilai stock dari objek tersebut bernilai 0
            } 
            System.out.println(user.getName() + " berhasil membeli " + product.getName());
        } else {
            System.out.println("Maaf, saldo tidak cukup untuk membeli produk ini.");
        }
    }
}