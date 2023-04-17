package H071221041.Pertemuan_5;

public class Anggota {
    public String nama;
    public String jenisKelamin;
    public int umur;

    public void setNama(String nama) {
        this.nama = nama;
    }
     public String getNama() {
        return nama;
    }

    public void setjenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    
    public String getjenisKelamin() {
        return jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public int getUmur() {
        return umur;
    }

    void displayInfo(){
        System.out.println("Nama: "+nama);
        System.out.println("Jenis Kelamin: "+jenisKelamin);
        System.out.println("Umur: "+umur);
    }

    void reminder(){
        System.out.println("Lakukan tugasnya masing-masing dengan baik!!!");
    }
}

class KoordinatorBidang extends Anggota {
    private String bidang;

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("bidang: "+bidang);
    }
}

class PengurusInti extends Anggota{
    private String posisi;

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Posisi: "+posisi);
    }
}

class Staf extends Anggota{
    String jabatan;

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Jabatan: "+jabatan);
    }
}

