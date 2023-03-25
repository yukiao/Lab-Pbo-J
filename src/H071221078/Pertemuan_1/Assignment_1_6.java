package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Jari-Jari = ");
            double radius = input.nextDouble();
            double circleArea = Math.PI * Math.pow(radius, 2);

            System.out.printf("Luas lingkaran adalah " + "%.2f", circleArea);

        } catch (Exception e) {
            System.out.println("Jari-jari hanya menerima inputan angka");
        } finally {
            input.close();
        }
    }
}
