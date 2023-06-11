package H071221098.pertemuan_7;

public class Product<Type> {
    private String name;
    private Type price;
    private String expiryDate;

    public Product(String name, Type price, String expiryDate) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public Type getPrice() {
        return price;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

}
