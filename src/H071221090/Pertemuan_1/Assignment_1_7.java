package H071221090.Pertemuan_1;

import java.util.Scanner;

public class Assignment_1_7 {
    public static void main(String[] args) {
        System.out.println("Masukkan nama praktik yang dicari: ");
        Scanner sc = new Scanner(System.in);
        String zoo = sc.nextLine(); //menagmbil smua kalimat dlm 1 baris
        int kebun = findIndex(zoo); //yg menentukan index ke brp
        System.out.println(kebun);
        

        sc.close();
    }
    public static int findIndex(String teks) {  
        String binatang[] = {"Singa", " gajah", "ayam", "bebek", "kucing"};
        for (int i = 0; i < binatang.length; i+=1 )  { // untuk menghitung panjangnya
            if (binatang[i].equalsIgnoreCase(teks)) { 
                return i ;
                
            }
        }
        return -1; //pengecualian yg msuk di index nya
    } 
}
