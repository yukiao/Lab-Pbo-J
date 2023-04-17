package H071221098.pertemuan_2;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){ //untuk menghitung dan mengembalikan nilai volume dari cuuboid.
        return height*width*length;
    }
}

public class Assignment_2_4{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 12;
        cuboid.width = 25;
        cuboid.length = 15; 
        System.out.printf("Volume: %.2f", cuboid.getVolume());
    }
}