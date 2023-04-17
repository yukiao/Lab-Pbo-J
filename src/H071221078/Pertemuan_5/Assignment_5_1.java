package H071221078.Pertemuan_5;

import java.util.Scanner;

public class Assignment_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. Kubus\n2. Balok\n3. Bola\n4. Tabung");
        System.out.println("\n==== BANGUN DATAR ====");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Lingkaran\n4. Segitiga\n5. Trapesium");
        System.out.println("Ketik Nama Bangun Geometri");
        System.out.print(">> ");
        String pilihan = input.nextLine();

        switch (pilihan.toLowerCase()) {
            case "kubus":
                System.out.print("sisi : ");
                double sisiKubus = input.nextDouble();

                Kubus kubus = new Kubus(sisiKubus);

                System.out.printf("\nLuas Permukaan  : %.3f m^2" , kubus.luasPermukaan());
                System.out.printf("\nVolume          : %.3f m^3" , kubus.volume());
                break;
                
            case "balok":
                System.out.print("Panjang   : ");
                double panjangBalok = input.nextDouble();
                System.out.print("Lebar   : ");
                double lebarBalok = input.nextDouble();
                System.out.print("Tinggi   : ");
                double tinggiBalok = input.nextDouble();
                
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                System.out.printf("\nLuas Permukaan  : %.3f m^2", balok.luasPermukaan());
                System.out.printf("\nVolume          : %.3f m^3", balok.volume());
                break;
                
            case "bola":
                System.out.print("Jari-jari   : ");
                double radiusBola = input.nextDouble();
                
                Bola bola = new Bola(radiusBola);
                System.out.printf("\nLuas Permukaan  : %.3f m^2", bola.luasPermukaan());
                System.out.printf("\nVolume          : %.3f m^3", bola.volume());
                break;
                
            case "tabung":
                System.out.print("Jari-jari   : ");
                double radiusTabung = input.nextDouble();
                System.out.print("Tinggi  : ");
                double tinggiTabung = input.nextDouble();

                Tabung tabung = new Tabung(radiusTabung, tinggiTabung);
                System.out.printf("\nLuas Permukaan  : %.3f m^2", tabung.luasPermukaan());
                System.out.printf("\nVolume          : %.3f m^2", tabung.volume());
                break;

            case "persegi":
                System.out.print("sisi : ");
                double sisiPersegi = input.nextDouble();

                Persegi persegi = new Persegi(sisiPersegi);

                System.out.printf("\nKeliling  : %.3f m", persegi.keliling());
                System.out.printf("\nLuas      : %.3f m^2", persegi.luas());
                break;

            case "persegi panjang":
                System.out.print("Panjang   : ");
                double panjang = input.nextDouble();
                System.out.print("Lebar     : ");
                double lebar = input.nextDouble();
                
                PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
                System.out.printf("\nKeliling  : %.3f m", persegiPanjang.keliling());
                System.out.printf("\nLuas      : %.3f m^2", persegiPanjang.luas());
                break;

            case "lingkaran":
                System.out.print("Jari-jari : ");
                double radiusLingkaran = input.nextDouble();

                Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
                System.out.printf("\nKeliling  : %.3f m", lingkaran.keliling());
                System.out.printf("\nLuas      : %.3f m^2", lingkaran.luas());
                break;

            case "segitiga":
                System.out.print("Sisi A   : ");
                double sisi1 = input.nextDouble();
                System.out.print("Sisi B   : ");
                double sisi2 = input.nextDouble();
                System.out.print("Sisi C   : ");
                double sisi3 = input.nextDouble();
                
                Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
                System.out.printf("\nKeliling  : %.3f m" + segitiga.keliling());
                System.out.printf("\nLuas      : %.3f m^2" + segitiga.luas());
                break;

            case "trapesium":
                System.out.print("Sisi Atas    : ");
                double sisiAtas = input.nextDouble();
                System.out.print("Sisi Bawah   : ");
                double sisiBawah = input.nextDouble();
                System.out.print("Sisi Kanan   : ");
                double sisiKanan = input.nextDouble();
                System.out.println("Sisi Kiri  : ");
                double sisiKiri = input.nextDouble();
                System.out.println("Tinggi     :");
                double tinggiTrapesium = input.nextDouble();

                Trapesium trapesium = new Trapesium(sisiAtas, sisiBawah, sisiKanan, sisiKiri, tinggiTrapesium);
                System.out.printf("\nKeliling  : %.3f m", trapesium.keliling());
                System.out.printf("\nLuas      : %.3f m^2", trapesium.luas());
                break;

            default:
                System.out.println("Bangun yang Anda Pilih Tidak Tersedia");
        }
        input.close();
    }
}

class BangunRuang {
    private String jenisBangunRuang;
    
    public String getJenisBangunRuang() {
        return jenisBangunRuang;
    }

    public void setJenisBangunRuang(String jenisBangunRuang) {
        this.jenisBangunRuang = jenisBangunRuang;
    }

    public double luasPermukaan() {
        return 0;
    }

    public double volume() {
        return 0;
    }
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double luasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    @Override
    public double volume() {
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2* (panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    private double radius;

    public Bola(double radius) {
        this.radius = radius;
    }

    @Override
    public double luasPermukaan() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }
}

class Tabung extends BangunRuang {
    private double radius;
    private double tinggi;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * Math.PI * radius * (radius + tinggi);
    }

    @Override
    public double volume() {
        return Math.pow(radius, 2) * Math.PI * tinggi;
    }
}

class BangunDatar {
    private String jenisBangunDatar;
    
    public String getJenisBangunDatar() {
        return jenisBangunDatar;
    }

    public void setJenisBangunDatar(String jenisBangunDatar) {
        this.jenisBangunDatar = jenisBangunDatar;
    }

    public double keliling() {
        return 0;
    }

    public double luas() {
        return 0;
    }
}

class Persegi extends BangunDatar {   
    private double sisi;
    
    public Persegi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double keliling() {
        return 4 * sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return 2 * (panjang + lebar);
    }
    
    @Override
    public double luas() {
        return panjang* lebar;
    }
}

class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius)  {
        this.radius = radius;
    }

    @Override
    public double keliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double luas() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Segitiga extends BangunDatar {
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    @Override
    public double keliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public double luas() {
        double s = this.keliling()/2;
        return Math.pow(s * (s - sisi1) * (s - sisi2) * (s - sisi3), 0.5);
    }
}

class Trapesium extends BangunDatar {
    private double sisiAtas;
    private double sisiBawah;
    private double sisiKanan;
    private double sisiKiri;
    private double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKanan, double sisiKiri, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKanan = sisiKanan;
        this.sisiKiri = sisiKiri;
        this.tinggi = tinggi;
    }

    @Override
    public double keliling() {
        return sisiAtas + sisiBawah + sisiKanan + sisiKiri;
    }

    @Override
    public double luas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }
}