import java.util.ArrayList;
import java.util.List;

public class Assignment_no3 {
    private static Food steak;

    public static void main(String[] args) {
        Food burger = FoodFactory.getFood(FoodType.BURGER);
        Food pizza = FoodFactory.getFood(FoodType.PIZZA);
        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
        
    }
}
