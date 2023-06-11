package H071221090.Pertemuan_8.Assignment_8_1;

import java.util.Random;

public class TaskTimeHelper {
    public static int getRandomNumber() {
        Random random = new Random();
        // Akan acak dari 0 sampai 6 lalu ditambah 1
        return random.nextInt(6) + 1;
    }
}
