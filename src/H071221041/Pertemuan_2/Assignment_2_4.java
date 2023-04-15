package H071221041.Pertemuan_2;

class Cuboid {
    //atribut
    double height;
    double width;
    double length;

    //method utk mndapatkan jumlah volume
    double getVolume() {
        return height*width*length;
    }
}
public class Assignment_2_4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 30.0;
        cuboid.width = 15.0;
        cuboid.length = 10.0;
        System.out.printf("Volume = %.2f", cuboid.getVolume());

    }
}
