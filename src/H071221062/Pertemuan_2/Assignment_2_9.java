package H071221062.Pertemuan_2;

// NO.5
// class untuk memanggil object Alamat dan Mahasiswa
public class Assignment_2_9 {
    // tempat untuk mengeksekusi program
    public static void main(String[] args) {
        // pemanggilan objek Alamat dan Mahasiswa
        Assignment_2_8 alamat = new Assignment_2_8();
        alamat.jalan = "Tallo";
        alamat.kota = "Makassar";

        Assignment_2_7 mahasiswa = new Assignment_2_7();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Fauzan";
        mahasiswa.nim = "H071221062";
        Assignment_2_8 tempat = mahasiswa.getAlamat();
        tempat.getAlamatLengkap();
        // memprint objek
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNIM());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
