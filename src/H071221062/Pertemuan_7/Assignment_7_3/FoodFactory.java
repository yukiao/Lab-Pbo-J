public class FoodFactory {
    public static Food getFood(String jenis){
        if (jenis.equalsIgnoreCase("burger")) {
            return new Burger();
        } else if (jenis.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else if (jenis.equalsIgnoreCase("steak")) {
            return new Steak();
        } else {
            return null;
        }
    }
}
