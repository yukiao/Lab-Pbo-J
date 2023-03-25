package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalender = sc.nextLine();
        sc.close();
        String[] arrKalender = kalender.split("-");
        konversi(arrKalender);

    }

    public static void konversi(String[] arrKalender) {
        String strTanggal = arrKalender[0];
        int intTanggal = Integer.parseInt(strTanggal);

        String strBulan = arrKalender[1];
        int intBulan = Integer.parseInt(strBulan);

        String[] namaBulan = { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
                "Agustus", "September", "Oktober", "November", "Desember" };

        String strTahun = arrKalender[2];
        int intTahun = Integer.parseInt(strTahun);

        if (intTahun > -1 && intTahun < 24) {
            int tahunFix = intTahun + 2000;
            System.out.println(intTanggal + " " + namaBulan[intBulan - 1] + " " + tahunFix);
            return;
        } else if (intTahun > 23 && intTahun < 100)
            ;
        int tahunFix = intTahun + 1900;
        System.out.println(intTanggal + " " + namaBulan[intBulan - 1] + " " + tahunFix);
    }

}
