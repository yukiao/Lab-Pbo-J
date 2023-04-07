package H071211014.Pertemuan_1;
import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Judul Film : ");
        String filmTitle = sc.nextLine().toLowerCase();
        sc.close();

        String[] titleWords = filmTitle.split(" ");
        String formattedTitle = "";
        for (String word : titleWords) {
            formattedTitle += word.substring(0, 1).toUpperCase();
            formattedTitle += word.substring(1);
            formattedTitle += " ";
        }

        System.out.println(formattedTitle.trim());

    }
    
}
