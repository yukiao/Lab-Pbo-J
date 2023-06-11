package H071221098.pertemuan_1;
import java.util.Scanner;

public  class Assignment_1_1 {
    public static void main(String[] args) {
        String nim;
        Scanner keyboard = new Scanner(System.in);     //in untuk pengimputan karena yg di input pake int 
        System.out.print("Masukkan akhiran NIM: ");
        nim = keyboard.nextLine();   //variabel keyboard untuk pengimputan , nextIn itu untuk kondisitipe data int
        int urutan = Integer.parseInt(nim.substring(nim.length()-3));
        if (urutan % 7 == 0) {
            System.out.println("Soal: no 7"); } else   //if else kondisi 
        if (urutan % 7 == 1) {
            System.out.println("Soal: no 1");} else 
        if (urutan % 7 == 2) {
            System.out.println("Soal: no 2");} else 
        if (urutan % 7 == 3) {
            System.out.println("Soal: no 3");} else
        if (urutan % 7 == 4) {
            System.out.println("Soal: no 4");} else
        if (urutan % 7 == 5) {
            System.out.println("Soal: no 5");} else
        if (urutan % 7 == 6) {
            System.out.println("Soal: no 6");}
        keyboard.close();   //harus di close supaya tidak berjalan terus kode nya 
    }

}