package H071221098.pertemuan_7;

public class Main {
    public static void main(String[] args) {
        Product<String> product1 = new Product<>("Kinder Joy", "Seribu", "2023-0501");
        Product<Integer> product2 = new Product<>("Sari Roti", 15000, " 2023-05-20");
        Product<Double> product3 = new Product<>("Susu Kurma ", 7.5, " 2023-06-01");

        System.out.println("Product 1: "+product1.getName() +" - "+ product1.getPrice()+" - "+ product1.getExpiryDate());
        System.out.println("Product 2: "+product2.getName()+" - "+product2.getPrice()+" - "+product2.getExpiryDate());
        System.out.println("Product 3: "+product3.getName()+" - "+product3.getPrice()+" - "+product3.getExpiryDate());
    }
}
