package H071221090.Pertemuan_2;


public class Assignment_2_1 {

    //Attribut
    String nama;
    int ukuran;
    int pengguna;


    //constructor
    public Assignment_2_1(String Name, int Ukuran, int Pengguna) {
        nama = Name;
        ukuran = Ukuran;
        pengguna = Pengguna;
    }

    //behavior
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Ukuran: " + ukuran + "mb");
        System.out.println("Pengguna: " + pengguna + "M");
    }

    //method
    public String getName() {
        return nama;
    }
    public void setName(String Name) {
        nama = Name;
    } 
    public int getUkuran() {
        return ukuran;
    }
    public void setUkuran(int Ukuran){
        ukuran = Ukuran;
    }
    public int getPengguna() {
        return pengguna;
    }
    public void setPengguna(int Pengguna) {
        pengguna = Pengguna;
    }
    public static void main(String[] args) {
        Assignment_2_1 WhatsApp = new Assignment_2_1 ("WhatsApp" , 250, 12);
        WhatsApp.tampilkanData();
        WhatsApp.nama = "aplikasi";
    }
}