package H071221009.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan jari-jari lingkaran: "); // print string
            double jarijari = input.nextDouble(); // menginput nilai tipe double
            // %.2f untuk menampilkan 2 angka dibelakang koma
            String luasL = String.format("%.2f", (Math.PI * jarijari * jarijari)); // rumus luas lingkaran/ Math.PI
                                                                                   // berisi nilai pi 3,14

            System.out.print("Luas lingkaran adalah " + luasL);
        } catch (Exception e) { // menangani inputan jari-jari yg bkn angka
            System.out.println("Inputan bukan angka");
        } finally {
            input.close();
        }
    }

}