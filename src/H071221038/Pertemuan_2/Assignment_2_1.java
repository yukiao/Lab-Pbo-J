package H071221038.Pertemuan_2;
/**
 * No1
 */
// Mendefinisikan class Kamera
class Kamera {
    // Atribut
    String merek_kamera;
    int harga;
    int jumlahMegapixel;

    // Method setter dan getter untuk mengatur/mengubah dan mengambil
    public void setMerek_kamera(String merek_kamera) {
        // keyword "this"  digunakan untuk membedakan atribut kelas dan parameter method yang memiliki nama yang sama.
        // dengan menggunakan "this", kita dapat memastikan bahwa kita merujuk pada atribut kelas dan bukan pada parameter method.
        this.merek_kamera = merek_kamera;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setJumlahMegapixel(int jumlahMegapixel) {
        this.jumlahMegapixel = jumlahMegapixel;
    }
    public String getMerek_kamera() {
        return merek_kamera;
    }
    public int getHarga() {
        return harga;
    }
    public int getJumlahMegapixel() {
        return jumlahMegapixel;
    }
}

public class Assignment_2_1 {
    // tempat untuk mengeksekusi program
    public static void main(String[] args) {
        // pemanggilan objek
        Kamera kamera = new Kamera();
        kamera.merek_kamera = "Canon EOS 750D";
        kamera.harga = 15000000;
        kamera.jumlahMegapixel = 24;
        // memprint objek
        System.out.println("Merek kamera : "+kamera.getMerek_kamera());
        System.out.println("Harga : "+kamera.getHarga());
        System.out.println("Megapixel : "+kamera.getJumlahMegapixel());
    }
    
}
