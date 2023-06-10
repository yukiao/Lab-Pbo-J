public class Staf extends Anggota {
    int id;
        
    public Staf(String nama, String jabatan, int id) {
        super(nama, jabatan);
        this.id = id;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("ID: " + id);
    }
}
