package H071221041.Pertemuan_5;

public class BangunDatar {
    double menghitungLuas(){
        return menghitungLuas();
    }
    double menghitungKeliling(){
        return menghitungKeliling();
    }
}

class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double menghitungLuas(){
        return sisi*sisi;
    }

    public double menghitungKeliling(){
        return 4*sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double menghitungLuas(){
        return panjang*lebar;
    }

    public double menghitungKeliling(){
        return 2*(panjang + lebar);
    }
}

class Lingkaran extends BangunDatar{
    private double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public double menghitungLuas(){
        return Math.PI*jarijari*jarijari;
    }

    public double menghitungKeliling(){
        return 2*Math.PI*jarijari;
    }
}

class Segitiga extends BangunDatar{
    private double sisiA; 
    private double sisiB;
    private double sisiC;

    public Segitiga(double sisiA, double sisiB, double sisiC) {
        
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }

    public double menghitungLuas(){
        double s = 0.5*(menghitungKeliling());
        double luas = s*(s-sisiA)*(s-sisiB)*(s-sisiC);
        return Math.sqrt(luas);

    }

    public double menghitungKeliling(){
        return sisiA+sisiB+sisiC;
    }
}

class Trapesium extends BangunDatar{
    private double tinggi;
    private double sisiA; 
    private double sisiB;
    private double sisiC;
    private double sisiD;

    public Trapesium(double tinggi, double sisiA, double sisiB, double sisiC, double sisiD) {
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
        this.sisiD = sisiD;
    }

    public double menghitungLuas(){
        return 0.5*(sisiA + sisiB)*tinggi;
    }

    public double menghitungKeliling(){
        return sisiA+sisiB+sisiC+sisiD;
    }
}
