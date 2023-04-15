package H071221009.Pertemuan_3;

import java.util.Scanner;

public class Assignment_3_3 {
    public static void main(String[] args) { 
        Scanner inp = new Scanner(System.in); // scanner utk yg ada inputan setelah di run
            
            User user = new User("Lia", 49000); // objek user
            
            Product pr1 = new Product("HP Pavilion Gaming 15", 2000, 15); // objek product
            Product pr2 = new Product("ASUS VivoBook 15 A516MAO N4020", 4000, 4);
            Product pr3 = new Product("Lenovo IdeaPad S145", 1500, 2);

            Store store = new Store("Sisfo Computer"); // objek store
            store.tambahProduct(pr1); 
            store.tambahProduct(pr2); // memanggil behavior tambahProduct
            store.tambahProduct(pr3);

            while (true) { // perulangan jika selalu benar
                user.showInfo(); // memanggil behavior showInfo
                store.listProduct(); // memanggil behavior listProduct
                System.out.println("0. Keluar"); // cetak pilihan keluar
                System.out.print("> "); // tempat input pilihan

                int pilihan = inp.nextInt();
                if (pilihan <= 0) { // jika yg dipilih adalah 0 maka akan berhenti
                    break;
                } else {
                    store.konfirmasi(pilihan - 1); // pilihan - 1 itu indeks 0
                }

                System.out.print("> ");
                int pilihan2 = inp.nextInt();
                if (pilihan2 == 1) {
                    store.transaksi(pilihan - 1, user); 
                    System.out.print("> ");
                    int yn = inp.nextInt(); // yn yes no
                    if (yn == 1) {
                        continue;
                    } else {
                        break;
                    }
                } else {
                    continue;
                }

            }
            inp.close();
        }
}        