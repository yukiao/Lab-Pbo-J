public class Pizza implements Food{
    private int harga = 30;

    @Override
    public int getPrice() {
        return harga;
    }
}