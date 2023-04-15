package H071221041.Pertemuan_2;

public class Assignment_2_5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.setJalan ("Jalan sahabat 5");
        alamat.setKota ("Makassar");

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setAlamat(alamat);
        mahasiswa.setNama("Muthia"); 
        mahasiswa.setNim("H071221041");

        System.out.println("Nama: " +  mahasiswa.getName());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
class Alamat{
    String kota, jalan;

    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }

    void setKota(String Kota) {
        kota = Kota;
    }

    void setJalan(String Jalan) {
        jalan = Jalan;
    }
}


class Mahasiswa{
    String nama, nim;
    Alamat alamat;

    //method utk mndapatkan nilai alamat
    Alamat getAlamat() {
        return alamat;
    }
    
    //method utk mnampung nilai alamat
    void setAlamat(Alamat  myAlamat) {
        alamat = myAlamat;
    }

    //method utk mndapatkan nilai nama
    String getName() {
        return nama;
    }
    
    //method utk mmnampung nilai nama
    void setNama(String name){
        nama = name;
    }

    //method utk mndapatkan nilai nim
    String getNim() {
        return nim;
    }

    //method utk mndapatkan nilai nim
    void setNim(String mynim){
        nim = mynim;
    }
}