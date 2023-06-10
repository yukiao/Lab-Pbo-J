package assignment_07_02;

public class Product<TipeUang> {
    private String produk;
    private TipeUang harga;
    private String tanggalKadaluarsa;

    public Product(String produk, TipeUang harga, String tanggalKadaluarsa) {
        this.produk = produk;
        this.harga = harga;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getProduk() {
        return produk;
    }

    public TipeUang getHarga() {
        return harga;
    }

    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
}
