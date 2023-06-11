package H071221090.Pertemuan_5.assignment_5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        // inp.close();

        while (true) {
            System.out.println("-".repeat(45));
            // System.out.println(" ".repeat(12) +"~ Tampilan Menu ~" );
            System.out.println(" ".repeat(12) +"~ BANGUN RUANG ~" );
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println("-".repeat(45));
            // System.out.println(" ".repeat(12) +"~ Tampilan Menu ~" );
            System.out.println(" ".repeat(12) +"~ BANGUN DATAR ~" );
            System.out.println("1. PERSEGI");
            System.out.println("2. PERSEGI PANJANG");
            System.out.println("3. LINGKARAN"); 
            System.out.println("4. SEGITIGA");
            System.out.println("5. TRAPESIUM");
            System.out.println("-".repeat(45));

            System.out.print("Pilihan: ");
            int pilihan = inputScanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan sisi kubus: ");
                    double sisiKubus = inputScanner.nextDouble();
                    Kubus kubus = new Kubus(sisiKubus);
                    System.out.println("Volume kubus: " + kubus.hitungVolume());
                    System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
                    System.out.println("-".repeat(45));
                    break;
                    
                case 2:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan panjang balok: ");
                    double panjangBalok = inputScanner.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double lebarBalok = inputScanner.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double tinggiBalok = inputScanner.nextDouble();
                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                    System.out.println("Volume balok: " + balok.hitungVolume());
                    System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
                    System.out.println("-".repeat(45));
                    break;

                case 3:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan jari-jari bola: ");
                    double jariJariBola = inputScanner.nextDouble();
                    Bola bola = new Bola(jariJariBola);
                    System.out.println("Luas bola: " + bola.hitungLuasPermukaan());
                    System.out.println("Volume Bola: " + bola.hitungVolume());

                case 4:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJariLingkaran = inputScanner.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                    System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
                    System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
                    System.out.println("-".repeat(45));
                    break;

                case 5:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan jari-jari tabung: ");
                    double jariJariTabung = inputScanner.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = inputScanner.nextDouble();
                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                    System.out.println("Volume tabung: " + tabung.hitungVolume());
                    System.out.println("Luas permukaan tabung: " + tabung.hitungLuasPermukaan());
                    System.out.println("-".repeat(45));
                    break;

                case 6:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan sisi 1 trapesium: ");
                    double sisi1Trapesium = inputScanner.nextDouble();
                    System.out.print("Masukkan sisi 2 trapesium: ");
                    double sisi2Trapesium = inputScanner.nextDouble();
                    System.out.print("Masukkan sisi 3 trapesium: ");
                    double sisi3Trapesium = inputScanner.nextDouble();
                    System.out.print("Masukkan sisi 4 trapesium: ");
                    double sisi4Trapesium = inputScanner.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double tinggiTrapesium = inputScanner.nextDouble();
                    Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium,sisi4Trapesium,tinggiTrapesium);
                    System.out.println("Luas trapesium: " + trapesium.hitungLuas());
                    System.out.println("Keliling trapesium: " + trapesium.hitungKeliling());
                    System.out.println("-".repeat(45));
                    break;
                
                case 7:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan sisi persegi: ");
                    double sisiPersegi = inputScanner.nextDouble();
                    Persegi persegi = new Persegi(sisiPersegi);
                    System.out.println("Luas persegi: " + persegi.hitungLuas());
                    System.out.println("Keliling persegi: " + persegi.hitungKeliling());
                    System.out.println("-".repeat(45));
                    break;
    
                case 8:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan panjang persegi panjang: ");
                    double panjangPersegiPanjang = inputScanner.nextDouble();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    double lebarPersegiPanjang = inputScanner.nextDouble();
                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
                    System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
                    System.out.println("-".repeat(45));
                    break;
    
                case 9:
                    System.out.println("-".repeat(45));
                    System.out.print("Masukkan alas segitiga: ");
                    double alasSegitiga = inputScanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggiSegitiga = inputScanner.nextDouble();
                    Segitiga segitiga = new Segitiga(alasSegitiga, tinggiSegitiga);
                    System.out.println("Luas segitiga: " + segitiga.hitungLuas());
                    System.out.println("Keliling segitiga: " + segitiga.hitungKeliling());
                    System.out.println("-".repeat(45));
                    break;

                case 10:
                    System.out.println("-".repeat(45));
                    System.out.println("SELAMAT TINGGAL");
                    System.out.println("-".repeat(45) + "\n");
                    System.exit(0);
                    break;
    
                default:
                    System.out.println("Pilihan tidak tersedia.");
                    break;
            }       
        }            
    }
}