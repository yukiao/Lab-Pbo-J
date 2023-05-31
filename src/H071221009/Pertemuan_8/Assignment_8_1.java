package H071221009.Pertemuan_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random; //menyediakan fungsi-fungsi untuk menghasilkan nilai acak.
import java.util.concurrent.ExecutorService; //metode untuk mengendalikan eksekusi tugas secara asinkron dan paralel.
import java.util.concurrent.Executors; //menyediakan metode untuk membuat instance ExecutorService.

class LoadData { //class untuk meload data
    private int jumlahData;
    private int nomorThread;
    private List<Integer> loadedData;
    private List<Integer> failedData;

    public LoadData(int jumlahData, int nomorThread) {
        this.jumlahData = jumlahData;
        this.nomorThread = nomorThread;
        this.loadedData = new ArrayList<>();
        this.failedData = new ArrayList<>();
    }

    public void start() {
        System.out.println("Start load " + jumlahData + " Data"); //menunjukkan bahwa proses pengambilan data dimulai. jumlahData digunakan untuk mencetak jumlah data yang akan diambil.
        ExecutorService executor = Executors.newFixedThreadPool(nomorThread); //Membuat instance ExecutorService menggunakan metode newFixedThreadPool dari kelas Executors. nomorThread digunakan untuk menentukan jumlah thread yang akan digunakan dalam eksekusi tugas.
        for(int i = 0; i < jumlahData; i++) { // Melakukan iterasi sebanyak jumlahData
            executor.execute(new LoadDataTask(i)); //menjalankan LoadDataTask menggunakan executor.execute(). Setiap LoadDataTask akan dijalankan secara paralel oleh thread yang dikelola oleh executor.
        }
        executor.shutdown(); //Menghentikan penerimaan tugas baru oleh executor. Setelah ini, executor tidak akan menerima tugas baru untuk dieksekusi.

        Thread uiThread = new Thread(new UIThread()); //Membuat instance Thread baru menggunakan UIThread sebagai tugas yang akan dieksekusi
        uiThread.start(); //memulai eksekusi thread

        while(!executor.isTerminated()) { //Melakukan perulangan yang terus berjalan sampai semua tugas yang dieksekusi oleh executor selesai. Dalam setiap iterasi, thread utama (start()) akan tidur selama 1 detik menggunakan Thread.sleep(1000).
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
        try { 
            uiThread.join(); //Mengeksekusi uiThread.join(), yang akan membuat thread utama (start()) menunggu hingga uiThread selesai dieksekusi sebelum melanjutkan eksekusi berikutnya.
        } catch (InterruptedException e) {
            e.printStackTrace(); //Jika uiThread ada kesalahan, akan dicetak apa saja yang salah (e.printStackTrace()).
        }
    }
    private class LoadDataTask implements Runnable { //class implementasi
        private int sourceId;

        public LoadDataTask(int sourceId) {
            this.sourceId = sourceId;
        }

        @Override
        public void run() {
            int taskTime = TaskTimeHelper.generateTaskTime(); //Mendeklarasikan variabel taskTime dan menginisialisasinya dengan nilai yang dihasilkan oleh pemanggilan metode generateTaskTime() dari kelas TaskTimeHelper. Metode ini kemungkinan menghasilkan waktu tugas secara acak.
            try {
                Thread.sleep(taskTime * 1000); //Memanggil Thread.sleep() untuk menghentikan eksekusi tugas saat ini (thread) selama taskTime detik. taskTime dikalikan dengan 1000 untuk mengkonversi nilai dalam detik menjadi milidetik
            } catch (InterruptedException e) {
                e.printStackTrace(); //Jika ada error (exception) InterruptedException selama proses sleep, akan dicetak baris baris kesalahan (e.printStackTrace()).
            }
            if (taskTime > 4) { //Memeriksa apakah taskTime lebih besar dari 4
                System.out.println("Request Timeout"); //Jika iya, mencetak pesan "Request Timeout" yang menunjukkan bahwa permintaan telah melampaui batas waktu yang ditetapkan.
                failedData.add(sourceId); //Kemudian, sourceId ditambahkan ke daftar failedData
            } else {
                loadedData.add(sourceId); //Jika taskTime tidak lebih besar dari 4, sourceId ditambahkan ke daftar loadedData.
            }
        }
    }

    private static class TaskTimeHelper {
        public static int generateTaskTime() {
            Random random = new Random(); //Objek ini digunakan untuk menghasilkan angka acak.
            return random.nextInt(6) + 1; //Menggunakan objek random untuk memanggil metode nextInt(6) yang menghasilkan angka acak antara 0 hingga 5. Kemudian, angka tersebut ditambahkan dengan 1 sehingga menghasilkan angka acak antara 1 hingga 6. Nilai tersebut akan dikembalikan sebagai hasil dari metode generateTaskTime().
        }
    }

    private class UIThread implements Runnable {
        @Override
        public void run() {
            int totalTime = 0; //Variabel ini akan digunakan untuk menghitung total waktu yang telah berlalu.
            while(loadedData.size() + failedData.size() < jumlahData) { //Melakukan loop while selama total data yang berhasil dimuat (loadedData.size()) ditambah total data yang gagal dimuat (failedData.size()) yang kurang dari jumlahData yang diharapkan. Loop ini akan berjalan sampai semua data selesai dimuat atau gagal dimuat.
                try {
                    Thread.sleep(2000); //Di dalam loop while, terdapat blok try-catch yang digunakan untuk menghandle InterruptedException saat thread tidur selama 2 detik menggunakan Thread.sleep(2000). 
                    totalTime++;
                    System.out.println("Loading... (" + totalTime + "s)");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int totalLoaded = loadedData.size(); //Menghitung total data yang berhasil dimuat dengan mengambil ukuran (size) dari loadedData.
            int totalFailed = failedData.size(); //Menghitung total data yang gagal dimuat dengan mengambil ukuran (size) dari failedData.

            if(totalFailed > 0) {
                System.out.println("\nTask Finish. \nTime Execution : " + totalTime + "s\n" + totalLoaded + " Data successfully loaded & " + totalFailed + " Data failed to load.\n"); //mencetak total data yang sukses dan gagal
            } else {
                System.out.println("\nTask Finish. \nTime Execution : " + totalTime + "s\nAll data is successfully loaded.\n"); //mencetak semua data yang sukses
            }
        }
    }
}

public class Assignment_8_1 {
    public static void main(String[] args) {
        LoadData dataLoader = new LoadData(4,2);
        dataLoader.start();
    }
}