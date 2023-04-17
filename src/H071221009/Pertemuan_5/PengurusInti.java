package H071221009.Pertemuan_5;

public class PengurusInti extends KomunitasProgrammerUnhas {
    private String jabatan; 

    public PengurusInti(String nama, String hobby, String jabatan) {
        super(nama, hobby);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void tugas() {
        System.out.println("Saya " + super.getNama() + ", hobby " + super.getHobby() + " mempunyai jabatan didalam pengurus inti sebagai " + getJabatan() + ".");
    }
}