package H071221090.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try{
            System.out.print("Name : ");
            String name = input.nextLine();

            System.out.print("Age : ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Hobby : ");
            String hobby = input.nextLine();

            System.out.println("Nama saya " + name + ", " + age + " tahun, hobby " + hobby + ".");    
        } catch (Exception e) {
            System.out.println("Umur Harus Berupa Angka");
        }   finally{
            input.close();
        }
        
    }
}
