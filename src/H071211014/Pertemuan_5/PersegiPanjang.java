public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
      this.panjang = panjang;
      this.lebar = lebar;
    }
    
    public double hitungLuas() {
      return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungKeliling'");
    }
}
