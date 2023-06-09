import java.util.ArrayList;

public class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public TypeRacer(String wordsToType, ArrayList<Typer> raceContestant, ArrayList<Result> raceStanding) {
        this.wordsToType = wordsToType;
        this.raceContestant = raceContestant;
        this.raceStanding = raceStanding;

        
    }
    public String getWordsToType() {
        return wordsToType;
    }
    public void setWordsToType(String wordsToType) {
        this.wordsToType = wordsToType;
    }
    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }
    public void setRaceContestant(ArrayList<Typer> raceContestant) {
        this.raceContestant = raceContestant;
    }
    public ArrayList<Result> getRaceStanding() {
        return raceStanding;
    }
    public void setRaceStanding(ArrayList<Result> raceStanding) {
        this.raceStanding = raceStanding;
    }
    public void addResult(Typer typer) {
    }
    public void startRace() {
    }
    public void setNewWordsToType() {
    }
}
