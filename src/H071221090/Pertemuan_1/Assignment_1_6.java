package H071221090.Pertemuan_1;

import java.util.Scanner;


public class Assignment_1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Menghitung Luas Lingkaran");
            System.out.print("Masukkan jari-jari lingkaran : ");
            double r = input.nextDouble(); //pke double karena jari2 bisa desimal atau pecahan 3.14

            String luas = String.format("%.2f", (Math.PI * r * r)); //pke format krna disoal diminta hasilnya harus 2 angka di belakang koma

            System.out.println("Luas Lingkaran = " + luas);
        
        } catch (Exception e) { 
            System.out.println("Input Harus Berupa Angka!");
        }   finally{
            input.close();
        }
    
    }
}

