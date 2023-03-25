package H071221062.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            String name, hobby;
            System.out.print("Nama : ");
            name = sc.nextLine();
            System.out.print("Umur : ");
            int umur = sc.nextInt();
            sc.nextLine();
            System.out.print("Hobby : ");
            hobby = sc.nextLine();
            System.out.printf("Nama saya %s, %d tahun, hobby %s", name, umur, hobby);

        } catch (Exception e) {
            System.out.println("Inputan tidak sesuai");

        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
