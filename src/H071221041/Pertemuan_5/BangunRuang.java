package H071221041.Pertemuan_5;

public class BangunRuang {
    double menghitungLuasPermukaan(){
        return menghitungLuasPermukaan();
    }
    double menghitungVolume(){
        return menghitungVolume();
    }
}

class Kubus extends BangunRuang{
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double menghitungLuasPermukaan(){
        return 6*Math.pow(sisi, 2);
    }

    public double menghitungVolume(){
        return Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double menghitungLuasPermukaan(){
        return 2*(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    public double menghitungVolume(){
        return panjang*lebar*tinggi;
    }
}

class Bola extends BangunRuang{
    private double jarijari;

    public Bola(double jarijari) {
        this.jarijari = jarijari;
    }

    public double menghitungLuasPermukaan(){
        return 4*Math.PI*Math.pow(jarijari, 2);
    }

    public double menghitungVolume(){
        return 4/3*Math.PI*Math.pow(jarijari, 3);
    }
}

class Tabung extends BangunRuang{
    private double jarijari;
    private double tinggi;

    public Tabung(double jarijari, double tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    public double menghitungLuasPermukaan(){
        return 2*Math.PI*jarijari*(jarijari+tinggi);
    }

    public double menghitungVolume(){
        return Math.PI*Math.pow(jarijari, 2)*tinggi;
    }
}

