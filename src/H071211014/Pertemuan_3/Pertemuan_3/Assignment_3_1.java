package Pertemuan_3;

public class Assignment_3_1 {
    public static void main(String[] args) {
        KlubBola barcelona = new KlubBola("barcelona", "barcelona", new Stadium("Camp Nou", "Barcelona", 99000, 1234));
        KlubBola chelsea = new KlubBola("chelsea", "london", new Stadium("Stamford Bridge", "London", 48000, 1212));
        barcelona.tanding(chelsea);
        barcelona.juara("UCL");
    }
}
