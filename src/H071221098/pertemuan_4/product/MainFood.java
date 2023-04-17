package H071221098.pertemuan_4.product;

public class MainFood {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.setName("Nasi Goreng");
        food1.setType("Makanan Berat");
        food1.setPrice(20000);
        food1.setRating (10) ;
        food1.displayInfo();

        Food food2 = new Food("kentang", "ringan", 10000, 10);
        System.out.println(food2.getName());
        System.out.println(food2.getType());
        System.out.println(food2.getPrice());
        System.out.println(food2.getRating());

        SelfUtils.displaySelfData();
    }
    
}
