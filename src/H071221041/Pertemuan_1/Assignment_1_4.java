package H071221041.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
        String kalimatBaru = ubahHuruf(kalimat);
        System.out.println("Hasil: " + kalimatBaru);
        scanner.close();
    }

    public static String ubahHuruf(String kalimat) {
        String[] kata = kalimat.toLowerCase().split(" ");
        StringBuilder builder = new StringBuilder();
        // pembuatan objek dengan menyediakan suatu cara untuk menginisialisasi
        // parameter dengan nama yang jelas
        // dan juga memiliki kesempatan untuk mengubah nilai parameter yang telah diset
        // sebelumnya.
        for (String s : kata) {
            if (s.length() > 0) {
                char hurufPertama = Character.toUpperCase(s.charAt(0)); // method utk mngmbil char pda string sesuai
                                                                        // index yg diinginkan
                builder.append(hurufPertama);
                builder.append(s.substring(1)); // subsstring utk bbrp char dari kata/kalimat
            }
            builder.append(" ");
        }
        return builder.toString().trim(); // .trim utk memotong char" spasi pd bgian awal dan akhir
    }
}