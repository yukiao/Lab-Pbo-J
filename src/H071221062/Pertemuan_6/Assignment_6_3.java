public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Car car = new Car();
        Bulldog bulldog = new Bulldog();

        System.out.println("---SMARTPHONE---");
        smartphone.showDetails();
        smartphone.move();

        System.out.println("\n---MOBIL---");
        car.showDetails();
        car.move();

        System.out.println("\n---BULLDOG---");
        bulldog.describe();
        bulldog.move();

    }
}
