package H071211014.Pertemuan_3;
public class Product {
    String name;
    int price;
    int stock;

    public Product(String name, int price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock){
        this.name = name;
        this.price = Integer.parseInt(price.substring(0, price.length()-1)+ "000");
        this.stock = stock;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price; 
    }

    public int getStock(){
        return stock;
    }

    public void sold(){
        stock = stock-1;
    }

}
