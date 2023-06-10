public class Burger implements Food{
    private int harga = 10;

    @Override
    public int getPrice() {
        return harga;
    }
}
