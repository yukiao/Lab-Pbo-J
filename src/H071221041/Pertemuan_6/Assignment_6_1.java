package H071221041.Pertemuan_6;

interface Moveable {
    void move();
}

class Smartphone implements Moveable {
    int price;
    String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Moveable {
    int totalForwardGear;
    String color;
    int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

abstract class Assignment_6_1 implements Moveable {
    protected int position;
    protected int averageLenght;

    public Assignment_6_1(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }

    abstract void describe();
}

class Pitbul extends Assignment_6_1 {

    public Pitbul(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("Pitbul adalah Anjing yang keras kepala.");
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbul After move: " + this.position);
    }
}

class SiberianHusky extends Assignment_6_1 {

    public SiberianHusky(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("Siberian Husky anjing yang lembut dan siaga, bersahabat, jinak, pandai dan ramah.");
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky After move: " + this.position);
    }
}

class Bulldog extends Assignment_6_1 {
    public Bulldog(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("Bulldog ini memiliki ciri khas lipatan kulit yang berada di sekitar mata.");
    }

    @Override
    public void move() {
        // this.position += 1;
        System.out.println("Bulldog After move: " + this.position);
    }
}

class GermanShepherd extends Assignment_6_1 {

    public GermanShepherd(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    void describe() {
        System.out.println("German Shepherd anjing pandai, setia, berani, dan unggul dalam mental serta fisik.");
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("German Shepherd After move: " + this.position);
    }
}
