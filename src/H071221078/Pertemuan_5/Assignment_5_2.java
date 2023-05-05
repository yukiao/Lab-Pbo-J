package H071221078.Pertemuan_5;

public class Assignment_5_2 {
    public static void main(String[] args) {
        PengurusInti pengurusInti = new PengurusInti("Boboiboy", 12, "Pulau Rintis", 2022);
        KoordinatorBidang koordinatorBidang = new KoordinatorBidang("Upin", 12, "Kampung Durian Runtuh", "Pengembangan Anggota");
        Staff staff = new Staff("Ipin", 12, "Kampung Durian Runtuh", "Pengembangan Anggota");

        System.out.println("========== INFO ANGGOTA KOMUNITAS ==========");
        pengurusInti.infoPengurusInti();
        System.out.println("============================================");
        koordinatorBidang.infoKoordinatorBidang();
        System.out.println("============================================");
        staff.infoStaff();
    }
}

class Anggota {
    private String name;
    private int age;
    private String address;
    private String bidang;

    public Anggota(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    public Anggota(String name, int age, String address, String bidang) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.bidang = bidang;
    }
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getBidang() {
        return bidang;
    }

    public void biodataAnggota() {
        System.out.println("Nama            : " + name);
        System.out.println("Umur            : " + age);
        System.out.println("Alamat          : " + address);
    }
}

class PengurusInti extends Anggota {
    private int period;

    public PengurusInti(String name, int age, String address, int period) {
        super(name, age, address);
        this.period = period;
    }

    public void infoPengurusInti() {
        super.biodataAnggota();
        System.out.println("Pengurus inti di periode tahun " + period);
    }
}

class KoordinatorBidang extends Anggota {

    public KoordinatorBidang(String name, int age, String address, String bidang) {
        super(name, age, address, bidang);
    }

    public void infoKoordinatorBidang() {
        super.biodataAnggota();
        System.out.println("Koordinator bidang " + super.getBidang());
    }
}

class Staff extends Anggota {

    public Staff(String name, int age, String address, String bidang) {
        super(name, age, address, bidang);
    }

    public void infoStaff() {
        super.biodataAnggota();
        System.out.println("Bertugas sebagai staff di bidang " + super.getBidang());
    }
}