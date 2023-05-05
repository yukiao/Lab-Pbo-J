package H071221009.Pertemuan_6;

public class Assignment_6_2 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(4000000, "Samsung");
        smartphone.move();
        System.out.println("-".repeat(50));

        Car car = new Car(12, "red", 500);
        car.move();
        System.out.println("-".repeat(50));

        GermanShepherd germanshepherd = new GermanShepherd(5, 10);
        germanshepherd.move();
        germanshepherd.describe();
        System.out.println("-".repeat(50));
    }
}