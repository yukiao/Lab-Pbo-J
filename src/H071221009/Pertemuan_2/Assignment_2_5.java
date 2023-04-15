package H071221009.Pertemuan_2;

public class Assignment_2_5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat(); // objek
        alamat.setJalan("Tamalanrea Indah");
        alamat.setKota("Makassar");
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama("Lia");
        mahasiswa.setNim("H071221009");
        
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
        
class Alamat {
    String jalan; // attribute
    String kota;
        
    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }

    void setJalan(String jalan) {
        this.jalan = jalan;
    }
        
    void setKota(String kotaku) {
        kota = kotaku;
    }
}
        
class Mahasiswa {
    String nama;
    String nim; // attribute
    Alamat alamat;
        
    String getNama() {
        return nama;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    String getNim() {
        return nim;
    }
    void setNim(String nim) {
        this.nim = nim;
    }
    Alamat getAlamat() {
        return alamat;
    }
    void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}