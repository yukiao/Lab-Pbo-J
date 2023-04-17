package H071221098.pertemuan_1;
import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in) ;
        int bilBulat,bilDesimal,n,i;

        bilBulat = 0;
        bilDesimal = 0;

        try{
            System.out.println("Masukkan Jumlah Bilangan :");
            n = userInput.nextInt();
            userInput.nextLine();

            for(i = 0; i < n; i++) {
                double num = userInput.nextDouble();  //mencari nilai yang double / float klo di python
                if (num % 1 == 0 ) {
                    bilBulat++;
                } else {
                    bilDesimal++;
                }
            }
            System.out.println(bilBulat + " Bilangan Bulat");
            System.out.println(bilDesimal + " Bilangan Desimal");
            userInput.close() ;
        } catch (Exception e) {
            System.out.println("Input Harus Berupa Angka");
        }
    }
}