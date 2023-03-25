package H071221041.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JmlhBlngn;
        int intCount = 0; // menghitung bilangan bulat
        int decimalCount = 0; // menghitung bilangan desimal

        try {
            System.out.print("Masukkan jumlah bilangan: ");
            JmlhBlngn = input.nextInt();

            for (int i = 0; i < JmlhBlngn; i++) {
                // System.out.print("Masukkan bilangan : ");
                double num = input.nextDouble();
                if (num == (int) num) {
                    intCount++;
                } else {
                    decimalCount++;
                }
            }

            System.out.println(intCount + " Bilangan Bulat");
            System.out.println(decimalCount + " Bilangan Desimal");

        } catch (Exception e) {
            System.out.println("Input harus berupa angka");
        } finally {
            input.close();
        }

    }
}
