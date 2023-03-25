package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        input.close();

        konversiFormatTanggal(tanggal);
    }

    public static void konversiFormatTanggal(String tanggal) {
        int hari = Integer.parseInt(tanggal.substring(0, 2));
        System.out.print(hari);

        int bulan = Integer.parseInt(tanggal.substring(3, 5));
        switch (bulan) {
            case 1:
                System.out.print(" Januari");
                break;
            case 2:
                System.out.print(" Februari");
                break;
            case 3:
                System.out.print(" Maret");
                break;
            case 4:
                System.out.print(" April");
                break;
            case 5:
                System.out.print(" Mei");
                break;
            case 6:
                System.out.print(" Juni");
                break;
            case 7:
                System.out.print(" Juli");
                break;
            case 8:
                System.out.print(" Agustus");
                break;
            case 9:
                System.out.print(" September");
                break;
            case 10:
                System.out.print(" Oktober");
                break;
            case 11:
                System.out.print(" November");
                break;
            case 12:
                System.out.print(" Desember");
                break;
        }

        int tahun = Integer.parseInt(tanggal.substring(6));
        if (tahun <= 23) {
            System.out.print(" 20" + tahun);
        } else {
            System.out.print(" 19" + tahun);
        }
    }
}