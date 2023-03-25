package H071221009.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); // membaca inputannya
        String tanggal = inp.nextLine(); // menginput data tipe string
        String[] arraytgl = tanggal.split("-"); // .split fungsi yang berguna untuk membuat sebuah string array dari
                                                // sebuah string awal yang dipisahkan oleh tanda pemisah tertentu atau
                                                // panjang tertentu

        int[] bln = new int[3]; // 3 panjang array
        for (int i = 0; i < arraytgl.length; i++) {
            bln[i] = Integer.parseInt(arraytgl[i]); // Integer.parseInt untuk mengkonversi nilai data tipe string
                                                    // menjadi tipe integer
        }
        inp.close();

        int tahun = bln[2]; // tahun berada pada indeks kedua
        String thn = "";
        if (tahun >= 0 && tahun < 30) { // 30 artinya tahun yang dibawah 2030 akan bisa tereksekusi
            thn = "20" + arraytgl[2]; // untuk tahun 2000
        } else {
            thn = "19" + arraytgl[2]; // untuk tahun 1900
        }
        System.out.println(bln[0] + " " + konversiBulan(bln[1]) + " " + thn);
    }

    public static String konversiBulan(int angka) {
        if (angka == 1) {
            return "Januari";
        } else if (angka == 2) {
            return "Februari";
        } else if (angka == 3) {
            return "Maret";
        } else if (angka == 4) {
            return "April";
        } else if (angka == 5) {
            return "Mei";
        } else if (angka == 6) {
            return "Juni";
        } else if (angka == 7) {
            return "Juli";
        } else if (angka == 8) {
            return "Agustus";
        } else if (angka == 9) {
            return "September";
        } else if (angka == 10) {
            return "Oktober";
        } else if (angka == 11) {
            return "November";
        } else if (angka == 12) {
            return "Desember";
        } else {
            return "";
        }
    }
}