package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_8 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Scanner sc = new Scanner(System.in);
        try {
            int angka = sc.nextInt();

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == angka) {
                        System.out.println("found " + angka + " at " + "[" + i + "]" + " " + "[" + j + "]");
                        return;
                    }
                }
            }
            System.out.println("Angka tidak ditemukan");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan");
        } finally {
            sc.close();
        }
    }
}
