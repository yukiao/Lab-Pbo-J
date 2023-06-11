package H071221090.Pertemuan_6;

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

//Abstract class untuk Dog
abstract class Dog implements Moveable {
    //atrribut
    protected int position;
    protected int averageLength;

    //constrcuctor
    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    //method
    abstract void describe();
}

class Pitbull extends Dog {
    public Pitbull(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Pitbull memiliki tubuh yang berotot dan gagah.");
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Pitbull After move: " + this.position);
    }
    
}

class SiberianHusky extends Dog {
    public SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Ras Siberian Husky adalah ras anjing yang lincah dan tahan dingin.");
    }

    @Override
    public void move() {
        this.position += 2;
        System.out.println("Siberian Husky After Move: " + this.position);
    }
}

class Bulldog extends Dog {
    public Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Bulldog memiliki tubuh lebar, besar, moncong pesek, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipat.");
    }

    @Override
    public void move() {
        this.position += 1;
        System.out.println("Bulldog After move: " + this.position);
    }
}

class GermanShepherd extends Dog {
    public GermanShepherd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Ras German Shepherd adalah ras anjing yang cerdas dan lincah.");
    }

    @Override
    public void move() {
        this.position += 3;
        System.out.println("Germa Shepherd After move: " + this.position);
    }
}



// Class Main
public class Assignment_6_1 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(235000000 , "Iphone 14 Pro Max");
        smartphone.move();
        System.out.println("Harga: " + smartphone.price);
        System.out.println("Brand: " + smartphone.brand);
        System.out.println("=".repeat(85));

        Car car = new Car(6, "White", 250);
        car.move();
        System.out.println("Total forward gear: " + car.totalForwardGear);
        System.out.println("Warna mobil: " + car.color);
        System.out.println("Kecepatan Maksimal: " + car.maxSpeed);
        System.out.println("=".repeat(85));

        Dog siberianHusky = new SiberianHusky(30, 60);
        int beforeMove = siberianHusky.position;
        System.out.println("Siberian Husky before move: " + beforeMove);
        siberianHusky.move();
        siberianHusky.describe();
        // System.out.println("Posisi SiberianHusky : " + siberianHusky.position);
    }
}

