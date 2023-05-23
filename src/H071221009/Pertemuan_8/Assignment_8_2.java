package H071221009.Pertemuan_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random; //menyediakan fungsi-fungsi untuk menghasilkan nilai acak.

class Typer extends Thread {
    private String botName, wordsTyped; //attribute
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" "); //untuk kata-kata yang harus diketik dalam balapan menggunakan metode getWordsToType() dari objek typeRacer. Kemudian, kata-kata tersebut dipisahkan split berdasarkan spasi dan disimpan dalam array wordsToType.

        // ToDo 1
        int howLongToType = (int) (80000 / wpm); //Menghitung interval waktu (howLongToType) yang dibutuhkan untuk mengetik satu kata berdasarkan kecepatan mengetik per menit (wpm).

        // ToDo 2
        // string words itu sama dengan wordsToType
        for (String words : wordsToType) { //Melakukan perulangan untuk setiap kata dalam array wordsToType. Setiap kata akan ditambahkan ke teks yang telah diketik menggunakan method addWordTyped(words).
            try {
                Thread.sleep(howLongToType);
                this.addWordTyped(words); //Di dalam perulangan for, terdapat blok try-catch yang digunakan untuk menghandle InterruptedException saat thread tidur selama interval waktu howLongToType sebelum mengetik kata berikutnya. Selama tidur, kata saat ini ditambahkan ke teks yang telah diketik menggunakan addWordTyped(words).
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordTyped("(selesai)"); //Menambahkan kata "(selesai)" ke teks yang telah diketik setelah seluruh kata dalam array wordsToType selesai diketik.

        // ToDo 3
        typeRacer.addResult(this); //Menambahkan objek saat ini (this) ke objek typeRacer untuk menyimpan hasil pengetikan.
    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String racerName) {
        this.name = racerName;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int racerTime) {
        this.finishTime = racerTime;
    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // di tambah sesuai modul
    private String[] wordsToTypeList = {"Menuju tak terbatas dan melampauinya",
                                        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
                                        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
                                        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
                                        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
                                        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
                                        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
                                        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
                                        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
                                        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",};

    public void setNewWordsToType() {
        Random random = new Random(); //Objek ini digunakan untuk menghasilkan angka acak.
        int bilRandom = random.nextInt(10); //Menggunakan objek random untuk memanggil metode nextInt(10) yang menghasilkan angka acak antara 0 hingga 9. Nilai ini akan disimpan dalam variabel angkaRandom.
        wordsToType = wordsToTypeList[bilRandom]; //Mengatur nilai dari variabel wordsToType dengan mengambil elemen dari wordsToTypeList yang memiliki indeks angkaRandom. kata-kata baru yang akan diketik diatur dengan memilih satu dari daftar kata-kata yang tersedia berdasarkan angka acak angkaRandom.
    }

    // ToDo 4
    public void addResult(Typer typer) { //Metode addResult adalah sebuah metode publik yang menerima parameter typer bertipe Typer. Tujuan dari metode ini adalah untuk menambahkan hasil pengetikan dari objek typer ke dalam daftar raceStanding.
        int waktu = (int) (80000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length; //Menghitung variabel waktu dengan menggunakan rumus (int) (80000 / typer.getWpm()) * typer.getWordsTyped().split(" ").length. Langkah ini menghitung waktu yang diperlukan oleh typer untuk mengetik dengan kecepatan tertentu (wpm) berdasarkan jumlah kata yang telah diketik.
        Result result = new Result(typer.getBotName(), waktu); //Membuat objek result dengan menggunakan konstruktor kelas Result, yang mengambil argumen typer.getBotName() (nama bot) dan waktu yang telah dihitung sebelumnya.
        raceStanding.add(result); //Menambahkan result ke dalam raceStanding, yaitu daftar yang menyimpan hasil-hasil pengetikan dari berbagai typer.
    }

    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("========================="); //Mencetak judul "Klasemen Akhir Type Racer" dan baris pemisah untuk memisahkan judul dengan isi klasemen.

        // ToDo 5
        for (int i = 0; i < raceStanding.size(); i++) { //Menggunakan loop for untuk iterasi melalui setiap elemen dalam daftar raceStanding.
            int timeint = raceStanding.get(i).getFinishTime(); //Di setiap iterasi, mengambil waktu selesai dari elemen yang sedang diproses menggunakan raceStanding.get(i).getFinishTime() dan menyimpannya dalam variabel timeint.
            double timeFix = timeint / 1000.0; //Mengonversi timeint menjadi bilangan desimal dengan membaginya dengan 1000.0 dan menyimpan hasilnya dalam variabel timeFix.
            System.out.println(String.format("%d. %s = %.2f detik", i + 1, raceStanding.get(i).getName(), timeFix)); //Mencetak baris yang berisi nomor urutan (i + 1), nama peserta (raceStanding.get(i).getName()), dan waktu selesai yang sudah diformat dalam format dua angka desimal
        }
    }

    // ToDo 6
    public void startRace() { //Metode ini digunakan untuk memulai balapan pada Type Racer.
        this.setNewWordsToType(); //Memanggil metode setNewWordsToType dengan menggunakan this.setNewWordsToType(). Metode ini bertugas untuk mengatur kata-kata yang akan diketik oleh para peserta balapan.
        for(Typer typers : raceContestant) { //Menggunakan loop for-each untuk mengiterasi setiap objek Typer dalam daftar raceContestant.
            typers.start(); //Pada setiap iterasi, memanggil metode start pada objek typers menggunakan typers.start(). Metode ini akan memulai proses pengetikan pada objek typers.
        }

        // ToDo 7
        Boolean isFinish = false; //Mendeklarasikan variabel isFinish dengan nilai awal false. Variabel ini akan digunakan untuk menentukan apakah balapan sudah selesai atau belum.
        while(true) { //Memulai loop while dengan kondisi true, yang berarti akan terus diulang selama kondisi tersebut benar.
            if(isFinish) { //Di dalam loop, terdapat kondisi if yang mengecek apakah isFinish bernilai true.
                break; //Jika iya, maka loop akan dihentikan dengan pernyataan break, dan proses akan keluar dari loop.
            } else { //Jika isFinish masih bernilai false, maka akan dilakukan pengecekan kondisi berikut:
                if(raceStanding.size() != raceContestant.size()) { //Memeriksa apakah jumlah elemen dalam raceStanding tidak sama dengan jumlah elemen dalam raceContestant. Jika iya, berarti masih ada peserta yang belum menyelesaikan balapan. 
                    try { //Menggunakan try-catch untuk menangani InterruptedException jika terjadi saat menjalankan Thread.sleep(2000). 
                        Thread.sleep(2000); //Thread.sleep(2000) digunakan untuk memberikan jeda selama 2 detik sebelum menampilkan kemajuan pengetikan peserta selanjutnya.

                    } catch(InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("\nTyping Progress ...");
                    System.out.println("================");

                    for(Typer racing : raceContestant) { //Menggunakan loop for-each untuk mengiterasi setiap objek Typer dalam daftar raceContestant.
                        System.out.println(String.format("- %s => %s", racing.getBotName(), racing.getWordsTyped())); //Pada setiap iterasi, mencetak baris yang berisi nama bot (racing.getBotName()) dan kata-kata yang telah diketik (racing.getWordsTyped()) menggunakan System.out.println() dan String.format().
                    }
                } else { //Jika jumlah elemen dalam raceStanding sama dengan jumlah elemen dalam raceContestant, berarti semua peserta telah menyelesaikan balapan.
                    isFinish = true; //Di dalam blok else tersebut, variabel isFinish diubah menjadi true untuk menandakan bahwa balapan telah selesai.
                }
            }
        }

        // ToDo 8
        this.printRaceStanding(); //untuk mencetak klasemen akhir yang mencerminkan hasil pengetikan dari setiap peserta dan menampilkan peringkat mereka berdasarkan waktu penyelesaian balapan.
    }
}

public class Assignment_8_2 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];
        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot Toku", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}