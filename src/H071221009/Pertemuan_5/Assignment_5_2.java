package H071221009.Pertemuan_5;

public class Assignment_5_2 {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Jennie", "rapat", "ketua");
        System.out.println("Nama pengurus inti : " + pengurusInti.getNama());
        System.out.println("Hobby pengurus inti : " + pengurusInti.getHobby());
        System.out.println("Jabatan pengurus inti : " + pengurusInti.getJabatan());
        pengurusInti.tugas();
        System.out.println();

        KoordinatorBidangStaf kbs = new KoordinatorBidangStaf("Mark", "olahraga", "keamanan");
        System.out.println("Nama koordinator bidang & staf : " + kbs.getNama());
        System.out.println("Hobby koordinator bidang & staf : " + kbs.getHobby());
        System.out.println("Bidang & staf koordinator : " + kbs.getbidangStaf());
        kbs.tugas();
    }
}