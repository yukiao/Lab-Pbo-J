public class Tabung extends BangunRuang{
    double jari, tinggi;

    public Tabung(double jari, double tinggi) {
        super("Tabung");
        this.jari = jari;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        double volume = Math.PI * jari * jari * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungLuasPermukaan'");
    }
}
