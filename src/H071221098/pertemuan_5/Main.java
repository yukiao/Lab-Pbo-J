package H071221098.pertemuan_5;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int pilihan = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("==== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println("==== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
        System.out.println();
        System.out.println("10. Keluar");
        System.out.print("Silahkan masukkan pilihan : ");
        pilihan = inp.nextInt();
        while (pilihan != 10) {
        if (pilihan == 1) {
            Scanner input = new Scanner(System.in);
            Kubus a = new Kubus();
            System.out.print("Masukkan panjang sisi kubus : ");
            a.sisi = input.nextInt();
            System.out.println("Volume kubus : " + a.getvolumekubus());
            System.out.println("Luas Permukaan kubus : " + a.getluasPermukaankubus());
            input.close();
        }
        else if (pilihan == 2) {
            Scanner input = new Scanner(System.in);
            Balok a = new Balok();
            System.out.print("Masukkan panjang balok : ");
            a.panjang = input.nextInt();
            System.out.print("Masukkan lebar balok : ");
            a.lebar = input.nextInt();
            System.out.print("Masukkan tinggi balok : ");
            a.tinggi = input.nextInt();
            System.out.println("Volume balok : " + a.getvolumebalok());
            System.out.println("Luas Permukaan balok : " + a.getluasPermukaanbalok());
            input.close();
        }
        else if (pilihan == 3) {
            Scanner input = new Scanner(System.in);
            Bola a = new Bola();
            System.out.print("Masukkan jari jari bola : ");
            a.jari = input.nextInt();
            System.out.println("Volume bola : " + a.getvolumebola());
            System.out.println("Luas Permukaan bola : " + a.getluasPermukaanbola());
            input.close();
        }
        else if (pilihan == 4) {
            Scanner input = new Scanner(System.in);
            Tabung a = new Tabung();
            System.out.print("Masukkan jari jari tabung : ");
            a.jari = input.nextInt();
            System.out.print("Masukkan tinggi tabung : ");
            a.tinggi = input.nextInt();
            System.out.println("Volume tabung : " + a.getvolumetabung());
            System.out.println("Luas Permukaan tabung : " + a.getluasPermukaantabung());
            input.close();
        }
        else if (pilihan == 5) {
            Scanner input = new Scanner(System.in);
            Persegi a = new Persegi();
            System.out.print("Masukkan sisi : ");
            a.sisi = input.nextInt();
            System.out.println("luas persegi : " + a.getluasgpersegi());
            System.out.println("keliling persegi : " + a.getkelilingpersegi());
            input.close();
        }
        else if (pilihan == 6) {
            Scanner input = new Scanner(System.in);
            persegiPanjang a = new persegiPanjang();
            System.out.print("Masukkan panjang : ");
            a.panjang = input.nextInt();
            System.out.print("Masukkan lebar : ");
            a.lebar = input.nextInt();
            System.out.println("luas persegi : " + a.getluaspersegiPanjang());
            System.out.println("keliling persegi : " + a.getkelilingpersegiPanjang());
            input.close();
        }
        else if (pilihan == 7) {
            Scanner input = new Scanner(System.in);
            Lingkaran a = new Lingkaran();
            System.out.print("Masukkan jari jari : ");
            a.jari = input.nextInt();
            System.out.println("luas lingkaran : " + a.getluaslingkaran());
            System.out.println("keliling lingkaran : " + a.getkelilinglingkaran());
            input.close();
        }
        else if (pilihan == 8) {
            Scanner input = new Scanner(System.in);
            Segitiga a = new Segitiga();
            System.out.print("Masukkan alas : ");
            a.alas = input.nextInt();
            System.out.print("Masukkan tinggi : ");
            a.tinggi = input.nextInt();
            System.out.print("Masukkan sisi : ");
            a.sisi = input.nextInt();
            System.out.println("luas segitiga : " + a.getluassegitiga());
            System.out.println("keliling segitiga : " + a.getkelilingsegitiga());
            input.close();
        }
        else if (pilihan == 9) {
            Scanner input = new Scanner(System.in);
            Trapesium a = new Trapesium();
            System.out.print("Masukkan alas atas : ");
            a.alas1 = input.nextInt();
            System.out.print("Masukkan alas bawah : ");
            a.alas2 = input.nextInt();
            System.out.print("Masukkan rusuk kiri : ");
            a.rusuk1 = input.nextInt();
            System.out.print("Masukkan rusuk kanan : ");
            a.rusuk2 = input.nextInt();
            System.out.print("Masukkan tinggi : ");
            a.tinggi = input.nextInt();
            System.out.println("luas trapesium : " + a.getluastrapesium());
            System.out.println("keliling trapesium : " + a.getkelilingtrapesium());
            input.close();
        }
        else {
            System.out.println("Pilihan salah");
        }
        break;
        }
        
        inp.close();
        
    
    
    }
}