public class Hewan {
    String jenis;
    int jumlahKaki;
    String warna;
    String makanan;
    
    public Hewan(String jenis, int jumlahKaki, String warna, String makanan) {
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;
        this.warna = warna;
        this.makanan = makanan;
    }
    
    public void displayInfo() {
        System.out.println("Jenis: " + jenis);
        System.out.println("Jumlah kaki: " + jumlahKaki);
        System.out.println("Warna: " + warna);
        System.out.println("Makanan: " + makanan);
    }
}
