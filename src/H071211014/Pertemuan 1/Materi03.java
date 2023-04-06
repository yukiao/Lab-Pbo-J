/**
 * Materi03
 */
import java.util.Scanner;
public class Materi03 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = inp.nextInt();
        inp.nextLine();
        System.out.println("Enter String");
        String text = inp.nextLine();

        System.out.println(a + " " + text);

        inp.close();


    }
}