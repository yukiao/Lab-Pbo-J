package H071221078.Pertemuan_7;

import java.util.ArrayList;
import java.util.List;

public class Assignment_7_3 {
    public static void main(String[] args) {
        try {
            Food burger = FoodFactory.getFood("Burger");
            Food pizza = FoodFactory.getFood("Pizza");
            Food steak = FoodFactory.getFood("Steak");

            List<Food> foods = new ArrayList<>();
            foods.add(burger);
            foods.add(pizza);
            foods.add(steak);

            int total = Restaurant.calculateTotal(foods);
            System.out.println("Total price: Rp." + total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class FoodFactory {
    static Food getFood(String jenisMakanan) throws Exception {
        if (jenisMakanan.toLowerCase().equals("burger")) {
            return new Burger();
        } else if (jenisMakanan.toLowerCase().equals("pizza")) {
            return new Pizza();
        } else if (jenisMakanan.toLowerCase().equals("steak")) {
            return new Steak();
        }
        throw new Exception("Jenis Makanan Tidak Ada");
    }
}

interface Food {
    int getPrice();
}

class Burger implements Food {
    private final int HARGA = 10000;
    @Override
    public int getPrice() {
        return HARGA;
    }  
}

class Pizza implements Food {
    private final int HARGA = 150000;
    
    @Override
    public int getPrice() {
        return HARGA;
    }
    
}

class Steak implements Food {
    private final int HARGA = 150000;
    
    @Override
    public int getPrice() {
        return HARGA;
    }
}

class Restaurant {
    static int calculateTotal(List<Food> foods) {
        int total = 0;
        for (int i = 0; i < foods.size(); i++) {
            Food food = foods.get(i);
            total += food.getPrice();
        }
        return total;
    }
}