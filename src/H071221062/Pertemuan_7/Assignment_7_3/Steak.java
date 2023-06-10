public class Steak implements Food{
    private int harga = 25;

    @Override
    public int getPrice() {
        return harga;
    }
}