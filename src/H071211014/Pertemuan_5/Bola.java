public class Bola extends BangunRuang{
    double jari;

    public Bola(double jari) {
        super("Bola");
        this.jari = jari;
    }

    public double hitungVolume() {
        double volume = 4 / 3 * Math.PI * jari * jari * jari;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungLuasPermukaan'");
    }
}
