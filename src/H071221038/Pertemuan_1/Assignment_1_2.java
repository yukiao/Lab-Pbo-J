package H071221038.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Double[] angka = new Double[n];
            int panjangBulat, panjangDesimal;
            panjangBulat = 0;
            panjangDesimal = 0;

            for (int i = 0; i < n; i++) {
                angka[i] = sc.nextDouble();
                if (angka[i] % 1 != 0) { // memeriksa bilangan pada indeks i, apabila i dimodulo 1 tidak sama 0 maka
                                         // panjangDesimal bertambah 1
                    panjangDesimal += 1;
                } else {
                    panjangBulat += 1;
                }

            }
            System.out.printf("%d Bilangan Bulat \n%d Bilangan Desimal\n", panjangBulat, panjangDesimal);
            sc.close();

        } catch (Exception e) {
            System.out.println("Inputan Bukan angka");

        } finally {
            System.out.println("Program selesai");

        }
    }

}
