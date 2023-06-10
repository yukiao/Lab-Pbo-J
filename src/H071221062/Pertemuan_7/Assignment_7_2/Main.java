package assignment_07_02;

public class Main {
    public static void main(String[] args) {
        Product<Integer> p1 = new Product<>("Kinder Joy", 10000, "2023-05-01");
        Product<String> p2 = new Product<>("Sari Roti", "Rp 15.000", "2023-05-20");
        Product<Double> p3 = new Product<>("Susu Kurma", 7.5 , "2023-06-01");

        System.out.printf("Product 1: %s - %s - %s",p1.getProduk(),p1.getHarga(),p1.getTanggalKadaluarsa());
        System.out.printf("\nProduct 2: %s - %s - %s",p2.getProduk(),p2.getHarga(),p2.getTanggalKadaluarsa());
        System.out.printf("\nProduct 3: %s - %s - %s",p3.getProduk(),p3.getHarga(),p3.getTanggalKadaluarsa());
    }
}
