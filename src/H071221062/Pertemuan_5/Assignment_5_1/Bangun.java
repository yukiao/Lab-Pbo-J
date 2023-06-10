import java.util.Scanner;

public class Bangun {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        jalanin();
        
    }
    public static void lanjut(){   
        System.out.print("Lagi ?\n 1. lagi\n2. udahan\n>");
        int lagi = inp.nextInt();
        if (lagi==1){
            jalanin();
        }
        else{
            System.out.println("ty");;
        }

    }
    public static void  jalanin(){
        System.out.println("==========BANGUN RUANG==========");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("\n==========BANGUN DATAR==========");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Segitiga");
        System.out.println("9. Trapesium\n");
        System.out.print("pilih =\n>");
        int menu=inp.nextInt(); 
        
        switch (menu) {
            case 1:
             Kubus kubus = new Kubus();
             System.out.print("Masukkan sisi = ");
             kubus.sisi= inp.nextInt();
             kubus.luasPermukaankubus();
             lanjut();
                break;
            case 2: 
            Balok balok = new Balok();
            System.out.print("Masukkan panjang = ");
            balok.panjang=inp.nextInt();
            System.out.print("Masukkan lebar = ");
            balok.lebar=inp.nextInt();
            System.out.print("Masukkan tinggi = ");
            balok.tinggi=inp.nextInt();
            balok.luasPermukaanBalok();
            lanjut();
            break;
            case 3:
            Bola bola=new Bola();
            System.out.print("Masukkan jarijari = ");
            bola.jarijari=inp.nextInt();
            bola.luasPermukaanBola();
            lanjut();
            break;
            case 4:
            Tabung tabung= new Tabung();
            System.out.print("Masukkan jarijari = ");
            tabung.jarijari=inp.nextInt();
            System.out.print("Masukkan tinggi = ");
            tabung.tinggi=inp.nextInt();
            lanjut();
            break;
            case 5:
            Persegi persegi=new Persegi();
            System.out.print("Masukkan sisi = ");
            persegi.sisiD=inp.nextInt();
            persegi.luasPersegi();
            lanjut();
            break;
            case 6:
            PersegiPanjang persegiPanjang=new PersegiPanjang();
            System.out.print("Masukkan panjang = ");
            persegiPanjang.panjangD=inp.nextInt();
            System.out.print("Masukkan lebar = ");
            persegiPanjang.lebarD=inp.nextInt();
            persegiPanjang.luasPersegiPanjang();
            lanjut();
            break;
            case 7:
            Lingkaran lingkaran=new Lingkaran();
            System.out.print("Masukkan jarijari = ");
            lingkaran.jarijariD=inp.nextInt();
            lingkaran.luasLingkaran();
            lanjut();
            break;
            case 8:
            Segitiga segitiga=new Segitiga();
            System.out.print("Masukkan alas = ");
            segitiga.alas= inp.nextInt();
            System.out.print("Masukkan tinggi = ");
            segitiga.tinggiD=inp.nextInt();
            System.out.print("Masukkan sisi = ");
            segitiga.sisiD=inp.nextInt();
            segitiga.luasSegitiga();;
            lanjut();
            break;
            case 9:
            Trapesium trapesium= new Trapesium();
            System.out.print("Masukkan sisiA = ");
            trapesium.sisiAA=inp.nextInt();
            System.out.print("Masukkan sisiB = ");
            trapesium.sisiBB=inp.nextInt();
            System.out.print("Masukkan sisiC = ");
            trapesium.sisiCC=inp.nextInt();
            System.out.println("Masukkan sisiD = ");
            trapesium.sisiDD=inp.nextInt();
            System.out.println("Masukkan sisisejajar1 = ");
            trapesium.sisisejajar1=inp.nextInt();
            System.out.print("Masukkan sisisejajar2 = ");
            trapesium.sisisejajar2=inp.nextInt();
            System.out.print("Masukkan tinggi = ");
            trapesium.tinggiD=inp.nextInt();
            trapesium.luasTrapesium();;
            lanjut();;
            break;

            default:
                break;
        }
    
    
}}

