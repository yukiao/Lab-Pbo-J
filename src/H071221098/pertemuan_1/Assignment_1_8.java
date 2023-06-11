package H071221098.pertemuan_1;
import java.util.Scanner;

public class Assignment_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input satu bilangan
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bilangan = scanner.nextInt();
        

        int[][] array2D = {{1,2,3}, {4,5,6}, {7,8,9}}; //list dalam list
        boolean found = false;

        for (int i = 0; i < array2D.length; i++) { //perulangan dalam perulangan
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == bilangan) {
                    System.out.println("Bilangan " + bilangan + " ditemukan pada indeks [" + i + "][" + j + "]");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Bilangan " + bilangan + " tidak ditemukan pada array 2D");
        } 
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

        }
        scanner.close();
    }
 }