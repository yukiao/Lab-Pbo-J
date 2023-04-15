package H071221038.Pertemuan_2;
// NO.4
// Mendefinisikan class cuboid
class Cuboid {
    // Atribut
    double height;
    double width;
    double length;
    double getVolume() {
        return height*width*length;
    }

}

// class untuk memanggil object cuboid
public class Assignment_2_4 {
    // tempat untuk mengeksekusi program
    public static void main(String[] args) {
        // pemanggilan objek
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10;
        cuboid.width = 15;
        cuboid.length = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
    
}