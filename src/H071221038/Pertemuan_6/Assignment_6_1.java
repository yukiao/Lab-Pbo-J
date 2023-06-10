package H071221038.Pertemuan_6;

interface Moveable {
    void move();
}

abstract class Assignment_6_1 implements Moveable{
    protected int position;
    protected int averageLength;

    abstract void describe();

    public Assignment_6_1(int position, int averageLenght) {
    }
}

class Pitbull extends Assignment_6_1 {

    public Pitbull(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        this.position += 3 ;
        System.out.println("Position: " + this.position);
    }
    
    @Override
    void describe() {
        System.out.println("PitBull adalah nama umum untuk jenis anjing yang diturunkan dari bulldog dan terrier. Jenis pitbull sangat ambigu karena mencakup berbagai keturunan, jenis informal dan penampilan yang tidak dapat diidentifikasi secara andal.");
    }
    
}
class SiberianHusky extends Assignment_6_1 {

    public SiberianHusky(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        this.position += 2 ;
        System.out.println("Position: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Husky Siberia termasuk dalam jenis anjing ras berukuran sedang dan berbulu tebal. Anjing ras ini termasuk jinak dan ramah kepada siapapun. Husky siberia sekilas mirip serigala, yang mungkin terjadi karena hasil persilangan alam.");
    }
    
}
class Bulldog extends Assignment_6_1 {

    public Bulldog(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        this.position += 1 ;
        System.out.println("Position: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Bulldog adalah salah satu anjing ras tertua di dunia yang berasal dari Inggris, maka sering dikenal sebagai English Bulldog. Mula-mula anjing ini dipelihara sebagai anjing adu/petarung dengan sapi liar/banteng, sehingga Bulldog merupakan anjing yang agresif dan tangguh.");
    }
    
}

class GermanShepherd extends Assignment_6_1 {

    public GermanShepherd(int position, int averageLenght) {
        super(position, averageLenght);
    }

    @Override
    public void move() {
        this.position += 3 ;
        System.out.println("Position: " + this.position);
    }

    @Override
    void describe() {
        System.out.println("Anjing Gembala Jerman adalah salah satu ras murni anjing yang populer. Ukurannya besar, dikenal cerdas namun penurut. Anjing ini relatif tidak memiliki variasi warna, yaitu coklat dengan variasi hitam. Dahulu, anjing Gembala Jerman sering digunakan untuk menggembalakan domba.");
    }
    
}

class Smartphone implements Moveable {
    public int price;
    public String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
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
    
    public int getTotalForwardGear() {
        return totalForwardGear;
    }
    
    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}