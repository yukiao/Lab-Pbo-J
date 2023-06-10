public class Assignment_no2 {
    public static void main(String[] args) {
        Product<Integer>product1 = new Product<Integer>("Indomie", "2024-01-01", 5000);
        Product<Double>product2 = new Product<Double>("Ultra Milk", "2024-06-24", 6000.00);
        Product<String>product3 = new Product<String>("Teh Kotak", "2024-12-31", "5000");

        printProduct(product1);
        printProduct(product2);
        printProduct(product3);

    }
    private static void printProduct(Product product){
        System.out.println(product.getName() + " - " + product.getExpiryDate() + " - " + product.getPrice());
    }
}

