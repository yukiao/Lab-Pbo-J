package H071221078.Pertemuan_7;

public class Assignment_7_2 {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<Integer>("Saltcheese", 1000, "02-02-2024");
        Product<String> product2 = new Product<String>("Better", "Rp. 2000", "22-04-2024");
        Product<Double> product3 = new Product<Double>("Roti Jordan", 1.55, "01-01-2023");

        System.out.printf("\nProduct 1: %s - %d - %s", product1.getProduk(), product1.getPrice(), product1.getExpiryDate());
        System.out.printf("\nProduct 2: %s - %s - %s", product2.getProduk(), product2.getPrice(), product2.getExpiryDate());
        System.out.printf("\nProduct 3: %s - %.2f - %s", product3.getProduk(), product3.getPrice(), product3.getExpiryDate());
    }
}

class Product<T> {
    private String produk;
    private T price;
    private String expiryDate;

    
    public Product(String produk, T price, String expiryDate) {
        this.produk = produk;
        this.price = price;
        this.expiryDate = expiryDate;
    }
    
    public String getProduk() {
        return produk;
    }

    public T getPrice() {
        return price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}