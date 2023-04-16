package H071221038.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahSoal, hasil;
        String nim = sc.next();
        nim = nim.substring(nim.length() - 3);
        System.out.println(nim);
        int nimInt = Integer.parseInt(nim);
        jumlahSoal = 7;
        hasil = nimInt % jumlahSoal;

        if (hasil == 0) {
            System.out.println(jumlahSoal);
        } else {
            System.out.println(hasil);
        }
        sc.close();
    }
}