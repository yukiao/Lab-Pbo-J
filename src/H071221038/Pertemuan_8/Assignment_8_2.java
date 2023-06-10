package H071221038.Pertemuan_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Typer extends Thread {
    private String botName, wordTyped;
    private double wpm;
    private TypeRacer typeRacer;
    
    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordTyped = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }
    
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }

    public void addWordTyped(String newWordTyped) {
        this.wordTyped += newWordTyped + " ";
    }

    public String getWordTyped() {
        return wordTyped;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {

        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        // TODO (1)
        int HowLongToType = (int) (60000 / this.wpm);

        // TODO (2)
        for (String string : wordsToType) {
            
            addWordTyped(string);
            try {
                Thread.sleep(HowLongToType);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.addWordTyped("(selesai)");
        // TODO (3)
        typeRacer.addResult(new Result(botName, HowLongToType*wordsToType.length/1000));
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
    
    public void setFinishTime (int racerTime) { 
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
    
    // Word by Yusuf Syam, Silahkan diubah jika dirasa kurang bijak private String[] wordsToTypeList={...};
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
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }
    
    // TODO (4)
    public void addResult (Result result) {
        raceStanding.add(result);
    }
    
    private void printRaceStanding() { 
        System.out.println("\nKlasemen Akhir Type Racer"); 
        System.out.println("=======================\n"); 
        // TODO (5)
        int index = 1;
        for (Result winner : raceStanding) {
            System.out.println(winner.getName() + " = " + winner.getFinishTime() + " detik");
            index ++;
        }
    }
    
    public void startRace() { 
        // TODO (6)
        for (Typer contestant : raceContestant) {
            contestant.start();
        }

        // TODO (7)
        while (raceContestant.size() != raceStanding.size()) {
            System.out.println("Typing Progress ...");
            System.out.println("=================");
            for (int i = 0; i < raceContestant.size(); i++) {
                System.out.println("-" + raceContestant.get(i).getBotName() + " => " + raceContestant.get(i).getWordTyped());
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (Typer typer : raceContestant) {
            try {
                typer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // TODO (8)
        printRaceStanding();

    }
}

public class Assignment_8_2 {
    public static void main(String[] args) throws InterruptedException{
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Jett", 80, typeRacer);
        typers[1] = new Typer("Bot Omen", 72, typeRacer);
        typers[2] = new Typer("Bot Yoru", 70, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}