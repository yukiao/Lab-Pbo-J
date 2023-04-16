package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        String terakhir = nim.substring(7);
        int angka = Integer.parseInt(terakhir);

        if (angka % 7 == 0) {
            System.out.println("Soal No. 7");
        } else {
            System.out.println("Soal No. " + angka % 7);
        }
        input.close();
    }
}