package H071211014.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int integer = 0, decimal = 0;
        for (int i = 0; i < n; i++) {
            double num  = sc.nextDouble();
            if (num % 1 == 0){
                integer++;
            }else{
                decimal++;
            }
        } 
        sc.close();
        System.out.println(integer + " Bilangan bulat");
        System.out.println(decimal + " Bilangan decimal");
    }   
}
