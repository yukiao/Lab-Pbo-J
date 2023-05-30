public class Pitbull extends Dog {

    public Pitbull(int position, int averageLength) {
        super(position,averageLength);
    }

    @Override
    public void move() {
        position += 3;
    }

    @Override
    void describe() {
        System.out.println("Berbadan besar dan kekar");
    }
    
}
