package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            Double[] nums = new Double[n];

            int BilanganBulat, BilanganDesimal;
            BilanganBulat = 0;
            BilanganDesimal = 0;

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextDouble();

                if (nums[i] % 1 != 0) {
                    BilanganDesimal += 1;
                } else {
                    BilanganBulat += 1;
                }
            }

            System.out.printf("%d Bilangan Bulat \n%d Bilangan Desimal", BilanganBulat, BilanganDesimal);
        } catch (Exception e) {
            System.out.println("Inputan tidak sesuai");
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
