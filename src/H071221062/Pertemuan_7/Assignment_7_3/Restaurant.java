import java.util.List;

public class Restaurant {
    public static int calculateTotal(List<Food> orders) {
        int total = 0;
        for (Food order : orders) {
            total += order.getPrice();
        }
        return total;
    }
}