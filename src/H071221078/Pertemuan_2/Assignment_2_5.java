package H071221078.Pertemuan_2;

public class Assignment_2_5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();   // instance objek Alamat
        alamat.jalan = "Jln. Bukit Asri"; // isi nilai untuk astribut yang ada
        alamat.kota = "Bulukumba";

        Mahasiswa mahasiswa = new Mahasiswa (); // instance objek Mahasiswa
        mahasiswa.alamat = alamat; // memberikan nilai atribut alamat yang ada pada objek mahasiswa sebagai objek alamat yang telah dibuat di atas
        mahasiswa.nama = "Adnan"; // isi nilai untuk atribut lainnya
        mahasiswa.nim = "H071221078";

        System.out.println("Nama: "+ mahasiswa.getNama()); // cetak nilai atribut nama
        System.out.println("NIM: "+ mahasiswa.getNim()); // cetak nilai atribut nim
        
        // objek mahasiswa mengakses method getAlamat() yang mengembalikan atribut bertipe Alamat sehingga bisa mengakses method pada class Alamat yaitu getAlamatLengkap()
        System.out.println("Alamat: "+ mahasiswa.getAlamat().getAlamatLengkap());
    }
}

class Alamat {
    String jalan, kota;

    // method cetak alamat lengkap
    String getAlamatLengkap() {
        return jalan + ", "+ kota;
    }
}

class Mahasiswa {
    String nama, nim;
    Alamat alamat; // atribut dengan tipe data class Alamat

    String getNama() {  
        return nama;
    }

    String getNim() {
        return nim;
    }

    // method yang mengembalikan nilai bertipe data Alamat
    Alamat getAlamat() {
        return alamat;
    }
}