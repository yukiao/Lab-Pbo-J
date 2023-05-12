package H071221009.Pertemuan_7;

import java.util.ArrayList;
import java.util.List;

interface Food {
    int getPrice();
}

public class FoodFactory {
    public static Food getFood(String foodType) throws IllegalArgumentException {
        switch(foodType) {
            case "burger":
                return new Burger(13000);
            case "pizza":
                return new Pizza(25000);
            case "steak":
                return new Steak(55000);
            default:
                throw new IllegalArgumentException("Invalid FoodType : " + foodType);
        }
    }
}

class Burger implements Food {
    private int price;

    public Burger(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Pizza implements Food {
    private int price;

    public Pizza(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Steak implements Food {
    private int price;

    public Steak(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

class Restaurant {
    public static int calculateTotal(List<Food> foods) {
        int total = 0;

        for(Food food : foods) {
            total += food.getPrice();
        }

        return total;
    }
}

class Main1 {
    public static void main(String[] args) {

        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price : " + total);
    }
}