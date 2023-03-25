package H071221078.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temukan negara: ");
        String negara1 = input.nextLine();
        input.close();
        int index = findIndex(negara1);

        if (index == -1) {
            System.out.println("Negara tidak ditemukan");
        } else {
            System.out.println("Negara ditemukan pada indeks " + index);
        }
    }

    public static int findIndex(String text) {
        String[] country = { "Indonesia", "India", "Turkiye", "Saudi Arabia", "Australia" };
        for (int j = 0; j < country.length; j++) {
            if (country[j].equalsIgnoreCase(text)) {
                return j;
            }
        }
        return -1;
    }
}