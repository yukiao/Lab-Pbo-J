package H071221062.Pertemuan_2;

class Cuboid { //TUGAS 2 NO2
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }

}

public class Assignment_2_6 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.width = 15;
        cuboid.length = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }

}