package H071221009.Pertemuan_7;

class Product<T> {
    private String name;
    private T price;
    private String expiryDate;

    public Product(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }
    
    public String getName() {
        return name;
    }

    public T getPrice() {
        return this.price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}

public class Assignment_7_2 {
    public static void main(String[] args) {
        Product<Integer> product1 = new Product<>("Kinder Joy", 10000, "2023-05-01");
        String name1 = product1.getName();
        int price1 = product1.getPrice();
        String expiryDate1 = product1.getExpiryDate();
        System.out.println("Product 1: " + name1 + " - " + price1 + " - " + expiryDate1);

        Product<String> product2 = new Product<>("Sari Roti", "Rp 15.000", "2023-05-20");
        String name2 = product2.getName();
        String price2 = product2.getPrice();
        String expiryDate2 = product2.getExpiryDate();
        System.out.println("Product 2: " + name2 + " - " + price2 + " - " + expiryDate2);

        Product<Double> product3 = new Product<>("Susu Kurma", 7.5, "2023-06-01");
        String name3 = product3.getName();
        double price3 = product3.getPrice();
        String expiryDate3 = product3.getExpiryDate();
        System.out.println("Product 3: " + name3 + " - " + price3 + " - " + expiryDate3);
    }
}