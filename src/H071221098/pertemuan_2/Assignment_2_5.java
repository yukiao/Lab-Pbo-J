package H071221098.pertemuan_2;

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;      //Alamat ini punya atribut sendiri utk dpt alamatLengkap

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public Alamat getAlamat(){
        return alamat;
    }
}

class Alamat{
    String jalan;
    String kota;

    public String getAlamatLengkap(){
        return jalan + ", " + kota;
    }
}

public class Assignment_2_5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Perintis Kemerdekaan 12";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Fauzan";
        mahasiswa.nim = "H071221098";

        System.out.println("Nama : "+ mahasiswa.getNama());
        System.out.println("NIM : "+ mahasiswa.getNim());
        Alamat alamat2 = mahasiswa.getAlamat();
        System.out.println("Alamat : "+ alamat2.getAlamatLengkap());
    } 
}