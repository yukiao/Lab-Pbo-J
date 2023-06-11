package H071221098.pertemuan_1;
import java.util.Scanner;

public class Assignment_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try{
            System.out.println("Menghitung Luas Lingkaran ");
            System.out.println("Masukkan Jari-jari Lingkaran");
            double r = input.nextDouble(); // supaya bisa input bilangan desimal

            String luas = String.format ("%.2f" , (Math.PI * r *r)) ;  //angka blkg koma 2

            System.out.println("Luas Lingkaran = " + luas);

        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka");

        }
        input.close();
    }
    
}
