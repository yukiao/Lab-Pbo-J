public class GermanShepperd extends Dog{

    GermanShepperd(int position, int averageLength) {
        super(position, averageLength);
    }

    @Override
    public void move() {
       position += 3;
    }

    @Override
    void describe() {
        System.out.println("Besar dan bertelinga lebar");
    }
    
}
