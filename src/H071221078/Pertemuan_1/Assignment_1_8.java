package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        System.out.print("Masukkan angka yang dicari: ");
        int bilangan = input.nextInt();
        input.close();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] == bilangan) {
                    System.out.println("Found " + bilangan + " at [" + i + "][" + j + "]");
                    return;
                }
            }
        }
    }
}