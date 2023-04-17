public class KoordinatorBidang extends Anggota{
    String namaBidang;
        
    public KoordinatorBidang(String nama, String jabatan, String namaBidang) {
        super(nama, jabatan);
        this.namaBidang = namaBidang;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Bidang: " + namaBidang);
    }
}
