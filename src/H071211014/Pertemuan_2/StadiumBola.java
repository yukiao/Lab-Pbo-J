
public class StadiumBola { 
    String namaStadium;
    int jumlahKursi;
    int luasLapangan;
    String lokasi;
    
    void deskripsi(){
        System.out.println(namaStadium);
        System.out.println("berlokasi di "+ lokasi);
        System.out.println("dengan jumlah kursi "+ jumlahKursi);
        System.out.println("dan memiliki luas lapangan sebesar "+ luasLapangan + "m");
    }
}
