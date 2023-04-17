import java.util.Scanner;

abstract class BangunDatar {
    abstract double hitungKeliling();
    abstract double hitungLuas();
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {}

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang() {}

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
}

class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {}

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * jari;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * jari * jari;
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga() {}

    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + tinggi + Math.sqrt(Math.pow(alas, 2 ) + Math.pow(tinggi, 2 ));
    }

    @Override
    public double hitungLuas() {
        return (alas * tinggi)/2;
    }
}

abstract class BangunRuang {
    abstract double hitungLuas();
    abstract double hitungVolume();
}

class Kubus extends BangunRuang {
    private double sisi;

    public Kubus() {}

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return 6 * sisi * sisi;
    }

    @Override
    double hitungVolume() {
        return sisi * sisi * sisi;
    }
}

class Balok extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok() {}

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi)) ;
    }

    @Override
    double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang {
    private double jari;

    public Bola() {}

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    double hitungLuas() {
        return 4 * Math.PI * jari * jari;
    }

    @Override
    double hitungVolume() {
        return 4/3 * Math.PI * jari * jari * jari;
    }
}

class Tabung extends BangunRuang {
    private double jari;
    private double tinggi;

    public Tabung() {}

    public void setJari(double jari) {
        this.jari = jari;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    double hitungLuas() {
        return 2 * Math.PI * jari * (jari + tinggi);
    }

    @Override
    double hitungVolume() {
        return Math.PI * jari * jari * tinggi;
    }
}

class Trapesium extends BangunDatar {
    private double alas;
    private double sisimiring;
    private double atas;
    private double tinggi;

    public Trapesium() {}

    public void setAlas(double alas) {
        this.alas = alas;
    }
    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }
    public void setAtas(double atas) {
        this.atas = atas;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungKeliling() {
        return alas + (sisimiring * 2) + atas;
    }

    @Override
    public double hitungLuas() {
        return ((alas + atas) * tinggi)/2;
    }
}

public class Assignment_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ===== BANGUN RUANG ===== ");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println();
        System.out.println();
        System.out.println(" ===== BANGUN DATAR ===== ");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. SEGITIGA");
        System.out.println("9. TRAPESIUM");

        System.out.print("> ");
        int pilihan = sc.nextInt();
        System.out.println(" ====================== ");
        if (pilihan == 1) {
            Kubus kubus = new Kubus();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = sc.nextDouble();
            kubus.setSisi(angka);

            System.out.printf("Luas Permukaan : %.2f m^2", kubus.hitungLuas());
            System.out.printf("\nVolume         : %.2f m^3", kubus.hitungVolume());

        } else if (pilihan == 2) {
            Balok balok = new Balok();
            System.out.print("Masukkan panjang balok : ");
            Double angka1 = sc.nextDouble();
            balok.setPanjang(angka1);

            System.out.print("Masukkan lebar balok  : ");
            Double angka2 = sc.nextDouble();
            balok.setLebar(angka2);

            System.out.print("Masukkan tinggi balok : ");
            Double angka3 = sc.nextDouble();
            balok.setTinggi(angka3);

            System.out.printf("Luas Permukaan : %.2f m^2", balok.hitungLuas());
            System.out.printf("\nVolume         : %.2f m^3", balok.hitungVolume());

        } else if (pilihan == 3) {
            Bola bola = new Bola();
            System.out.print("Masukkan jari-jari bola : ");
            Double angka = sc.nextDouble();
            bola.setJari(angka);

            System.out.printf("Luas Permukaan : %.2f m^2", bola.hitungLuas());
            System.out.printf("\nVolume         : %.2f m^3", bola.hitungVolume());

        } else if (pilihan == 4) {
            Tabung tabung = new Tabung();
            System.out.print("Masukkan jari-jari tabung : ");
            Double angka1 = sc.nextDouble();
            tabung.setJari(angka1);

            System.out.print("Masukkan tinggi tabung : ");
            Double angka2 = sc.nextDouble();
            tabung.setTinggi(angka2);

            System.out.printf("Luas Permukaan : %.2f m^2", tabung.hitungLuas());
            System.out.printf("\nVolume         : %.2f m^3", tabung.hitungVolume());

        } else if (pilihan == 5) {
            Persegi persegi = new Persegi();
            System.out.print("Masukkan panjang sisi : ");
            Double angka = sc.nextDouble();
            persegi.setSisi(angka);

            System.out.printf("Keliling : %.2f m", persegi.hitungKeliling());
            System.out.printf("\nLuas     : %.2f m^2", persegi.hitungLuas());

        } else if (pilihan == 6) {
            PersegiPanjang persegiPanjang = new PersegiPanjang();
            System.out.print("Masukkan panjang : ");
            Double angka1 = sc.nextDouble();
            persegiPanjang.setPanjang(angka1);

            System.out.print("Masukkan lebar : ");
            Double angka2 = sc.nextDouble();
            persegiPanjang.setLebar(angka2);

            System.out.printf("Keliling : %.2f m", persegiPanjang.hitungKeliling());
            System.out.printf("\nLuas     : %.2f m^2", persegiPanjang.hitungLuas());

        } else if (pilihan == 7) {
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Masukkan jari-jari : ");
            Double angka = sc.nextDouble();
            lingkaran.setJari(angka);

            System.out.printf("Keliling : %.2f m" , lingkaran.hitungKeliling());
            System.out.printf("\nLuas     : %.2f m^2", lingkaran.hitungLuas());

        } else if (pilihan == 8) {
            Segitiga segitiga = new Segitiga();
            System.out.print("Masukkan alas : ");
            Double angka1 = sc.nextDouble();
            segitiga.setAlas(angka1);

            System.out.print("Masukkan tinggi : ");
            Double angka2 = sc.nextDouble();
            segitiga.setTinggi(angka2);

            System.out.printf("Keliling : %.2f m", segitiga.hitungKeliling());
            System.out.printf("\nLuas     : %.2f m^2", segitiga.hitungLuas());

        } else if (pilihan == 9) {
            Trapesium trapesium = new Trapesium();
            System.out.print("Masukkan alas : ");
            Double angka1 = sc.nextDouble();
            trapesium.setAlas(angka1);

            System.out.print("Masukkan sisi miring : ");
            Double angka2 = sc.nextDouble();
            trapesium.setSisimiring(angka2);

            System.out.print("Masukkan atas : ");
            Double angka3 = sc.nextDouble();
            trapesium.setAtas(angka3);

            System.out.print("Masukkan tinggi : ");
            Double angka4 = sc.nextDouble();
            trapesium.setTinggi(angka4);

            System.out.printf("Keliling : %.2f m", trapesium.hitungKeliling());
            System.out.printf("\nLuas     : %.2f m^2", trapesium.hitungLuas());

        } else {
            System.out.println("Inputan tidak valid");
        }
        sc.close();
    }
}