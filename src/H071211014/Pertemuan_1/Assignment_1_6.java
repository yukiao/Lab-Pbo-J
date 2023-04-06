package H071211014.Pertemuan_1;
import java.util.Scanner;

public class Assignment_1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jari-jari: "); 
        double radius = sc.nextDouble();
        sc.close();

        double result = Math.PI * Math.pow(radius, 2);
        System.out.printf("Luas lingkaran = %.2f",result);
    }
}
