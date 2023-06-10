public class Trapesium {
    double sisiAtas, sisiBawah, tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double tinggi, double d) {
        super();
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.tinggi = tinggi;
    }

    public Trapesium(double d, double e, double f) {
    }

    public double hitungLuas() {
        return 0.5 * (sisiAtas + sisiBawah) * tinggi;
    }

    public String hitungKeliling() {
        return null;
    }
}
