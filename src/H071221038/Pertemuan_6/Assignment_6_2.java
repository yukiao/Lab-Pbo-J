package H071221038.Pertemuan_6;

public class Assignment_6_2 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(6000000, "Xiaomi Note 11 Pro");
        smartphone.move();

        Car car = new Car(5, "Merah", 150);
        car.move();

        Pitbull pitbull = new Pitbull(0, 0);
        pitbull.describe();
        pitbull.move();
    }
}
