package H071221078.Pertemuan_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Assignment_8_2 {
    public static void main(String[] args) {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Spongebob", 60, typeRacer);
        typers[1] = new Typer("Bot Patrick", 70, typeRacer);
        typers[2] = new Typer("Bot Squidward", 67, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}

class Typer extends Thread {
    private String botName, wordsTyped;
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
    
    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }
    public void setWpm(double wpm) {
        this.wpm = wpm;
    }
    public String getBotName() {
        return botName;
    }
    
    public String getWordsTyped() {
        return wordsTyped;
    }
    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String [] wordsToType = typeRacer.getWordsToType().split(" ");
        int howLongToType = (int)(60000 / this.wpm);
        for (int i = 0; i < wordsToType.length; i++) {
            addWordTyped(wordsToType[i]);
            try {
                Thread.sleep(howLongToType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.addWordTyped("(selesai)");
        
        typeRacer.addResult(new Result(botName, howLongToType*wordsToType.length/1000));
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

    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
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

    private String [] wordsToTypeList = {
        "Menuju tak terbatas dan melampauinya",
        "Kehidupan adalah perjalanan yang penuh dengan lika-liku. Jadikan setiap tantangan sebagai kesempatan untuk tumbuh dan berkembang",
        "Cinta sejati adalah ketika dua jiwa saling melengkapi, memberi dukungan dan menginspirasi satu sama lain untuk menjadi yang terbaik",
        "Hidup adalah anugerah yang berharga. Nikmati setiap momen dan hargai kebahagiaan sederhana di sekitar kita",
        "Perubahan adalah satu-satunya konstanta dalam hidup. Yang bertahan adalah mereka yang dapat beradaptasi dengan fleksibilitas",
        "Kebersamaan adalah fondasi yang kuat dalam membangun hubungan yang langgeng dan bermakna",
        "Masa depan adalah milik mereka yang memiliki imajinasi, tekad, dan kerja keras untuk mewujudkan visi mereka",
        "Ketika kita berbagi dengan orang lain, kita tidak hanya mengurangi beban mereka, tetapi juga memperkaya hati kita sendiri",
        "Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain",
        "Rasa syukur adalah kunci untuk mengalami kebahagiaan yang sejati dalam hidup. Mencintai apa yang kita miliki adalah kunci kepuasan yang tak ternilai",
        };

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(10);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    public synchronized void addResult(Result result) {
        raceStanding.add(result);
    }
    
    private void printRaceStanding() {
        System.out.println("\nKlasemen Akhir Type Racer");
        System.out.println("=========================\n");
        for (int i = 0; i < raceStanding.size(); i++) {
            System.out.printf("\n%d. %s = %d detik", i+1 , raceStanding.get(i).getName(), raceStanding.get(i).getFinishTime());
        }
    }

    public void startRace() {
        for (int i = 0; i < raceContestant.size(); i++) {
            raceContestant.get(i).start();
        }
        
        while (raceContestant.size() != raceStanding.size()) {
            System.out.println("Typing Progress ...");
            System.out.println("=================");
            for (int i = 0; i < raceContestant.size(); i++) {
                System.out.println("-" + raceContestant.get(i).getBotName() + " => " + raceContestant.get(i).getWordsTyped());
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // for (Typer typer : raceContestant) {
        //     try {
        //         typer.join();
        //     } catch (InterruptedException e) {
        //         e.printStackTrace();
        //     }
        // }
        printRaceStanding();
    }
}