package H071221062.Pertemuan_2;

class Produk { //TUGAS 2 NO 3

    // ATRIBUT
    int produk_id;
    String nama;
    boolean stok;
    int harga;

    // MENGGUNAKAN METHOD SET AND
    public int getProduk_id() {
        return produk_id;
    }

    public void setProduk_id(int produk_id) {
        this.produk_id = produk_id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStock() {
        if (stok) {
            return "Stok masih ada";
        } else {
            return "Stok Kosong";
        }
    }

    public void setStok(Boolean stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;

    }
}

public class Assignment_2_5 {
    public static void main(String[] args) {
        Produk produk = new Produk();
        produk.produk_id = 1234;
        produk.nama = "Fanta";
        produk.stok = true;
        produk.harga = 10000;

        System.out.println("Produk ID : " + produk.getProduk_id());
        System.out.println("Nama : " + produk.getNama());
        System.out.println("Stok : " + produk.getStock());
        System.out.println("Harga : " + produk.getHarga());
    }
}