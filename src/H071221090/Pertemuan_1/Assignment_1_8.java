package H071221090.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input satu bilangan
        try {
            System.out.print("Masukkan satu bilangan : ");
            int bilangan = scanner.nextInt();
        
                            //indexnya dri 0
        int[][] array2D = {{1,2,3}, {4,5,6}, {7,5,9}}; 
        boolean found = false; //blumpi di tau inputannya blgnya ada dlm array dlm arrya jdi di isi false

        for (int i = 0; i < array2D.length; i++) { 
            for (int j = 0; j < array2D[i].length; j++) {
                if (array2D[i][j] == bilangan) { // jika sma dgn bil yg dim muskkan apkh sma dgn bil nya
                    System.out.println("Bilangan " + bilangan + " ditemukan pada indeks [" + i + "][" + j + "]");
                    found = true; // krna di tmukan bil nya  
                    return;
                }   
            }
          }
        if (!found) { // jika tdk di tmukan
            System.out.println("Bilangan " + bilangan + " tidak ditemukan pada array 2D");
        } 
        } catch (Exception e) {
            System.out.println("Inputan harus berupa angka");

        }finally {
            scanner.close();
        }
    
         
    }
 }
