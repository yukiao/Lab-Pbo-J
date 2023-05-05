package H071221041.Pertemuan_6;

public class Assignment_6_2 {
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky(10, 30);
        int beforeMove = siberianHusky.position;
        System.out.println("-".repeat(85));
        System.out.println("Siberian Husky Before move: " + beforeMove);
        siberianHusky.move();
        siberianHusky.describe();
        System.out.println("=".repeat(85));

        Smartphone smartphone = new Smartphone(5000000, "oppo");
        System.out.println(" ".repeat(7) + "Smartphone");
        System.out.println("-".repeat(25));
        smartphone.move();
        System.out.println("Harga: " + smartphone.price);
        System.out.println("Brand: " + smartphone.brand);
        System.out.println("=".repeat(25));

        Car car = new Car(4, "Silver", 120);
        System.out.println(" ".repeat(10) + "Mobil");
        System.out.println("-".repeat(25));
        car.move();
        System.out.println("Total forward gear: " + car.totalForwardGear);
        System.out.println("Warna mobil: " + car.color);
        System.out.println("Kecepatan Maksimal: " + car.maxSpeed);
        System.out.println("=".repeat(25));
    }
}
