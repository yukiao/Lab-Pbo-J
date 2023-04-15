package H071221038.Pertemuan_3;
class Laptop {
    String merk;
    int harga;
    Spesifikasi spesifikasi;

    // Konstruktor tanpa parameter
    public Laptop() {
        merk = "";
        harga = 0;
        spesifikasi = new Spesifikasi();
    }

    // Konstruktor dengan parameter
    public Laptop(String merk, int harga, Spesifikasi spesifikasi) {
        this.merk = merk;
        this.harga = harga;
        this.spesifikasi = spesifikasi;
    }

    // Getter dan setter pada setiap atribut
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void setSpesifikasi(Spesifikasi spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public String getMerk() {
        return merk;
    }

    public int getHarga() {
        return harga;
    }

    public Spesifikasi getSpesifikasi() {
        return spesifikasi;
    }

    // Behaviour
    public void nyalakan() {
        System.out.printf("Laptop " + merk + " dinyalakan.\n");
    }

    public void tampilkanSpesifikasi() {
        System.out.println("Spesifikasi laptop " + merk + ":");
        System.out.println("- Processor: " + spesifikasi.getProcessor());
        System.out.println("- RAM: " + spesifikasi.getRam() + " GB");
    }
}

class Spesifikasi {
    String processor;
    int ram;

    // Konstruktor tanpa parameter
    public Spesifikasi() {
        processor = "";
        ram = 0;
    }

    // Konstruktor dengan parameter
    public Spesifikasi(String processor, int ram) {
        this.processor = processor;
        this.ram = ram;
    }

    // Getter dan setter pada setiap atribut
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }
}

public class Assignment_3_1 {
    public static void main(String[] args) {
        // Membuat objek spesifikasi1
        Spesifikasi spesifikasi1 = new Spesifikasi("Intel Core i5", 8);
        
        // Membuat objek laptop dengan konstruktor tanpa parameter
        Laptop laptop1 = new Laptop();
        laptop1.setMerk("Lenovo");
        laptop1.setHarga(8000000);
        laptop1.setSpesifikasi(spesifikasi1);
        
        // Membuat objek spesifikasi2
        Spesifikasi spesifikasi2 = new Spesifikasi("AMD Ryzen 5", 16);

        // Membuat objek laptop dengan konstruktor dengan parameter
        Laptop laptop2 = new Laptop("Asus", 12000000, spesifikasi2);

        // Memprint objek
        System.out.println("Laptop "+ laptop1.getMerk());
        System.out.println("Harga: " + laptop1.getHarga());
        laptop1.tampilkanSpesifikasi();
        laptop1.nyalakan();
        System.out.println();

        System.out.println("Laptop "+ laptop2.getMerk());
        System.out.println("Harga: " + laptop2.getHarga());
        laptop2.tampilkanSpesifikasi();
        laptop2.nyalakan();
    }
}
