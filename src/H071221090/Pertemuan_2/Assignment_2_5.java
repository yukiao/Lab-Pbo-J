package H071221090.Pertemuan_2;

//atribut
class Alamat {
   String jalan;
   String kota; 

   public String getAlamatLengkap() {
        return jalan + ", " + kota;
}
}
//behavior
class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public Alamat getAlamat() {
        return alamat;
    }
}

public class Assignment_2_5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Antang Jaya";
        alamat.kota = "Makassar";
        
    
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nabilah Azzahrani S";
        mahasiswa.nim = "H071221090";
    
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
