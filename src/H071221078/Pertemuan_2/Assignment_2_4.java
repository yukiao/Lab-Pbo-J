package H071221078.Pertemuan_2;

class Cuboid {
    double height;
    double width;
    double length;

    // method hitung volume kubus/balok
    double getVolume() {
        double volume = height * width * length;
        return volume;
    }
}

public class Assignment_2_4 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();   // instance objek baru
        
        // mengisi nilai atribut untuk objek yang dibuat
        cuboid.height = 10;
        cuboid.width = 15;
        cuboid.length = 20;
        System.out.printf("Volume : %.2f", cuboid.getVolume()); // cetak method hitung volume
    }
}