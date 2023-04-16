package Pertemuan_2;

public class Assignment_2_3 {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.id = "H01";
        product1.nama ="Jersey";
        product1.stok = 7070;
        product1.harga = 70000;

        product1.productDescription();

        Product product2 = new Product();
        product2.id = "H03";
        product2.nama ="Sepatu";
        product2.stok = 0;
        product2.harga = 200000;

        product2.productDescription();
    }
}
