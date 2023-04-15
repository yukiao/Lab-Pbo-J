package H071221009.Pertemuan_3;

public class Assignment_3_1 {
    public static void main(String[] args) {

        Jenis jenis1 = new Jenis("Kekuatan");
        
        // buat method utk cabangolahraga
        CabangOlahraga cabangolahraga1 = new CabangOlahraga("Voli", jenis1, "Bola Voli", 15, 6);
        cabangolahraga1.showInfo(); // memanggil behavior showInfo
        cabangolahraga1.tambahWaktu(5); // memanggil behavior tambahwaktu dan menambah waktu bermain sebanyak 5 menit

        System.out.println();

        CabangOlahraga cabangolahraga2 = new CabangOlahraga("Sepak Bola", jenis1, "Bola dan Sepatu", 90, 11);
        cabangolahraga2.showInfo();
                
        }
    
}