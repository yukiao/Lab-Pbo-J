package H071221041.Pertemuan_3;
class Level {
    String tingkatKesulitan;
    int jumlahBintang;

    //konstruktor
    public Level(String tingkatKesulitan, int jumlahBintang) {
        this.tingkatKesulitan = tingkatKesulitan;
        this.jumlahBintang = jumlahBintang;
    }

    //method setTingkatKesulitan untuk menampung dan mengubah nilai variabel tingkatKesulitan
    public void setTingkatKesulitan(String tingkatKesulitan) {
        this.tingkatKesulitan = tingkatKesulitan;
    }

    //method getTingkatKesulitan untuk mengambil nilai varibel tingkatKesulitan
    public String getTingkatKesulitan() {
        return this.tingkatKesulitan;
    }

    //method setJumlahBinatang untuk menampung dan mengubah nilai variabel jumlahBinatang
    public void setJumlahBintang(int jumlahBintang) {
        this.jumlahBintang = jumlahBintang;
    }

    //method getJumlahBinatang untuk mengambil nilai variabel jumlahBinatang
    public int getJumlahBintang() {
        return this.jumlahBintang;
    }
}

public class CookingMama {
    String nama;
    double kecepatanMasak;
    int jumlahBahan;
    Level easy, medium, hard;

    //konstruktor
    public CookingMama(String nama, double kecepatanMasak, int jumlahBahan, Level easy, Level medium, Level hard) {
        this.nama = nama;
        this.kecepatanMasak = kecepatanMasak;
        this.jumlahBahan = jumlahBahan;
        this.easy = easy;
        this.medium = medium;
        this.hard = hard;
    }

    // //konstruktor
    // public CookingMama() {
    //     this.nama = null;
    //     this.kecepatanMasak = 0;
    //     this.jumlahBahan = 0;
    //     this.easy = null;
    //     this.medium = null;
    //     this.hard = null;
    // }

    //behavior
    public void detailIngfo() {
        System.out.println("Kecepatan Memasak: " + this.getKecepatanMasak() + " menit");
        System.out.println("Nama Masakan: " +  this.getNama());
        System.out.println("Jumlah Bahan: " + this.getJumlahBahan());
        System.out.println("Level: " + this.easy.getTingkatKesulitan() + "dengan bintang " + this.easy.getJumlahBintang());
        System.out.println("Level: " + this.medium.getTingkatKesulitan() + "dengan bintang " + this.medium.getJumlahBintang());
        System.out.println("Level: " + this.hard.getTingkatKesulitan() + "dengan bintang " + this.hard.getJumlahBintang());
    }

    //method untuk menambah kecepatan
    public void tambahKecepatanMasak(int kecepatanMasak) {
        this.kecepatanMasak -= kecepatanMasak;
        System.out.println("Kecepatan masak setelah kecepatan ditambah: " + this.kecepatanMasak + " menit");
    }


    // method get
    // public void setNama(String  nama){
    //     this.nama = nama;
    // }

    public String getNama(){
        return nama;
    }

    // public void setKecepatanMasak(double kecepatanMasak){
    //     this.kecepatanMasak = kecepatanMasak;
    // }

    public double getKecepatanMasak(){
        return kecepatanMasak;
    }

    // public void setJumlahBahan(int jumlahBahan){
    //     this.jumlahBahan = jumlahBahan;
    // }

    public int getJumlahBahan(){
        return jumlahBahan;
    }
}