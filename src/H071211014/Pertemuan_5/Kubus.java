public class Kubus extends BangunRuang {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 6 * Math.pow(sisi, 2);
    }

    @Override
    public double hitungVolume() {
        return Math.pow(sisi, 3);
    }
}