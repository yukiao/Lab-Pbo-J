public class PengurusInti extends Anggota {
    String bidang;
        
        public PengurusInti(String nama, String jabatan, String bidang) {
            super(nama, jabatan);
            this.bidang = bidang;
        }
        
        public void tampilkanInfo() {
            super.tampilkanInfo();
            System.out.println("Bidang: " + bidang);
        }
    }
    
