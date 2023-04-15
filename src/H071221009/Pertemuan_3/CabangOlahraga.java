package H071221009.Pertemuan_3;

class Jenis {
    String jenis; // attribute

    public Jenis(String jenis) { // constructor
        this.jenis = jenis;
    }

    public String getJenis() { // method get
        return jenis;
    }

    public void setJenis(String jenis) { // method set
        this.jenis = jenis;
    }
    
}
    
public class CabangOlahraga { 
    String nama;
    Jenis jenis;
    String perlengkapan; // attribute
    int waktuBermain;
    int jumlahPemain;

    public CabangOlahraga() {} // constructor1

    public CabangOlahraga(String nama, Jenis jenis, String perlengkapan, int waktuBermain, int jumlahPemain) {
        this.nama = nama;
        this.jenis = jenis;
        this.perlengkapan = perlengkapan; // constructor 2
        this.waktuBermain = waktuBermain;
        this.jumlahPemain = jumlahPemain;
    }

    public String getNama() { // method get
        return nama;
    }

    public void setNama(String nama) { // method set
        this.nama = nama;
    }

    public Jenis getJenis() {
        return jenis;
    }

    public void setJenis(Jenis jenis) {
        this.jenis = jenis;
    }

    public String getPerlengkapan() {
        return perlengkapan;
    }

    public void setPerlengkapan(String perlengkapan) {
        this.perlengkapan = perlengkapan;
    }

    public int getWaktuBermain() {
        return waktuBermain;
    }

    public void setWaktuBermain(int waktuBermain) {
        this.waktuBermain = waktuBermain;
    }

    public int getJumlahPemain() {
        return jumlahPemain;
    }

    public void setJumlahPemain(int jumlahPemain) {
        this.jumlahPemain = jumlahPemain;
    }


    
    public void tambahWaktu(int waktuBermain) { // behavior
        this.waktuBermain += waktuBermain;
        System.out.println("Waktu yang digunakan untuk bermain setelah ditambah adalah " + this.waktuBermain + " menit " );
    }

    public void showInfo() { // behavior
        System.out.println("Nama olahraga                      : " + nama);
        System.out.println("Jenis olahraga                     : " + jenis.getJenis());
        System.out.println("Perlengkapan yang digunakan        : " + perlengkapan);
        System.out.println("Waktu yang digunakan untuk bermain : " + waktuBermain + " menit ");
        System.out.println("Jumlah pemain yang bermain         : " + jumlahPemain + " orang ");
    }

}