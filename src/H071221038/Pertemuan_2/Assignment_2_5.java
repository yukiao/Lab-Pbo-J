package H071221038.Pertemuan_2;
//NO.5
// Mendefinisikan class Alamat
class Alamat {
    // Atribut
    String jalan;
    String kota;
    
    // Method setter dan getter untuk mengatur dan mengambil
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }   

    public void setKota(String kota) {
        this.kota = kota;
    }    
    
    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }

    public String getJalan() {
        return jalan;
    }

    public String getKota() {
        return kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    // Method setter dan getter untuk mengatur dan mengambil
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public Alamat getAlamat() {
        return alamat;
    }
}

// class untuk memanggil object Alamat dan Mahasiswa
public class Assignment_2_5 {
    // tempat untuk mengeksekusi program
    public static void main(String[] args) {
        // pemanggilan objek Alamat dan Mahasiswa
        Alamat alamat = new Alamat();
        alamat.jalan = "Bumi Tamalanrea Permai";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Surya";
        mahasiswa.nim = "H071221038";
        Alamat tempat = mahasiswa.getAlamat();
        tempat.getAlamatLengkap();
        // memprint objek
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNIM());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}