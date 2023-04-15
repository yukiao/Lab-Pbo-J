package H071221078.Pertemuan_3;

public class Assignment_3_1 {
    public static void main(String[] args) {
        Wadah balok = new Wadah(10, 5, 9); // instance objek Wadah berupa balok dengan langsung menambahkan nilai sesuai parameter pada constructor 1 
        System.out.println("\nVolume wadah berbentuk balok adalah " + balok.volumeWadah() +" cm3"); // cetak method hitung volume
        balok.density = new MassaJenis("Minyak", 0.8); // isi nilai atribut density dengan objek MassaJenis baru dan langsung ditambahkan nilai sesuai parameter pada construcyornya
        balok.massaZat(); // panggil method hitung massa Zat dalam wadah
        System.out.println("=".repeat(50));


        Wadah tabung = new Wadah(15, 20);  // instance objek Wadah berupa tabung dengan langsung menambahkan nilai sesuai parameter pada constructor 2
        System.out.println("\nVolume wadah berbentuk tabung adalah " + balok.volumeWadah() +" cm3");    // cetak method hitung volume
        tabung.density = new MassaJenis("Air", 1);
        tabung.massaZat();
        System.out.println("=".repeat(50));
    }

}

class Wadah {
    double panjang, lebar, tinggi, radius; // memiliki minimal 3 atribut
    MassaJenis density; // atribut bertipe data MassaJenis

    // constructor 1
    public Wadah(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // constructor 2
    public Wadah(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
    }

    public double luasAlasPersegi() {
        return panjang*lebar;
    }

    public double luasAlasLingkaran() {
        return Math.PI*radius*radius;
    }

    public double volumeWadah() {
        if (radius == 0) {
            return luasAlasPersegi()*tinggi;
        }
        return luasAlasLingkaran()*tinggi;
    }

    public void massaZat() {
        // akses method pada class MassaJenis dengan perantara atribut density yang bertipe data MassaJenis
        System.out.printf("Massa zat %s dalam wadah adalah %.4f g\n", density.getNamaZat(), density.getMassaJenis()*volumeWadah());
    }
}

class MassaJenis {
    String namaZat;
    double massaJenis;

    public MassaJenis(String namaZat, double massaJenis) {
        this.namaZat = namaZat;
        this.massaJenis = massaJenis;
    }

    public String getNamaZat() {
        return namaZat;
    }
    public double getMassaJenis() {
        return massaJenis;
    }
}