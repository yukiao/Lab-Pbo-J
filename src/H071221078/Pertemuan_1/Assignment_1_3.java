package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Nama : ");
            String Name = input.nextLine();

            System.out.print("Umur : ");
            int Age = input.nextInt();

            input.nextLine();

            System.out.print("Hobby : ");
            String Hobby = input.nextLine();

            System.out.println("Nama saya " + Name + ", " + Age + " Tahun, hobby " + Hobby);
        } catch (Exception e) {
            System.out.println("Umur hanya menerima inputan angka");
        } finally {
            input.close();
        }

    }
}

