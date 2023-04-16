package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Jari-Jari Lingkaran : ");
            double r = sc.nextDouble();
            double phi = 3.14;
            double hasil = phi * r * r;
            System.out.printf("Luas Lingkaran : %.2f\n", hasil);
        } catch (Exception e) {
            System.out.println("Inputan tidak sesuai");
        } finally {
            sc.close();
        }
    }
}