public class FoodFactory {
    public static Food getFood(FoodType foodType){
        if (foodType == FoodType.BURGER){
            return new Burger();
        } else if (foodType == FoodType.PIZZA){
            return new Pizza();
        } else if (foodType == FoodType.STEAK){
            return new Steak();
        }else {
            return null;
        }
    }
}
