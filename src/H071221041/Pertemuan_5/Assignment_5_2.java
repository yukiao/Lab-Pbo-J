package H071221041.Pertemuan_5;

public class Assignment_5_2 {
    public static void main(String[] args) {
        KoordinatorBidang koordinatorBidang = new KoordinatorBidang();
        System.out.println(" ".repeat(15) + "Koordinator Bidang");
        System.out.println("-".repeat(50));
        koordinatorBidang.setNama("Tanjiro");
        koordinatorBidang.setUmur(19);
        koordinatorBidang.setjenisKelamin("Laki-Laki");
        koordinatorBidang.setBidang("PBO");
        koordinatorBidang.displayInfo();
        koordinatorBidang.reminder();
        System.out.println("=".repeat(50));

        PengurusInti pengurusInti = new PengurusInti();
        System.out.println(" ".repeat(18) + "Pengurus Inti");
        System.out.println("-".repeat(50));
        pengurusInti.setNama("Inosuke");
        pengurusInti.setUmur(20);
        pengurusInti.setjenisKelamin("Laki-Laki");
        pengurusInti.setPosisi("Ketua Kelas");
        pengurusInti.displayInfo();
        pengurusInti.reminder();
        System.out.println("=".repeat(50));

        Staf staf = new Staf();
        System.out.println(" ".repeat(22) + "Staf");
        System.out.println("-".repeat(50));
        staf.setNama("Zenitsu");
        staf.setUmur(21);
        staf.setjenisKelamin("Laki-Laki");
        staf.setJabatan("Staf Keuangan");
        staf.displayInfo();
        staf.reminder();
        System.out.println("=".repeat(50));
    }
}
