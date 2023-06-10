package H071211014.Pertemuan_5;

public class Assignment_5_2 {

    public static void main(String[] args) {
        PengurusInti pi1 = new PengurusInti("Attar Musharih", "Ketua Umum", "Humas");
            pi1.tampilkanInfo();
            System.out.println();
            
            KoordinatorBidang kb1 = new KoordinatorBidang("Budi", "Koordinator Bidang", "Web Development");
            kb1.tampilkanInfo();
            System.out.println();
            
            Staf s1 = new Staf("Citra", "Staf Administrasi", 123);
            s1.tampilkanInfo();
        
    }
    
}
