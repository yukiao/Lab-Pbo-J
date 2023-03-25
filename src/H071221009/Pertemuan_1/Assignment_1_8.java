package H071221009.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_8 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // membuat/menginisialisasi array 2d dengan langsung
                                                               // mengisi array
    System.out.print("Masukkan angka yang dicari : "); // mencetak stringnya/ 'print' akan mencetak tanpa adanya enter
                                                       // atau penambahan baris pada kalimat berikutnya
    int angka = inp.nextInt(); // memasukkan inputan tipe data integer
    boolean found = false; // utk mencari apakah indeksnya dapat ditemukan atau tidak

    try {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          if (array[i][j] == angka) {
            System.out.printf("Found %d at [%d][%d]\n", angka, i, j); // %d itu printformat integer utk menampilkan
                                                                      // angka
            found = true;
          }
        }
      }
      if (!found) { // jika angka yang dicari tidak ada dlm array maka programnya akan ke blok catch
                    // exception
        throw new Exception(); // throw new exception berfungsi jika ada kesalahan maka program akan langsung
                               // ke bagian catch exception untuk dieksekusi
      }
    } catch (Exception e) {
      System.out.printf("%d Not found in array\n", angka); // jika angka yang dicari tidak terdapat dalam array maka
                                                           // akan tercetak Not found
    } finally {
      inp.close();
    }
  }
}