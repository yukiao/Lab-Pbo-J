package H071221090.Pertemuan_3;

public class Assignment_3_1 {
    // attributes
    private String brand;
    private String jenis;
    private int harga; 

    // constructors yg ada parameternya
    public Assignment_3_1(String brand, String jenis, int harga) {
        this.brand = brand;
        this.jenis = jenis;
        this.harga = harga;
    }
    //constructornya kosong atau default
    public Assignment_3_1() {
        this.brand = "unknown";
        this.jenis = "unknown";
        this.harga = 0;
    }

    // behaviors
    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Jenis: " + jenis);
        System.out.println("Harga: " + harga);
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void estimasiDiskon(double diskon) {
        System.out.println((1 - diskon) * harga );
    }

    // main class
    public static void main(String[] args) {
        Assignment_3_1 produk1 = new Assignment_3_1("Some By Mi", "Serum", 300000);
        Assignment_3_1 produk2 = new Assignment_3_1("Cosrx", "Toner", 150000);

        produk1.showInfo();
        produk2.showInfo();

        produk1.setHarga(350000); //di pnggil untuk ubah harga aslinya

        System.out.println("\nSetelah diupdate:");
        produk1.showInfo();
        produk1.estimasiDiskon(0.35);
    }
}
