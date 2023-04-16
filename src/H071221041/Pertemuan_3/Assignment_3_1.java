package H071221041.Pertemuan_3;

public class Assignment_3_1 {
    public static void main(String[] args) {
        Level easy = new Level("Mudah ", 3);
        Level medium = new Level("Sedang ", 2);
        Level hard = new Level("Sulit ", 1);

        //konstruktor
        CookingMama cookingMama = new CookingMama("Burger", 5, 4, easy, medium, hard);

        cookingMama.detailIngfo();
        cookingMama.tambahKecepatanMasak(1);
        }
}

