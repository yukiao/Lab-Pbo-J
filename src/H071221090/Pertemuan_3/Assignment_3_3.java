package H071221090.Pertemuan_3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Assignment_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User("Nabilah", 6500);
        List <Product> produk = new ArrayList<>();

        produk.add(new Product("ASUS TUF GAMING", "20k", 15));
        produk.add(new Product("ASUS VivoBook 15 A516MAO  N4020", "4k", 4));
        produk.add(new Product("Lenovo IdeaPad S145", 1500, 2));

        Store store = new Store("Sisfo Komputer", produk);
        
        store.TambahProduk(new Product("Asus Zepyhrus", 3500, 10));

        while (true) { // Loop 1

            user.kartu(); // Menampilkan data User
            store.listProduct(); // Menampilkan list Product
            System.out.print("> ");
            int pilihan1 = sc.nextInt();

            if (pilihan1 > store.getProduct().size()) { // Opsi yang diinput melebihi jumlah produk
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan!");


            } else if (1 <= pilihan1 && pilihan1 <= produk.size()) { // Opsi yang diinput pas dengan jumlag produk
                System.out.println("-".repeat(40)); // garis
                System.out.println("Apakah anda yakin ingin membeli:");
                System.out.printf("%s, dengan Harga $%d%n", store.getProduct().get(pilihan1 - 1).getName(), store.getProduct().get(pilihan1 - 1).getPrice());
                System.out.println("-".repeat(40));

                while (true) { // Loop 2

                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = sc.nextInt();

                    if (konfirmasi == 1 && user.getBalance() >= store.getProduct().get(pilihan1 - 1).getPrice()) { // inputan 1 dan jumlah balance user cukup untuk membeli produk

                        System.out.println("-".repeat(40));
                        store.getProduct().get(pilihan1 - 1).reduceProduk(store); // Mengurangi jumlah stok dan pengecekan jika stok = 0, maka laptop akan di-remove dari list product
                        user.setBalance(store.getProduct().get(pilihan1 - 1).getPrice()); // Menyesuaikan Balance dari user setelah transaksi berhasil

                        System.out.printf("%s berhasil membeli %s.%n", user.getName(), store.getProduct().get(pilihan1 - 1).getName());
                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");
                        int pilihan2 = sc.nextInt();

                        if (pilihan2 == 1) { // Break Loop 2
                            break;

                        } else {
                            System.exit(0);  // Menghentikan seluruh Loop / return 0
                            System.out.println("Terima Kasih Telah Berkunjung"); 
                        }

                    } else if (konfirmasi == 2) { // Opsi batalkan transaksi (Break Loop 2)
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Informasi : Balance Anda = $%d | harga laptop = $%d | %s%n", user.getBalance(), store.getProduct().get(pilihan1 - 1).getPrice(), (user.getBalance() < store.getProduct().get(pilihan1 - 1).getPrice()) ? "Silahkan Batalkan pesanan, Balance anda tidak cukup" : "Masukkan Perintah Dengan Benar!");
                    }
                }

            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }

        }
        sc.close();
    }
}   
