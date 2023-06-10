package H071221078.Pertemuan_6;

public class Assignment_6_1 {
    public static void main(String[] args) {
        Pitbull pit = new Pitbull();
        Car mobil = new Car(10, "Hitam", 300);
        Smartphone samsung = new Smartphone(2000000, "Samsung");
        pit.describe();
        pit.move();
        mobil.move();
        samsung.move();
    }
}

interface Moveable {
    void move();
}

abstract class Dog implements Moveable{
    private int position;
    private int averageLength;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLength() {
        return averageLength;
    }

    public void setAverageLength(int averageLength) {
        this.averageLength = averageLength;
    }

    abstract void describe();
}

class Pitbull extends Dog {
    
    @Override
    protected void describe() {
        System.out.println("============Ciri-Ciri Pitbull============");
        System.out.println("Pitbull berpenampilan atletis dan berotot, kepala berbentuk persegi, hidung berdaging persegi, dan mata besar berbentuk almond.");
    }
    
    @Override
    public void move() {
        setPosition(getPosition()+3);
        System.out.println("Anjing Pitbull bergerak ke titik " + getPosition());
    }
}

class SiberianHusky extends Dog {
    
    @Override
    public void describe() {
        System.out.println("============Ciri-Ciri Siberian Husky============");
        System.out.println("Siberian Husky Memiliki karakteristik sifat yang lembut dan siaga, bersahabat, jinak, pandai, serta ramah");
        System.out.println("Warna bulunya agouti, coklat kemerahan, abu-abu, hitam, belang-belang dan putih. Siberian Husky ini dapat hidup selama 12 tahun sampai 15 tahun.");
    }
    
    @Override
    public void move() {
        setPosition(getPosition()+2);
        System.out.println("Anjing Siberian Husky bergerak ke titik " + getPosition());
    }
}

class Bulldog extends Dog {
    
    @Override
    public void describe() {
        System.out.println("============Ciri-Ciri Bulldog============");
        System.out.println("Bulldog memiliki bentuk kepala cenderung melebar dan bahu yang cukup besar. Bulldog meiliki ciri khas lipatan kulit yang berada di sekitar mata.");
        System.out.println("Moncongnya berukuran pendek dan terdapat lipatan dari beberapa bagian di sekitar hidung. Anjing Bulldog memiliki gigi yang cukup runcing untuk usia dewasa.");
    }
    
    @Override
    public void move() {
        setPosition(getPosition()+1);
        System.out.println("Anjing Bulldog bergerak ke titik " + getPosition());
    }
}

class GermanShepherd extends Dog {
    
    @Override
    public void describe() {
        System.out.println("============Ciri-Ciri German Shepherd============");
        System.out.println("German Shepherd memiliki struktur tubuh yang agak memanjang, proporsional, berotot dan memiliki struktur tulang yang solid.");
        System.out.println("Hidung umumnya berwarna hitam kadang ada juga berwarna biru atau merah hati. Mata berwarna gelap dan berbentuk almond.");
    }
    
    @Override
    public void move() {
        setPosition(getPosition()+3);
        System.out.println("Anjing German Shepherd bergerak ke titik " + getPosition());
    }
}

class Smartphone implements Moveable {
    public int price;
    public String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphoone berpindah");
    }
}

class Car implements Moveable {
    public int totalForwardGear;
    public String color;
    public int maxSpeed;
    
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