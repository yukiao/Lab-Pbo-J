package H071221098.pertemuan_1;
import java.util.Scanner;

public class Assignment_1_3 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        try{
            System.out.println("Nama :");
            String name = input.nextLine();

            System.out.println("Age :");
            int age = input.nextInt();
            input.nextLine();  //baris 

            System.out.println("Hobby :");  
            String hobby = input.nextLine();

            System.out.println("Nama saya " + name + "," + age + " Tahun ,hobby " + hobby + ".");
        } catch (Exception e) {
            System.out.println("Umur harus berupa angka");
        }finally{input.close();}
    
    }
}
