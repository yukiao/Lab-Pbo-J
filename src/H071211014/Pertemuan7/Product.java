public class Product<T> {

    private String name;
    private String expiryDate;
    private T price;
    public Product(String name, String expiryDate, T price) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
    public T getPrice() {
        return price;
    }
    public void setPrice(T price) {
        this.price = price;
    }
}
