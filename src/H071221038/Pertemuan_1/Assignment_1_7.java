package H071221038.Pertemuan_1;
import java.util.Scanner;

public class Assignment_1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country = sc.nextLine();
        int negara = findIndex(country);
        System.out.println(negara);

        sc.close();
    }
    public static int findIndex(String teks) {
        String arrNegara[] = {"Indonesia", "Argentina", "Portugal", "Prancis", "Inggris"};
        for (int i = 0; i < arrNegara.length; i++){
            if (arrNegara[i].equalsIgnoreCase(teks)) {
                return i ;
            }
        }
        return -1;
    } 
    
}