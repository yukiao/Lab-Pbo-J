public class SiberianHusky extends Dog {

    SiberianHusky(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 2;
    }

   @Override
    void describe() {
       System.out.println("Mirip Serigala");
    }
    
}
