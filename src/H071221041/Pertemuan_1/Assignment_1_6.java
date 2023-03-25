package H071221041.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_6 {

   public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);

      try {
         System.out.print("Masukkan jari-jari lingkaran: ");
         double jariJari = inp.nextDouble();

         String luas = String.format("%.2f", (Math.PI * jariJari * jariJari)); // %.2f floating point mnunjukkan angka
                                                                               // di belakang

         System.out.println("Luas lingkaran = " + luas);
      } catch (Exception e) {
         System.out.println("Input harus berupa angka!");
      } finally {
         inp.close();
      }
   }
}