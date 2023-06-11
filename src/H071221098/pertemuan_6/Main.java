package H071221098.pertemuan_6;

public class Main{
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull();
        System.out.println("========== ANJING ==========");
        pitbull.move();
        pitbull.describe();
        System.out.println("\n========== SMARTPHONE ==========");
        Smartphone smartphone = new Smartphone(100000,"VIVO");
        smartphone.move();
        System.out.println("\n========= CAR ==========");
        Car car = new Car(100,"VIOLET",100000);
        car.move();
   }
}
