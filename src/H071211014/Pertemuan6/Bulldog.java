public class Bulldog extends Dog {

    Bulldog(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
        position += 1;
    }

    @Override
    void describe() {
        System.out.println("Pendek dan berwajah besar");
    }
    
}
