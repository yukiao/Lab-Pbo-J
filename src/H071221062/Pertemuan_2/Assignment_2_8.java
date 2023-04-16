package H071221062.Pertemuan_2;

//NO.5
// Mendefinisikan class Alamat
public class Assignment_2_8 {
    // Atribut
    String jalan;
    String kota;

    // Method setter dan getter untuk mengatur dan mengambil
    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }

    public String getJalan() {
        return jalan;
    }

    public String getKota() {
        return kota;
    }
}
