package H071221090.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_1 {
    public static void main(String[] args) {
       Scanner inputNIM = new Scanner(System.in);

       System.out.print("NIM : ");
       String NIM = inputNIM.next();
       int Soal = Integer.parseInt(NIM.substring(7));
       if (Soal % 7 == 0) {
            System.out.println("Soal : no 7");
       } else {
            System.out.println("Soal : no " + Soal % 7);
       }
       inputNIM.close();
    }
}