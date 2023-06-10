package H071221038.Pertemuan_7;

public class Assignment_7_2<T> {
    
    private String name;
    private T price;
    private String expiryDate;

    public Assignment_7_2(String name, T price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }
    public T getPrice() {
        return price;
    }
    public String getExpiryDate() {
        return expiryDate;
    }

    public static void main(String[] args){
        Assignment_7_2<Integer> produk1 = new Assignment_7_2<>("Kinder Joy", 10000, "2023-05-01");
        String name1 = produk1.getName();
        int price1 = produk1.getPrice();
        String expiryDate1 = produk1.getExpiryDate();
        System.out.println("Product 1 : " + name1 + " - " + price1 + " - " + expiryDate1);

        Assignment_7_2<String> produk2 = new Assignment_7_2<>("Sari Roti", "Rp 15.000", "2023-05-20");
        String name2 = produk2.getName();
        String price2 = produk2.getPrice();
        String expiryDate2 = produk2.getExpiryDate();
        System.out.println("Product 2 : " + name2 + " - " + price2 + " - " + expiryDate2);

        Assignment_7_2<Double> produk3 = new Assignment_7_2<>("Susu Kurma", 7.5, "2023-06-01");
        String name3 = produk3.getName();
        double price3 = produk3.getPrice();
        String expiryDate3 = produk3.getExpiryDate();
        System.out.println("Product 3 : " + name3 + " - " + price3 + " - " + expiryDate3);
    }
}