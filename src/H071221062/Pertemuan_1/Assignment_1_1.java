package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_1 {

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("NIM : ");
            String NIM = sc.nextLine();
            System.out.print("SOAL : No.");
            int angka = Integer.parseInt(NIM.substring(NIM.length() - 3));
            System.out.println(angka % 7 == 0 ? 7 : angka % 7);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
