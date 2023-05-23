package H071221041.Pertemuan_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Random;

public class Assignment_8_1 {
    private static final int sumberData = 4;
    private static final int threadPool = 3;
    private static int dataSukses = 0;
    private static int dataGagal = 0;
    private static boolean isFinished = false;

    public class TaskTimeHelper {
        public static int getRandomNumber() {
            Random random = new Random();
            // mengembalikan angka random 1-6
            return random.nextInt(6) + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Start load " + sumberData + " Data");

        // bg thread
        ExecutorService executor = Executors.newFixedThreadPool(threadPool);

        for (int i = 0; i < sumberData; i++) {
            executor.execute(() -> {
                int executionTime = TaskTimeHelper.getRandomNumber();
                if (executionTime > 4) {
                    System.out.println("Request Timeout");
                    // jadi data gagal akan bertambah
                    incrementdataGagal();
                    return;
                } else {
                    try {
                        // thread lagi tidur karna data source lagi sementara diakses
                        Thread.sleep(executionTime * 1000);
                        // setelah itu maka data dinyatakan valid dan data akan bertambah
                        incrementdataSukses();
                    } catch (InterruptedException e) {
                        incrementdataGagal();
                        System.out.println("Request Timeout");
                    }
                }
                checkDataLoadingStatus();
            });
        }

        // Thread akan dihentikan karna sudah selesai dijalankan
        executor.shutdown();

        // UI Thread
        int loadingTime = 1;
        while (true) {
            if (isFinished) {
                System.out.println("Task Finished.");
                // Dikurang satu supaya pas print out hasil itu pas dengan hitungan detik
                // terakhir sebelum semua Thread selesai bekerja
                System.out.println(String.format("Time Execution : %ds", loadingTime - 1));
                if (dataSukses == sumberData) {
                    System.out.println("All data is successfully loaded");
                    break;
                } else {
                    System.out
                            .println(dataSukses + " Data Successfully loaded & " + dataGagal + " Data Failed to load");
                    break;
                }
            } else {
                System.out.println(String.format("Loading... (%ds)", loadingTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            loadingTime++;
        }
    }

    public static synchronized void incrementdataSukses() {
        dataSukses++;
    }

    public static synchronized void incrementdataGagal() {
        dataGagal++;
    }

    public static synchronized void checkDataLoadingStatus() {
        if (dataSukses + dataGagal == sumberData) {
            isFinished = true;
        }
    }
}
