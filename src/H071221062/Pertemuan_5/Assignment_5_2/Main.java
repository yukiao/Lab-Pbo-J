class Anggota {
     String nama;
     String jabatan;
    
    public Anggota(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }
}


class PengurusInti extends Anggota {
    private String divisi;
    
    public PengurusInti(String nama, String jabatan, String divisi) {
        super(nama, jabatan);
        this.divisi = divisi;
    }
    
    public String getDivisi() {
        return divisi;
    }
    
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
    

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi);
    }
}

class KoordinatorBidang extends Anggota {
    private String bidang;
    
    public KoordinatorBidang(String nama, String jabatan, String bidang) {
        super(nama, jabatan);
        this.bidang = bidang;
    }
    
    public String getBidang() {
        return bidang;
    }
    
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
    

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bidang: " + bidang);
    }
}

class Staf extends Anggota {
    private String tugas;
    
    public Staf(String nama, String jabatan, String tugas) {
        super(nama, jabatan);
        this.tugas = tugas;
    }
    
    public String getTugas() {
        return tugas;
    }
    
    public void setTugas(String tugas) {
        this.tugas = tugas;
    }
    
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tugas: " + tugas);
    }
}

public class Main {
    public static void main(String[] args) {
        PengurusInti pengurus1 = new PengurusInti("Fauzan", "Ketua", "IT");
        KoordinatorBidang koordinator1 = new KoordinatorBidang("Rama", "Koordinator", "Web Development");
        Staf staf1 = new Staf("Dhan", "Staf", "Membantu tugas-tugas pengurus inti");
        
        
        System.out.println("\nInformasi Pengurus Inti:");
        pengurus1.displayInfo();
        
        System.out.println("\nInformasi Koordinator Bidang:");
        koordinator1.displayInfo();

        System.out.println("\nInformasi Koordinator Bidang:");
        staf1.displayInfo();
    }
}