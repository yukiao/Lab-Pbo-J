package H071221041.Pertemuan_7;

import java.util.List;
import java.util.ArrayList;

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 1000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price = 2000;

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price = 3000;

    @Override
    public int getPrice() {
        return price;
    }
}

class FoodFactory {
    public static Food getFood(String type) {
        switch (type) {
            case "burger":
                return new Burger();
            case "pizza":
                return new Pizza();
            case "steak":
                return new Steak();
            default:
                throw new IllegalArgumentException("eror " + type);
        }
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foodList) {
        int total = 0;
        for (Food food : foodList) {
            total += food.getPrice();
        }
        return total;
    }
}

public class Assignment_7_3 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foodList = new ArrayList<>();
        foodList.add(burger);
        foodList.add(pizza);
        foodList.add(steak);

        int total = Restaurant.calculateTotal(foodList);
        System.out.println("total price: " + total);
    }
}
