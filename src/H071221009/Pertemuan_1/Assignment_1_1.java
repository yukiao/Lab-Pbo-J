package H071221009.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // utk menginisialisasi objek scanner

        System.out.print("NIM : "); // mencetak kata nim tanpa adanya enter atau penambahan baris pada kalimat
                                    // berikutnya
        String inputNIM = input.nextLine(); // nextline perintah utk memasukkan nilai tipe string/ perintah untuk
                                            // menginput nim

        // Integer.parseInt untuk mengkonversi nilai data tipe string menjadi tipe
        // integer
        int inputNIMint = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3)); // substring utk mengambil
                                                                                       // beberapa karakter/ mengambil 3
                                                                                       // angka terakhir dari nim
        System.out.println(inputNIMint);

        int number = inputNIMint % 7; // nim dimodulo 7
        System.out.println(number == 0 ? "Soal : no 7" : "Soal no : " + number); // println untuk mencetak dengan adanya
                                                                                 // enter atau penambahan baris pada
                                                                                 // kalimat berikutnya
        input.close(); // harus ditutup setelah digunakan
    }
}