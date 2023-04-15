package H071221009.Pertemuan_3;

import java.util.ArrayList;

public class Store {
    String name; // attribute name
    ArrayList<Product> products;
    

    public Store(String name) { // constructor utk menampilkan nama toko ketika objeknya di instance
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() { // getName
        return name;
    }

    public void setName(String name) { // setName
        this.name = name;
    }

    public void tambahProduct(Product produk) { // behavior utk menambahkan produk ke attribute products
        products.add(produk);
        
    }

    public void listProduct() { // behavior utk menampilkan list produk yg ada ditoko
        System.out.printf("Selamat datang di %s\n", this.getName());
        System.out.println("Daftar Produk:");
        for (int i = 0; i < products.size(); i++) { // size untuk mencari panjang ArrayList
            // %d utk menampilkn angka, %s utk menampilkan string, 
            System.out.printf("%d. %s - $%d | Stok %d\n", i + 1, products.get(i).getName(), products.get(i).getPrice(), products.get(i).getStock());
        }
    }

    public void konfirmasi(int n) { // behavior utk konfirmasi belanja
        System.out.printf("Apakah anda yakin ingin membeli: \n%s, dengan harga $%d\n", products.get(n).getName(), products.get(n).getPrice());
        System.out.println("1.Konfirmasi");
        System.out.println("2.Batal");
    }

    public void transaksi(int n, User user) { // behavior utk proses transaksi
        
        if (products.get(n).getStock() > 0) { // jika produk.getStock lebih besar dari 0 maka ada kondisi if
            if (user.getBalance() >= products.get(n).getPrice()) {
                user.setBalance(user.getBalance() - products.get(n).getPrice());
                products.get(n).setStock(products.get(n).kurangiJumlahStock());
                System.out.printf("%s berhasil membeli %s.\n", user.getName(), products.get(n).getName());
                System.out.println("-------------------");
                System.out.println("Lanjutkan Transaksi?"); // pilihan melanjutkan transaksi atau tdak
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
                if (products.get(n).getStock() <= 0) { 
                    products.remove(n); 
                    
                }
            } else {
                System.out.println("Maaf, uang anda tidak mencukupi"); // jika uang user tdk cukup
                System.out.printf("%s gagal membeli %s.\n", user.getName(), products.get(n)); // mencetak pernyataan gagal membeli
                System.out.println("-------------------");
                System.out.println("Lanjutkan Transaksi?"); // pilihan utk lanjut transaksi atau tidak
                System.out.println("1. Iya");
                System.out.println("2. Tidak");
            }
        } else {
            products.remove(n);
            
        }
    }
}