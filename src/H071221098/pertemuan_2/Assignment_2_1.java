package H071221098.pertemuan_2;
class Makassar {
    String wisata  ; //atribut
    String makanan ;
    String musik ;

    void setWisata (String wisata) {
        this.wisata = wisata;
    }
    void setMakanan (String makanan) {
        this.makanan = makanan;
        
    }
    void setMusik (String musik) {
        this.musik = musik;

        
    }

    String getWisata () {   //method
        return wisata;
    }
    String getMakanan () {
        return makanan;
    }
    String getMusik () {
        return musik;
    }

}

public class Assignment_2_1 { 
    public static void main(String[] args) { //main nya
        Makassar ip = new Makassar ();
        ip.setWisata("Pantai Losari");
        ip.setMakanan("Coto Makassar") ;
        ip.setMusik("Gandrang Bulo");

        System.out.println("Tempat Wisata: " + ip.getWisata());
        System.out.println("Makanan Khas: " + ip.getMakanan());
        System.out.println("Alat Musik Tradisional: " + ip.getMusik());
     
    }
}