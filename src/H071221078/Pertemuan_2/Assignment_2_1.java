package H071221078.Pertemuan_2;

public class Assignment_2_1 {
    public static void main(String[] args) {
        // instance object Olimpiade
        Olimpiade olimpiade1 = new Olimpiade(2012, "London", "Amerika Serikat");
        olimpiade1.tahun = 2013;
        System.out.println(olimpiade1.jenisOlimpiade());
        olimpiade1.infoOlimpiade();
    }
}

class Olimpiade {
    int tahun;
    String kota, juaraUmum;

    // constructor
    public Olimpiade (int tahun, String kota, String juaraUmum) {
        this.tahun = tahun;
        this.kota = kota;
        this.juaraUmum = juaraUmum;
    }

    public String jenisOlimpiade() {
        if (tahun%4 == 0) {
            return "Olimpiade Musim Panas tahun "+ tahun;
        }
        return "Olimpiade Musim Dingin"+ tahun;
    }
    
    public void infoOlimpiade() {
        System.out.println("Olimpiade dilaksanakan di-kota "+ kota);
        System.out.println("Juara umum pada Olimpiade ini adalah "+ juaraUmum);
    }
}