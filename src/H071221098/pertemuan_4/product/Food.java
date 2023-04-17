package H071221098.pertemuan_4.product;
public class Food{
    public Food(){}
    public Food(String name, String type, int price, int rating){
        this.name = name;
        this.type = type;
        this.price = price;
        this.rating = rating;
    }
    private String name;
    private String type;
    private int price;
    private int rating;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(type);
        System.out.println(price);
        System.out.println(rating);

}
}