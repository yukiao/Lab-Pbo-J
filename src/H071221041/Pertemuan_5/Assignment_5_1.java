package H071221041.Pertemuan_5;

import java.util.Scanner;

public class Assignment_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=".repeat(20));
            System.out.println(" ".repeat(3) + "Tampilan Menu");
            System.out.println("=".repeat(20));
            System.out.println(" ".repeat(3) + "Bangun Ruang");
            System.out.println("-".repeat(20));
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Bola");
            System.out.println("4. Tabung");
            System.out.println("=".repeat(20));
            System.out.println(" ".repeat(3) + "Bangun Datar");
            System.out.println("-".repeat(20));
            System.out.println("5. Persegi");
            System.out.println("6. Persegi Panjang");
            System.out.println("7. Lingkaran");
            System.out.println("8. Segitiga");
            System.out.println("9. Trapesium");

            System.out.print("> ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Input sisi kubus: ");
                    Kubus kubus = new Kubus(sc.nextDouble());
                    System.out.println("Luas Permukaan Kubus: " + kubus.menghitungLuasPermukaan());
                    System.out.println("Volume: " + kubus.menghitungVolume());
                    System.out.println("-".repeat(20));
                    break;

                case 2:
                    System.out.print("Input panjang balok: ");
                    double panjangBalok = sc.nextDouble();
                    System.out.print("Input lebar balok: ");
                    double lebarBalok = sc.nextDouble();
                    System.out.print("Input tinggi balok: ");
                    double tinggiBalok = sc.nextDouble();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Luas Permukaann Balok:" + balok.menghitungLuasPermukaan());
                    System.out.println("Volume: " + balok.menghitungVolume());
                    System.out.println("-".repeat(20));
                    break;

                case 3:
                    System.out.print("Input jari-jari: ");
                    Bola bola = new Bola(sc.nextDouble());
                    System.out.println("Luas Permukaan Bola: " + bola.menghitungLuasPermukaan());
                    System.out.println("Volume Bola: " + bola.menghitungVolume());
                    System.out.println("-".repeat(20));
                    break;

                case 4:
                    System.out.print("Input Jari-jari tabung: ");
                    double jarijari = sc.nextDouble();
                    System.out.print("Input tinggi: ");
                    double tinggi = sc.nextDouble();
                    ;
                    Tabung tabung = new Tabung(jarijari, tinggi);
                    System.out.println("Luas Permukaan Tabung: " + tabung.menghitungLuasPermukaan());
                    System.out.println("Volume Tabung: " + tabung.menghitungVolume());
                    System.out.println("-".repeat(20));
                    break;

                case 5:
                    System.out.print("Input sisi persegi: ");
                    double sisiPersegi = sc.nextDouble();
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas Persegi: " + persegi.menghitungLuas());
                    System.out.println("Keliling Persegi: " + persegi.menghitungKeliling());
                    System.out.println("-".repeat(20));
                    break;

                case 6:
                    System.out.print("Input panjang: ");
                    double panjang = sc.nextDouble();
                    System.out.print("Input lebar: ");
                    double lebar = sc.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas Persegi Panjang: " + persegiPanjang.menghitungLuas());
                    System.out.println("Keliling Persegi Panjang: " + persegiPanjang.menghitungKeliling());
                    System.out.println("-".repeat(20));
                    break;

                case 7:
                    System.out.print("Input jari-jari: ");
                    Lingkaran lingkaran = new Lingkaran(sc.nextDouble());
                    System.out.println("Luas Lingkaran: " + lingkaran.menghitungLuas());
                    System.out.println("Keliling Lingkaran: " + lingkaran.menghitungKeliling());
                    System.out.println("-".repeat(20));
                    break;

                case 8:
                    System.out.print("Input sisiA: ");
                    double sisiA = sc.nextDouble();
                    System.out.print("Input sisiB: ");
                    double sisiB = sc.nextDouble();
                    System.out.print("Input sisiC: ");
                    double sisiC = sc.nextDouble();
                    Segitiga segitiga = new Segitiga(sisiA, sisiB, sisiC);
                    System.out.println("Luas Segitiga: " + segitiga.menghitungLuas());
                    System.out.println("Keliling Segitiga: " + segitiga.menghitungKeliling());
                    System.out.println("-".repeat(20));
                    break;

                case 9:
                    System.out.print("Input sisiA: ");
                    double sisiATrapesium = sc.nextDouble();
                    System.out.print("Input sisiB: ");
                    double sisiBTrapesium = sc.nextDouble();
                    System.out.print("Input sisiC: ");
                    double sisiCTrapesium = sc.nextDouble();
                    System.out.print("input sisiD: ");
                    double sisiDTrapesium = sc.nextDouble();
                    System.out.print("Input tinggi: ");
                    double tinggiTrapesium = sc.nextDouble();
                    Trapesium trapesium = new Trapesium(tinggiTrapesium, sisiATrapesium, sisiBTrapesium, sisiCTrapesium,
                            sisiDTrapesium);
                    System.out.println("Luas Trapesium: " + trapesium.menghitungLuas());
                    System.out.println("Keliling Trapesium: " + trapesium.menghitungKeliling());
                    System.out.println("-".repeat(20));
                    break;

                case 10:
                    System.out.println("Keluar");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
