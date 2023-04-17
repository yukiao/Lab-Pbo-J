package H071221090.Pertemuan_4;

class Car{
    //2.atribut
    String brand;
    String model;
    int year;
    double price;
    boolean isSold;

    public Car() {}
    
    public Car(String brand, String model, int year, double price, boolean isSold) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isSold = isSold;
    }
    //buat setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getIsSold() {
        return isSold;
    }

    public void setIsSold(boolean isSold) {
        this.isSold = isSold;
    }
    //behavior
    public void displayInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Is sold:" + isSold);
    } 
}
//method
class Main {
    public static void main(String[] args) {
        Car car = new Car(); //instance car yg constructronya kosong
        car.setBrand("Toyota");
        car.setModel("Raize");
        car.setYear(2021);
        car.setPrice(2800.000);
        car.setIsSold(false);

       car.displayInfo(); //7.pnggil metod displayInfo

       //8.buat instace car ke2
       Car car2 = new Car("Honda", "Civic", 2022, 600.000, true);

       //9.tampilkan info atribut dgn method getter
       System.out.println("Brand: " + car2.getBrand());
       System.out.println("Model: " + car2.getModel());
       System.out.println("Year: " + car2.getYear());
       System.out.println("Price: " + car2.getPrice());
       System.out.println("Is sold: " + car2.getIsSold());

       //10.buat kls selfUtils
class SelfUtils{
    public static void displaySelfData() {
        System.out.println("Nama: Nabilah Azzahrani S");
        System.out.println("NIM: H071221090");
        
    }
}

        //pnggil mtehodidsplaySelfData() dri kls SelfUtils
        SelfUtils.displaySelfData();
    }
}

