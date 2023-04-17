package H071221009.Pertemuan_5;

public class KoordinatorBidangStaf extends KomunitasProgrammerUnhas {
    private String bidangStaf;

    public KoordinatorBidangStaf(String nama, String hobby, String bidangStaf) {
        super(nama, hobby);
        this.bidangStaf = bidangStaf;
    }

    public String getbidangStaf() {
        return bidangStaf;
    }

    public void setbidangStaf(String bidangStaf) {
        this.bidangStaf = bidangStaf;
    }

    public void tugas() {
        System.out.println("Saya " + super.getNama() + ", hobby " + super.getHobby() + " mempunyai tugas didalam koordinator bidang & staf " + "sebagai tim " + getbidangStaf() + ".");
    }
}