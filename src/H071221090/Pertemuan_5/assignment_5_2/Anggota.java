package H071221090.Pertemuan_5;

public class Anggota {
    private String nama;
    private String jenisKelamin;
    private String jabatan;

    public Anggota (String nama, String jenisKelamin, String jabatan) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class PengurusInti extends Anggota {
    private String divisi;

    public PengurusInti (String nama, String jenisKelamin, String jabatan, String divisi) {
        super (nama, jenisKelamin, jabatan);
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
}

class KoorBidangStaff extends Anggota {
    private String departemen;

    public KoorBidangStaff (String nama, String jenisKelamin, String jabatan, String departemen) {
        super (nama, jenisKelamin, jabatan);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
}


