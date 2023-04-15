package H071221009.Pertemuan_2;

class Cuboid {
    // attribute
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length; // rumus menghitung volume kubus/ lengkapi
    }
}
public class Assignment_2_4 {
    public static void main(String[] args) {
        Cuboid cuboid  = new Cuboid(); // membuat objek
        cuboid.height = 30.0; 
        cuboid.width = 15.0; // lengkapi
        cuboid.length = 10.0;          
        System.out.printf("Volume = %.2f", cuboid.getVolume());
        }
        
    }
