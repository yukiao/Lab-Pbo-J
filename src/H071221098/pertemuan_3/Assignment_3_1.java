package H071221098.pertemuan_3;
class Benelli{
    //atribut
    String Jenis;
    String Warna;
    int Harga;
    Person pemilik;
    // //public supaya dapat diakses dari class lain
    // public Benelli (){}


    //constructor

    public Benelli (String Jenis, String Warna, int Harga, Person pemilik){
        this.Jenis = Jenis;
        this.Warna = Warna;
        this.Harga = Harga;
        this.pemilik = pemilik;
    }

    public Benelli (String Jenis, String Warna, Person pemilik){
        this.Jenis = Jenis;
        this.Warna = Warna;
        this.Harga =0;
        this.pemilik= pemilik;
    }

//get set method
String getJenisString(){
    return Jenis;
}

int getharga(){
    return Harga;
}

String getwarna(){
    return Warna;
}

public void setharga(int Harga ){
    this.Harga = Harga ;
}


    //behavior
public void tampilkanDetail(){
    System.out.println("Jenis produk   : " + Jenis );
    System.out.println("Warna produk        : " + Warna);
    System.out.println("Harga produk : " + Harga);
    System.out.println("Nama pemilik: " + pemilik.nama);
}


   public void harga () {
    if (this.Harga >= 32500000) {
        System.out.println(" Benelli Patagonian Eagle"); 
    } else if (this.Harga < 325000000) {
        System.out.println("Benelli 152 ");
    } else {
        System.out.println("Benelli Evo 200");
    }
    
}}


public class Assignment_3_1 {
    public static void main(String[] args) {
        Person person = new Person ("Fauzan", "Laki-Laki", 19);
        Benelli Benelli = new Benelli("Patagonian eagle", "Hitam", 49000000, person);
        Benelli.tampilkanDetail();
        Benelli.harga();
    }
}

