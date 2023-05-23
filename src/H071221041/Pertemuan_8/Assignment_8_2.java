package H071221041.Pertemuan_8;

import java.util.Arrays;

public class Assignment_8_2 {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type ||");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot Toku", 72, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 40, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
