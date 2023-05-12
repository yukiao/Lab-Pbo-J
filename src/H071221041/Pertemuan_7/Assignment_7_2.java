package H071221041.Pertemuan_7;

class Product<T> {
    private String nameProduct;
    private T price;
    private String expiryDate;

    public Product(String nameProduct, T price, String expiryDate) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public T getPrice() {
        return price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}

public class Assignment_7_2 {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Kinder Joy", 10000, "2023-05-01");
        Product<String> product2 = new Product<>("Sari Roti", "Rp.15.000", "2023-05-20");
        Product<Double> product3 = new Product<>("Susu Kurma", 7.5, "2023-06-01");

        System.out.println("Product 1: " + product1.getNameProduct() + " - " + product1.getPrice() + " - "
                + product1.getExpiryDate());
        System.out.println("Product 2: " + product2.getNameProduct() + " - " + product2.getPrice() + " - "
                + product2.getExpiryDate());
        System.out.println("Product 3: " + product3.getNameProduct() + " - " + product3.getPrice() + " - "
                + product3.getExpiryDate());
    }
}