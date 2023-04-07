package H071211014.Pertemuan_1;

import java.util.Scanner;

/**
 * No1
 */
public class Assignment_1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NIM: ");
        String nim = sc.next();
        sc.close();
        
        int n = nim.length();
        int num = Integer.parseInt(nim.substring(n-3, n));
        int result = num % 7 == 0 ? 7 : num % 7;
        System.out.println("Soal: no "+ result);
    }
}