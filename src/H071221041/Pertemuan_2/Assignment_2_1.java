package H071221041.Pertemuan_2;

class Assignment_2_1 {

    // Atribut
    String nama;
    double jarak;
    double diameter;
    int kecepatanRotasi;

    //construktor
    public Assignment_2_1(String Name, double Jarak, double Diameter, int KecepatanRotasi) {
        nama = Name;
        jarak = Jarak;
        diameter = Diameter;
        kecepatanRotasi = KecepatanRotasi;
    }
    //behavior
    public void detailIngfo() {
        System.out.println("Nama planet: " + nama);
        System.out.println("Jarak dari matahari: "+ jarak + " juta km");
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Kecepatan Rotasi: " + kecepatanRotasi);
    }
    // method getter dan setter utk atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        nama = Nama;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double Jarak) {
        jarak = Jarak;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double Diameter) {
        diameter = Diameter;
    }

    public int getKecepatanRotasi() {
        return kecepatanRotasi;
    }

    public void setKecepatanRotasi(int KecepatanRotasi) {
        kecepatanRotasi = KecepatanRotasi;
    }

    public static void main(String[] args) {
        //buat method utk tambah nilai di atribut
        Assignment_2_1 jupiter = new Assignment_2_1("Jupiter", 56.8, 43557, 755);

        //panggil method detailIngfo
        jupiter.detailIngfo();
    }
}
