package H071221041.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("NIM : ");
        String inputNIM = inp.nextLine();
        int inputNIMint = Integer.parseInt(inputNIM.substring(inputNIM.length() - 3));
        int number = inputNIMint % 7;
        System.out.println(number == 0 ? "Soal: no 7" : "Soal : no " + number); // ? operator ternary untuk mmriksa
                                                                                // suatu operasi mngmbalikan nilai
                                                                                // kondisi tertentu
        inp.close();
    }
}