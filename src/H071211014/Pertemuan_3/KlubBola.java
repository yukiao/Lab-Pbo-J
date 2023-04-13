public class KlubBola {
    String nama;
    String kota; 
    Stadium stadium;

    public KlubBola(String nama, String kota, Stadium stadium){
        this.nama = nama; 
        this.kota = kota;
        this.stadium = stadium;
    }

    public KlubBola(String nama, String kota){
        this.nama = nama; 
        this.kota = kota;
        this.stadium = new Stadium("Miskin ndk punya stadium", "tidak berlokasi", 0, 0);
    }

    public void tanding(KlubBola lawan){
        System.out.printf("%s vs %s\n", this.nama, lawan.nama);
    }

    public void juara(String kompetisi){
        System.out.println(this.nama + " menjuarai kompetisi " + kompetisi);
    }
}
