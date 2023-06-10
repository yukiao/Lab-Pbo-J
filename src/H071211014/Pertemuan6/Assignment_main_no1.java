public class Assignment_main_no1 {
    public static void main(String[] args) {
        Smartphone android = new Smartphone(1000000, "Samsung");
        android.move();
        Car ferarri = new Car(6, "blue", 250);
        ferarri.move();
        Bulldog bulldog = new Bulldog(1, 100);
        bulldog.move();
        bulldog.describe();
    }
}
