public class Car implements Move{
    int totalFowardGear;
    String color;
    int maxSpeed;
    
    public Car(int totalFowardGear, String color, int maxSpeed) {
        this.totalFowardGear = totalFowardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}
