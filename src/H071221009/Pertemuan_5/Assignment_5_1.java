package H071221009.Pertemuan_5;

import java.util.Scanner;

public class Assignment_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();

        System.out.println("==== BANGUN DATAR ====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");
        System.out.println();

        System.out.println("Masukkan pilihan: ");
        System.out.print("> ");
        String choice = input.nextLine();
        
        switch (choice) {
            case "1":
                System.out.print("Masukkan sisi kubus: ");
                double sisiKubus = input.nextDouble();
                Kubus kubus = new Kubus(sisiKubus);
                System.out.println();
                System.out.println("Luas permukaan kubus: " + kubus.hitungLuasPermukaan());
                System.out.println("Volume kubus: " + kubus.hitungVolume());
                break;

            case "2":
                System.out.print("Masukkan panjang balok: ");
                double panjangBalok = input.nextDouble();
                System.out.print("Masukkan lebar balok: ");
                double lebarBalok = input.nextDouble();
                System.out.print("Masukkan tinggi balok: ");
                double tinggiBalok = input.nextDouble();
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.println();
                System.out.println("Luas permukaan balok: " + balok.hitungLuasPermukaan());
                System.out.println("Volume kubus: " + balok.hitungVolume());
                break;

            case "3":
                System.out.print("Masukkan jari-jari bola : ");
                double jari_jariBola = input.nextDouble();
                Bola bola = new Bola(jari_jariBola);
                System.out.println();
                System.out.println("Luas permukaan bola : " + bola.hitungLuasPermukaan());
                System.out.println("Volume bola : " + bola.hitungVolume());
                break;

            case "4":
                System.out.print("Masukkan jari-jari tabung : ");
                double jari_jariTabung = input.nextDouble();
                System.out.print("Masukkan tinggi tabung : ");
                double tinggiTabung = input.nextDouble();
                Tabung tabung = new Tabung(jari_jariTabung, tinggiTabung);
                System.out.println();
                System.out.println("Luas permukaan tabung : " + tabung.hitungLuasPermukaan());
                System.out.println("Volume tabung : " + tabung.hitungVolume());
                break;

            case "5":
                System.out.print("Masukkan sisi persegi : ");
                double sisi = input.nextDouble();
                Persegi persegi = new Persegi(sisi);
                System.out.println();
                System.out.println("Luas persegi : " + persegi.hitungLuas());
                System.out.println("Keliling persegi : " + persegi.hitungKeliling());
                break;

            case "6":
                System.out.print("Masukkan panjang persegi panjang : ");
                double panjangPersegiPanjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang : ");
                double lebarPersegiPanjang = input.nextDouble();
                PersegiPanjang persegi2 = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println();
                System.out.println("Luas persegi panjang : " + persegi2.hitungLuas());
                System.out.println("Keliling persegi panjang : " + persegi2.hitungKeliling());
                break;

            case "7":
                System.out.print("Masukkan jari-jari lingkaran : ");
                double jari_jariLingkaran = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jari_jariLingkaran);
                System.out.println();
                System.out.println("Luas lingkaran : " + lingkaran.hitungLuas());
                System.out.println("Keliling lingkaran : " + lingkaran.hitungKeliling());
                break;

            case "8":
                System.out.print("Masukkan sisi segitiga 1 : ");
                double sisiSegitiga1 = input.nextDouble();
                System.out.print("Masukkan sisi segitiga 2 : ");
                double sisiSegitiga2 = input.nextDouble();
                System.out.print("Masukkan sisi segitiga 3 : ");
                double sisiSegitiga3 = input.nextDouble();
                Segitiga segitiga = new Segitiga(sisiSegitiga1, sisiSegitiga2, sisiSegitiga3);
                System.out.println();
                System.out.println("Luas segitiga : " + segitiga.hitungLuas());
                System.out.println("Keliling segitiga : " + segitiga.hitungKeliling());
                break;

            case "9":
                System.out.print("Masukkan sisi atas trapesium : ");
                double sisiAtasTrapesium = input.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium : ");
                double sisiBawahTrapesium = input.nextDouble();
                System.out.print("Masukkan sisi kanan trapesium : ");
                double sisiKananTrapesium = input.nextDouble();
                System.out.print("Masukkan sisi kiri trapesium : ");
                double sisiKiriTrapesium = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium : ");
                double tinggiTrapesium = input.nextDouble();
                Trapesium trapesium = new Trapesium(sisiAtasTrapesium, sisiBawahTrapesium, sisiKananTrapesium, sisiKiriTrapesium, tinggiTrapesium);
                System.out.println();
                System.out.println("Luas trapesium : " + trapesium.hitungLuas());
                System.out.println("Keliling trapesium : " + trapesium.hitungKeliling());
                break;

            default:
                System.out.println("Pilihan yang Anda masukkan tidak valid.");
                break;

        }
        input.close();
    }
}