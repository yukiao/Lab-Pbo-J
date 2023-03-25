package H071221041.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String tanggal = inp.nextLine();
        String[] arraytanggal = tanggal.split("-");
        int[] arraybulan = new int[3]; // new 3 = pnjng array 3
        for (int i = 0; i < arraytanggal.length; i++) {
            arraybulan[i] = Integer.parseInt(arraytanggal[i]); // parseInt method untuk mengonversi sebuah string ke
                                                               // dalam bentuk integer
        }
        inp.close();
        int tahun = arraybulan[2];
        String tahun2 = "";
        if (tahun >= 0 && tahun < 30) {
            tahun2 = "20" + arraytanggal[2];
        } else {
            tahun2 = "19" + arraytanggal[2];
        }
        System.out.println(arraybulan[0] + " " + konversiBulan(arraybulan[1]) + " " + tahun2);
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
