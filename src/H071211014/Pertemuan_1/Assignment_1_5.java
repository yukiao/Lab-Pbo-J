package H071211014.Pertemuan_1;
import java.util.Scanner;

public class Assignment_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        sc.close();

        String[] splittedDate = date.split("-");
        int day = Integer.parseInt(splittedDate[0]);
        int month = Integer.parseInt(splittedDate[1]);
        int year = Integer.parseInt(splittedDate[2]);

        System.out.printf("%s %s %s", day, getMonth(month), getYear(year));
    }

    private static String getMonth(int month) {
        switch (month) {
            case 1 : 
                return "Januari";
            case 2 : 
                return "Februari";
            case 3 : 
                return "Maret";
            case 4 : 
                return "April";
            case 5 : 
                return "Mei";
            case 6: 
                return "Juni";
            case 7 : 
                return "Juli";
            case 8 : 
                return "Agustus";
            case 9 : 
                return "September";
            case 10 : 
                return "Oktober";
            case 11 : 
                return "November";
            case 12 : 
                return "Desember";
            default:
                return "";
        }
    }

    private static int getYear(int year) {
        if (year >= 1 && year <= 23) {
            return 2000 + year;
        } else {
            return 1900 + year;
        }
    }
    
}
