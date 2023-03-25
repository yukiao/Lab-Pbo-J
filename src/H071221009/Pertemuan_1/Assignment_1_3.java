package H071221009.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Name  : "); // print string name
            String name = inp.nextLine(); // memasukkan inputan nama

            System.out.print("Umur  : "); // print string umur
            int age = inp.nextInt(); // memasukkan inputan umur tipe integer
            inp.nextLine(); // nextLine utk baris selanjutnya agar bisa menginput nilainya/ yg di hobby akan
                            // langsung terprint nilai yg println akhir sebelum catch

            System.out.print("Hobby : "); // print string hobby
            String hobby = inp.nextLine(); // memasukkan inputan hobby tipe string

            System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby);

        } catch (Exception e) { // menangani kesalahan di inputan umur
            System.out.println("Umur bukan angka");
        } finally { // tetap terpanggil walau ada atau tdk ada eror
            inp.close();
        }

    }
}