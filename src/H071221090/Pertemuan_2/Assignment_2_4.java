package H071221090.Pertemuan_2;

class Cuboid {
    //atribut
    double height; 
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}

public class Assignment_2_4{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid(); //method
        cuboid.height = 15.0;
        cuboid.width = 15.0;
        cuboid.length = 20.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume()); //mencetak niai volume dri objek cuboid
    }
}