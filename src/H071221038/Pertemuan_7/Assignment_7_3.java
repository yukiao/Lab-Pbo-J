package H071221038.Pertemuan_7;

import java.util.List;
import java.util.ArrayList;

class FoodFactory{

    public static Assignment_7_3 getFood(String foodType){
        switch(foodType.toLowerCase()){
            case "burger":
                return new Burger(20000);
            case "pizza":
                return new Pizza(30000);
            case "steak":
                return new Steak(40000);
            default:
                throw new IllegalArgumentException("Invalid food type: " + foodType);
        }
        // return null;
    }
}

interface Assignment_7_3{

    int getPrice();
}

class Burger implements Assignment_7_3{

    private int price;

    public Burger(int price) {
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }
}

class Pizza implements Assignment_7_3{

    private int price;

    public Pizza(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }
}

class Steak implements Assignment_7_3{

    private int price;

    public Steak(int price){
        this.price = price;
    }

    @Override
    public int getPrice(){
        return price;
    }
}

class Restaurant{

    public static int calculateTotal(List<Assignment_7_3> foods){
        int total = 0;

        for (Assignment_7_3 foodList : foods){
            total += foodList.getPrice();
        }

        return total;
    }
}

class Main3{
    public static void main(String[] args){
        Assignment_7_3 burger = FoodFactory.getFood("burger");
        Assignment_7_3 pizza = FoodFactory.getFood("pizza");
        Assignment_7_3 steak = FoodFactory.getFood("steak");

        List<Assignment_7_3> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price: " + total);
    }
}