package H071221038.Pertemuan_2;
// NO.3
// Mendefinisikan class Produk
class Produk {
    // Atribut
    int id;
    String nama;
    int stok;
    int harga;

    // Method setter dan getter untuk mengatur dan mengambil
    public void setId(int id) {
        this.id = id;
    }
    // tambah public 
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getId() {
        return id;
    }
    public String getNama() {
        return nama;
    }
    
    //ganti jadi boolean
    public boolean getStok() {
        if (stok > 0){
            return true;
        } 
            return false;
    }

    public int getHarga() {
        return harga;
    }
}
// class untuk memanggil object
public class Assignment_2_3{
    // tempat untuk mengeksekusi program
    public static void main(String[] args) {
        // pemanggilan objek
        Produk produk = new Produk();
        produk.id = 1234;
        produk.nama = "Coca-cola";
        produk.stok = 0;
        produk.harga = 10000;
        // memprint objek
        System.out.println("Id : " + produk.getId()); 
        System.out.println("Nama : " + produk.getNama());
        System.out.println("Stok : " + (produk.getStok() ? "Stok masih ada" : "stok kosong"));
        System.out.println("Harga : "+ produk.getHarga());
    }
}
