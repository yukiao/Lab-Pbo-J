import java.util.List;

public class Restaurant {
    public static int calculateTotal(List<Food> foods){
        int total = 0;
        for (Food food : foods){
            total += food.getPrice();
        }
        return total;
    }
}
