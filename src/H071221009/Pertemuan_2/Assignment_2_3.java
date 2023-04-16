package H071221009.Pertemuan_2;

public class Assignment_2_3 {
    String idProduk;
    String nama; // attribute
    int stok;
    int harga;

    public Assignment_2_3(String idProduk, String nama, int stok, int harga) { //constructor
        this.idProduk = idProduk;
        this.nama = nama; // perintah this dipakai untuk menghindari kesalahan akses antara attribute dan parameter yang memiliki nama yg sama
        this.stok = stok;
        this.harga = harga;
    }

    String getIdProduk() { // mengambil data pada idProduk
        return idProduk;
    }
    String getNamaProduk() {
        return nama;
    }
    int getStokProduk() {
        return stok;
    }
    int getHargaProduk() {
        return harga;
    }
    
    public boolean cekStok() { // utk melakukan perbandingan jika stok ada atau sdh habis
        return (stok > 0);
    }
    // behavior
    void tampilan() { // tdk dpt mengembalikan nilai 
        System.out.println("ID Produk          : " + idProduk);
        System.out.println("Nama Produk        : " + nama);
        System.out.println("Jumlah Stok Produk : " + stok);
        System.out.println("Harga Produk       : " + harga);

        boolean isExist = cekStok();
        if (isExist) { // kondisi perbandingan
            System.out.println("Produk masih tersedia yagesya");
        }
        else {
            System.out.println("Maaf guys produknya sudah soldout");
        }
    }
    public static void main (String[] args) { //prosedur yg menghasilkan nilai tetap/ method main
        // membuat objek
        Assignment_2_3 produk01 = new Assignment_2_3("Azr01", "Sunscreen Azarine", 10, 75000);
        produk01.tampilan(); // memanggil behavior tampilan
        System.out.println();
        Assignment_2_3 produk02 = new Assignment_2_3("Wrd101", "Sunscreen Wardah" , 0, 45000);
        produk02.tampilan(); 
    }
}



