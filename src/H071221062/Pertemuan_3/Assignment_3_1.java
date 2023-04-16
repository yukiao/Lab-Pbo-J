package H071221062.Pertemuan_3;

public class Assignment_3_1 { //CLASS AC //TUGAS 3 NO 1
    // Attribute
    public String merk;
    public int watt;
    public int suhu;
    public Filter filter;

    // Constructor 1
    public Assignment_3_1(String merk, int watt) {
        this.merk = merk;
        this.watt = watt;
        this.suhu = 30;
        this.filter = new Filter();
    }

    // Constructor 2
    public Assignment_3_1(String merk, int watt, int suhu, Filter filter) {
        this.merk = merk;
        this.watt = watt;
        this.suhu = suhu;
        this.filter = filter;
    }

    // Behaviour 1
    public void hidupkan() {
        System.out
                .println("=== AC " + getMerk() + " telah dinyalakan dengan suhu " + getSuhu() + " derajat Celcius ===");
        filter.bersihkan();
    }

    // Behaviour 2
    public void matikan() {
        System.out.println("=== AC " + getMerk() + " telah dimatikan ===");
    }

    // Behaviour 3
    public void naikkanSuhu() {
        if (getSuhu() < 30) {
            setSuhu(getSuhu() + 1);
            System.out.println("> Suhu AC " + getMerk() + " naik menjadi " + getSuhu() + " derajat Celcius");
        } else {
            System.out.println("> Suhu sudah maksimal, tidak bisa dinaikkan lagi");
        }
    }

    // Behaviour 4
    public void turunkanSuhu() {
        if (getSuhu() > 16) {
            setSuhu(getSuhu() - 1);
            System.out.println("> Suhu AC " + getMerk() + " turun menjadi " + getSuhu() + " derajat Celcius");
        } else {
            System.out.println("> Suhu sudah minimal, tidak bisa diturunkan lagi");
        }
    }

    // Getter and Setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setWatt(int watt) {
        this.watt = watt;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public String getMerk() {
        return merk;
    }

    public int getWatt() {
        return watt;
    }

    public int getSuhu() {
        return suhu;
    }

    public Filter getFilter() {
        return filter;
    }
}

class Filter {
    // Behaviour
    void bersihkan() {
        System.out.println("> Filter AC telah dibersihkan");
    }
}