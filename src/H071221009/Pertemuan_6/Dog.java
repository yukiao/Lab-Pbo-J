package H071221009.Pertemuan_6;

abstract class Dog implements Move {
    protected int position;
    protected int averageLength;

    public Dog(int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void describe();
}

interface Move {
    void move();
}

class Pitbull extends Dog {

    public Pitbull(int position, int averageLength) {
        super(position+3, averageLength);
    }

    @Override
    void describe() {
        System.out.println("Pitbull adalah istilah yang merujuk pada berbagai jenis anjing berbeda dengan tampilan fisik yang mirip, anjing pitbull terkenal galak, agresif, berbahaya, dan berpotensi menyerang manusia. Anjing pitbull memiliki otot rahang yang kuat, bahkan disebut dapat mengunci gigitan pada lawannya. Gaya bertarungnya yang meraup dan menggoyangkan kepala dapat menimbulkan cedera dan luka parah pada korban.");
        
    }

    @Override
    public void move() {
       System.out.println("Anjing Pitbull bergeser ke arah kanan sebanyak " + position + " langkah!");
        
    }
}

class SiberianHusky extends Dog {

    public SiberianHusky(int position, int averageLength) {
        super(position+2, averageLength);
        
    }

    @Override
    void describe() {
        System.out.println("Anjing Siberian Husky merupakan anjing yang cukup populer dikalangan pecinta hewan domestik. Anjing ini sangat memikat dengan bulu tebal indah dalam varian warna, wajah mencolok, serta mata biru yang tajam. Walaupun terkesan seram dan tegas lantaran perawakannya yang mirip serigala, nyatanya anjing yang berasal dari Sriberia, Rusia ini memiliki sifat ramah terhadap manusia maupun anjing lainnya, Siberian Husky umumnya setia dan penurut dengan majikan.");
        
    }

    @Override
    public void move() {
        System.out.println("Anjing Siberian Husky bergeser ke arah kanan sebanyak " + position + " langkah!");
        
    }
}

class Bulldog extends Dog {

    public Bulldog(int position, int averageLength) {
        super(position+1, averageLength);
        
    }

    @Override
    void describe() {
        System.out.println("Bulldog merupakan ras anjing yang memiliki penampilan khas seperti wajah yang ganas, wajah datar dan berkerut, moncong pendek, tubuh gempal, dan kaki pendek. Bulldog memiliki kepribadian yang tenang, ramah, serta bersahabat.");
        
    }

    @Override
    public void move() {
        System.out.println("Anjing Bulldog bergeser ke arah kanan sebanyak " + position + " langkah!");
        
    }

}

class GermanShepherd extends Dog {

    public GermanShepherd(int position, int averageLength) {
        super(position+3, averageLength);
        
    }

    @Override
    void describe() {
        System.out.println("German Shepherd merupakan salah satu ras anjing yang populer dan banyak di pelihara oleh pecinta anjing. Ras anjing ini kerap disebut dan dikenal sebagai anjing helder, tak heran jika German Shepherd banyak dipelihara sebagai anjing penjaga rumah dan anjing pelacak. Meski tampak buas dan menyeramkan, German Shepherd sebenarnya anjing yang setia, mudah dilatih, cerdas, dan bersahabat.");
        
    }

    @Override
    public void move() {
        System.out.println("Anjing German Shepherd bergeser ke arah kanan sebanyak " + position + " langkah!");
        
    }

}

class Smartphone implements Move {
    protected int price;
    protected String brand;

    public Smartphone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah!");
        
    }
}

class Car implements Move {
    protected int totalForwardGear;
    protected String color;
    protected int maxSpeed;

    public Car(int totalForwardGear, String color, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {

        System.out.println("Mobil sedang berakselerasi!");
        
    }
    
}