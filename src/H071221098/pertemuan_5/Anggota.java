package H071221098.pertemuan_5;
public class Anggota {
    private String nama;
    private int umur;
    private String gender;

    public Anggota (String nama, int umur, String gender){
        this.nama = nama ;
        this.umur = umur;
        this.gender = gender;
    }
    public String getName() {
        return nama;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return umur;
    }

    public void setAge(int umur) {
        this.umur = umur;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class PengurusInti extends Anggota{
    private String jabatan;

    public PengurusInti(String nama, int umur, String gender, String jabatan){
        super(nama, umur, gender);
        this.jabatan = jabatan;
    }
    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class KordinatorBidangStaff extends Anggota{
    private String bidang;

    public KordinatorBidangStaff(String nama, int umur, String gender, String bidang){
        super(nama, umur, gender);
        this.bidang = bidang;
    }
    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}


