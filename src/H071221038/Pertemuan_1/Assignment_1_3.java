package H071221038.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String name, hobby;
            System.out.print("Nama : ");
            name = sc.nextLine();
            System.out.print("Umur : ");
            int umur = sc.nextInt();
            System.out.print("Hobby : ");
            sc.nextLine();
            hobby = sc.nextLine();
            System.out.printf("Nama saya %s, %d tahun, hobby %s", name, umur, hobby);
            sc.close();
        } catch (Exception e) {
            System.out.println("Inputan harus bilangan bulat");
        }
    }
}