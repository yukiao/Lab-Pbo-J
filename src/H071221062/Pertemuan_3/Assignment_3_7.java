package H071221062.Pertemuan_3;

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment_3_7 { //MAIN
    public static void main(String[] args) {
        Assignment_3_4 user = new Assignment_3_4("Fauzan", 20000);

        ArrayList<Assignment_3_5> product = new ArrayList<>();
        product.add(new Assignment_3_5("Indomie", "3k", 5));
        product.add(new Assignment_3_5("Telur", "2k", 7));
        product.add(new Assignment_3_5("Bumbu Nasi Goreng", 2500, 6));

        Assignment_3_6 toko = new Assignment_3_6("Toko Sembako", product);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("-------card-------");
            System.out.println(user.getName());
            System.out.println(user.getBalance());
            System.out.println("------------------");
            toko.listProducts();
            System.out.println("0. Keluar");
            System.out.print("> ");
            int pilihan = input.nextInt();

            if (pilihan >= 1 && pilihan <= toko.products.size()) {
                while (true) {
                    System.out.println("Apakah anda yakin ingin membeli?");
                    System.out.println("1. Konfirmasi");
                    System.out.println("2. Batal");
                    System.out.print("> ");
                    int konfirmasi = input.nextInt();
                    if (konfirmasi == 1) {
                        toko.buyProduct(user, pilihan - 1);
                        break;
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        input.close();
    }
}
