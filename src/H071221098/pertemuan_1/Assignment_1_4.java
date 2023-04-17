package H071221098.pertemuan_1;
import java.util.Scanner;

public class Assignment_1_4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String kalimat = inp.nextLine();
        String[] kata = kalimat.toLowerCase().split(" "); //split spasi setiap kalimat
        String kalimatBaru = "";
        for (int i = 0; i < kata.length; i++) {
            kalimatBaru += kata[i].substring(0, 1).toUpperCase() + kata[i].substring(1) + " "  ; //"Spasi tiap kalimat"
        }
        System.out.println("Judul film setelah diubah : " + kalimatBaru); //tidak perlu trim 
        inp.close();
    }
}

