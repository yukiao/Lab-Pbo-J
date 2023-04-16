package H071221038.Pertemuan_3;
import java.util.Scanner;
import java.util.ArrayList;

class User {
    // atribut
   String name;
   int balance;

    // konstruktor
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    // getter
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    // setter
    public void setBalance(int balance) {
        this.balance = balance;
    }
    // behaviour untuk nama dan balance
    public void showInfo() { 
        System.out.println("-----------CARD-----------");
        System.out.println(name);
        System.out.println(balance);
        System.out.println("--------------------------");
    }
}

class Product {
    // atribut
    String name;
    int price;
    int stock;
    
    // konstruktor
    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // konstruktor 
    public Product(String name, String price, int stock) {
        this.name = name;
        price =  price.replace("k","000").replace("K","000"); // mengubah huruf "k/K" menjadi 000
        Integer intPrice = Integer.parseInt(price); // mengubah tipedata String price menjadi integer
        this.price = intPrice;
        this.stock = stock;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // behaviour untuk mengurangi jumlah stock
    public int kurangiJumlahStock() {
        this.stock -= 1;
        return this.stock;
    }
}

class Store {
    // atribut
    private String name;
    private ArrayList<Product> products; // atribut products tipe data ArrayList<Product> utk menyimpan daftar produk

    // konstruktor
    public Store(String name) {
        this.name = name;
        products = new ArrayList<>(); // membuat objek arraylist untuk atribut products
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProduct(ArrayList<Product> products) {
        this.products = products; 
    }
    public ArrayList<Product> getProducts() {
        return products;
    }

    // behavior untuk menambahkan satu produk ke atribut product
    public void addProduct(Product product) {
        if (product.getStock() > 0) { //jika stok lebih dari 0 maka produk akan ditambahkan ke store
            products.add(product);
        }
    }
    // behavior untuk menampilkan list produk
    public void showProduct() {
        System.out.print("Selamat Datang di " + this.getName());
        System.out.println("\nDaftar Produk:");
        for (int i = 0; i < products.size(); i++) { // menggunakan perulangan sebanyak jumlah produk yg tersimpan di array
            System.out.printf("%d. %s - $%d | Stok %d\n", i + 1, products.get(i).getName(), products.get(i).getPrice(), products.get(i).getStock());

        }
    }
    // behavior untuk mengonfirmasi 
    public void konfirmasi(int n) { // parameter n sebagai indeks array products
        System.out.printf("Apakah anda yakin ingin membeli: \n%s, dengan harga $%d\n", products.get(n).getName(), products.get(n).getPrice());
        System.out.println("1.Konfirmasi");
        System.out.println("2.Batal");
    }
    // behavior untuk memproses transaksi 
    public void processTransaction(int n, User user) { // isi parapmeter indeks array product dan objek User 
        if (products.get(n).getStock() > 0) { // utk mengecek ketersediaan stok, jika stok lebih dari 0
            if (user.getBalance() >= products.get(n).getPrice()) { // utk mengecek balance user, jika balance cukup maka
                user.setBalance(user.getBalance() - products.get(n).getPrice()); // balance akan berkurang sesuai dgn harga produk
                products.get(n).setStock(products.get(n).kurangiJumlahStock()); // stok produk berkurang 
                System.out.printf("%s berhasil membeli %s.\n", user.getName(), products.get(n).getName());
                System.out.println("-------------------");
                System.out.println("Lanjutkan Transaksi?");
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                if (products.get(n).getStock() <= 0) { // jika stok kurang dari 0, produk akan dihapus 
                    products.remove(n); 
                }
            } else {
                System.out.println("Uang anda tidak mencukupi"); // jika balance kurang  
                System.out.printf("anda %s gagal membeli %s.\n", user.getName(), products.get(n).getName()); // maka akan menampilkan output disamping
                System.out.println("-------------------");
                System.out.println("Lanjutkan Transaksi?"); 
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
            }
        } else {
            products.remove(n); // jika stok kurang dari 0, maka akan dihapus dari array product
            
        }
    }
}

public class Assignment_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // utk membaca inputan user 

            // objek dari user 
            User user = new User("Surya", 10000);
            // objek dari product 
            Product product1 = new Product("HP Pavilion Gaming 15", 2000, 15);
            Product product2 = new Product("ASUS VivoBook 15 A516MAO N4020", "4k", 3); 
            Product product3 = new Product("Lenovo IdeaPad S145", 1500, 1); // buat kondisi jika stok kosong
            // objek dari store
            Store store = new Store("Sisfo Computer");
            // memanggil behavior addproduct dari class store
            store.addProduct(product1);
            store.addProduct(product2);
            store.addProduct(product3);


            while (true) { // perulangan while agar program terus berjalan, jika kondisi true 
                user.showInfo(); // memanggil behavior showinfo
                store.showProduct(); // memanggil behavior showproduct
                System.out.println("0. Keluar");
                System.out.print("> ");
                
                // inputan utk konfirmasi pembelian
                int opsi = scanner.nextInt();
                if (opsi == 0) { // inputan jika memilih opsi 0 maka akan berhenti
                    break;
                } 
                else {
                    store.konfirmasi(opsi - 1); // memanggil behavior konfirmasi parameternya opsi - 1 krna dalam array indeks dimulai 0
                }
                System.out.print("> ");
                int opsi2 = scanner.nextInt();
                if (opsi2 == 1) { // inputan jika memilih opsi 1 
                    store.processTransaction(opsi - 1, user); // maka akan memanggil behavior prosestransaksi parameter opsi - 1 dan obje user
                    System.out.print("> ");
                    
                    int lanjutkanTransaksi = scanner.nextInt(); // inputan utk melanjutkan transaksi
                    if (lanjutkanTransaksi == 1) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    continue; // jika memilih opsi selain 1, maka akan mengulangi perulangan
                }
            }
            scanner.close(); // menutup inputan user
    }
}