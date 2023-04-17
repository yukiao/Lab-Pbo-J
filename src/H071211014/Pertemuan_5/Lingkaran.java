public class Lingkaran extends BangunDatar {
    private double radius;
  
    public Lingkaran(double radius) {
      this.radius = radius;
    }
    
    public double hitungLuas() {
      return Math.PI * radius * radius;
    }

    @Override
    public double hitungKeliling() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hitungKeliling'");
    }
  
}
