package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Masukkan jumlah bilangan: ");
            int n = input.nextInt();
            input.nextLine();
            int bilanganBulat = 0;
            int bilanganDesimal = 0;

            String inputanBilangan = input.nextLine();
            String[] arrayBilangan = inputanBilangan.split(" ");
            if (n != arrayBilangan.length) {
                System.out.println("Jumlah inputan tidak sesuai");
                return;
            }

            for (int i = 0; i < arrayBilangan.length; i++) {
                double bilangan = Double.parseDouble(arrayBilangan[i]);
                if (bilangan % 1 == 0) {
                    bilanganBulat++;
                } else {
                    bilanganDesimal++;
                }
            }
            System.out.println(bilanganBulat + " Bilangan Bulat");
            System.out.println(bilanganDesimal + " Bilangan Desimal");

        } catch (Exception e) {
            System.out.println("Hanya menerima inputan angka");
        } finally {
            input.close();
        }
    }
}