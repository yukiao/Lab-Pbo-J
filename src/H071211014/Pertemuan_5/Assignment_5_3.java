package H071211014.Pertemuan_5;

public class Assignment_5_3 {
    public static void main(String[] args) {
        Ikan ikan = new Ikan("Ikan Cupang", "Merah", "Pelet");
        Kucing kucing = new Kucing("Kucing Persia", "Putih", "Ikan");
        Burung burung = new Burung("Burung Merpati", "Abu-abu", "Biji-bijian");
        
        ikan.displayInfo();
        System.out.println();
        kucing.displayInfo();
        System.out.println();
        burung.displayInfo();
    }
    
}
