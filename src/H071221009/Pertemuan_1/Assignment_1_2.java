package H071221009.Pertemuan_1;

import java.util.Scanner; // import library

public class Assignment_1_2 {
    public static void main(String[] args) { // method main nda wajib dijalankan langsung java
        Scanner inp = new Scanner(System.in); // menginisialisasi objek dari class scanner
        int bilbulat = 0; // nilai awal bilbulat
        int bildesimal = 0; // nilai awal bildes
        try {
            System.out.print("Masukkan jumlah bilangan yang akan diinput : "); // memasukkan berapa inputan
            int angka = inp.nextInt(); // memasukkan inputan nilai tipe integer
            System.out.println("Silakan masukkan " + angka + " bilangan :"); // perintah menginput sesuai jumlah
                                                                             // bilangan

            for (int i = 0; i < angka; i++) { // increment utk menambah nilainya 1
                double num = inp.nextDouble(); // memasukkan nilai tipe double
                if (num % 1 == 0) { // jika num modulo 1 sama dengan nol maka kondisi if terpenuhi
                    bilbulat++; // kondisi utk menambah jumlah bilangan bila kondisi terpenuhi
                } else {
                    bildesimal++; // jika tidak terpenuhi maka masuk pada kondisi else
                }
            }
            System.out.println(bilbulat + " Bilangan Bulat"); // println utk mencetak dengan tambahan enter/baris baru
            System.out.println(bildesimal + " Bilangan Desimal");

        } catch (Exception e) { // menangani kesalahan pada blok try bagian inputan
            System.out.println("Inputan bukan angka");
        } finally { // akan selalu di eksekusi meski ada kesalahan ataupun tidak
            inp.close(); // fungsi harus ditutup
        }

    }
}