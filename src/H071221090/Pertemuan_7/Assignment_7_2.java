// SOAL NO 2
package H071221090.Pertemuan_7;


import java.time.LocalDate;

public class Assignment_7_2<T> {
    private String name;
    private T price;
    private LocalDate tanggalKadaluarsa;

    Assignment_7_2(String name, T price, LocalDate tanggalKadaluarsa) {
        this.name = name;
        this.price = price;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    public String getName() {
        return name;
    }

    public T getPrice() {
        return price;
    }

    public LocalDate getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public static void main(String[] args) {
        Assignment_7_2<Integer> product1 = new Assignment_7_2<>("Soyjoy", 10000, LocalDate.of(2023, 5, 7));
        Assignment_7_2<String> product2 = new Assignment_7_2<>("Sponge", "11000", LocalDate.of(2024, 12, 20));
        Assignment_7_2<Double> product3 = new Assignment_7_2<>("Nescafe", 15.7, LocalDate.of(2025, 4, 11));

        System.out.println("Product 1: " + product1.getName() + " - " + product1.getPrice() + " - " + product1.getTanggalKadaluarsa());
        System.out.println("Product 2: " + product2.getName() + " - " + product2.getPrice() + " - " + product2.getTanggalKadaluarsa());
        System.out.println("Product 3: " + product3.getName() + " - " + product3.getPrice() + " - " + product3.getTanggalKadaluarsa());
    }
}
