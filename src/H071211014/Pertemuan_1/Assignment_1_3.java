package H071211014.Pertemuan_1;
import java.util.Scanner;

public class Assignment_1_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name  : ");
        String name = sc.nextLine();

        System.out.print("Umur  : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Hobi  : ");
        String hobby = sc.nextLine();


        sc.close();
       System.out.printf("Nama saya %s, %s tahun, hobby %s", name, age, hobby);
    }
}
