package H071221078.Pertemuan_2;

public class Assignment_2_3 {
    public static void main(String[] args) {
        // instance object produk dengan langsung menambahkan nilai
        Produk produk = new Produk("157684EWL", "Shampo Sunsilk", 0, 15000);

        // memanggil method yang tersedia dalam class Produk
        produk.cekData();
        System.out.println(produk.stokTersedia() ? "Produk Tersedia" : "Produk Tidak Tersedia");
    }
}

class Produk {
    String id, nama;
    int stok;
    double harga;

    // constructor
    public Produk(String id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    // method
    public void cekData() {
        System.out.println("ID Produk: "+ this.id);
        System.out.println("Nama Produk: "+ this.nama);
        System.out.println("Stok: "+ this.stok);
        System.out.println("Harga: "+ this.harga);
    }

    public boolean stokTersedia() {
        if (this.stok > 0) {
            return true;
        }
        return false;
    }
}