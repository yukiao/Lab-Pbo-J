package H071221038.Pertemuan_1;
import java.util.Scanner;

public class Assignment_1_6 {
    public static void main(String[] args){

        try{
            Scanner sc = new Scanner (System.in);
            System.out.print("Input Jari-Jari Lingkaran : ");
            double r,phi,hasil;
            phi = Math.PI;
            r = sc.nextDouble();
            hasil = phi * r * r;
            System.out.printf("%.2f",hasil);
            sc.close();

        } catch (Exception e){
            System.out.println("Inputan bukan angka");
        }
    }
}
