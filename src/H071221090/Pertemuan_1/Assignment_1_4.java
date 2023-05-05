package H071221090.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat ;

        System.out.println("Masukkan Judul Film : ");
        kalimat = input.nextLine();
        String kalimatBaru ="";

        for (String kata : kalimat.split(" ")) {
            String kataBaru = kata.substring(0, 1).toUpperCase() +  kata.substring(1).toLowerCase();
            kalimatBaru = kalimatBaru +  kataBaru + " "; //+= untuk menambahkan kalimatbaru dan katabaru
            
        }
        System.out.println(kalimatBaru);
        input.close();
    }
}
