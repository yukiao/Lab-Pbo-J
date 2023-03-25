package H071221009.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : \n> "); // mencetak string kalimat
        String kalimat = inp.nextLine(); // nextLine utk memasukkan inputan tipe data string
        String[] kata = kalimat.toLowerCase().split(" "); // toLowerCase utk mengubah nilai string ke nilai string yang
                                                          // terdiri dari huruf kecil semua
        // .split fungsi yang berguna untuk membuat sebuah string array dari sebuah
        // String awal yang dipisahkan oleh tanda pemisah tertentu atau panjang tertentu
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            // substring adlh fungsi yang digunakan untuk mengambil beberapa karakter dari
            // sebuah Kalimat atau kata
            // fungsi ini memiliki 2 parameter, yaitu index awalan dan juga index akhir.
            // Indexnya diambil sesuai dengan urutan karakter yang ada di Kalimat tersebut
            // toUpperCase utk mengubah nilai string ke nilai string yang terdiri dari huruf
            // besar semua
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " ";
        }
        // .trim utk memotong karakter-karakter spasi pada bagian awal dan akhir
        System.out.println(kalimatBaru.trim()); // println akan mencetak dengan adanya enter atau penambahan baris pada
                                                // kalimat berikutnya
        inp.close();
    }
}