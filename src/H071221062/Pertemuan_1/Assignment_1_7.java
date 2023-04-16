package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // untuk membaca input dari user

        try {

            String alat = sc.nextLine(); // string user yang dimasukkan kedalam variabel alat
            int benda = findIndex(alat);
            // untuk memanggil fungsi FindIndex dgn parameter alat yang akan disimpan
            // divariabel benda
            System.out.println(benda); // menampilkan nilai dari variabel benda

        } finally {
            sc.close();
        }
    }

    public static int findIndex(String teks) { // fungsi yang memiliki parameter teks

        String barang[] = { "sapu", "lemari", "kursi", "meja", "sendal" };
        // array yang memiliki parameter barang dan mempunyai 5 string

        for (int i = 0; i < barang.length; i += 1) {
            // looping for untuk melakukan iterasi sebanyak panjang array barang

            if (barang[i].equalsIgnoreCase(teks)) {
                // untuk membandingkan nilai array barang dengan parameter teks
                return i; // mengembalikan nilai i jika sama
            }
        }
        return -1; // mengembalikan nilai -1 jika tidak sama
    }
}