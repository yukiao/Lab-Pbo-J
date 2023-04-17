
import java.util.ArrayList;

// Class Anggota sebagai induk dari pengurus inti dan koordinator
class Anggota {
    ArrayList<String> pengurus = new ArrayList<String>(); // ArrayList untuk menyimpan nama-nama pengurus dan jabatannya
    
    // method untuk menambahkan nama pengurus dan jabatannya
    public void tambahPengurus(String nama, String jabatan) {
        String pengurusBaru = nama + " (" + jabatan + ")";
        pengurus.add(pengurusBaru);
    }   
}

class PengurusInti extends Anggota {
    // method untuk menampilkan daftar nama pengurus inti dan jabatannya
    public void tampilkanPengurusInti() {
        System.out.println("Daftar Pengurus Inti:");
        for (String pengurus : this.pengurus) {
            System.out.println(pengurus);
        }
    }   
}

class KoordinatorBidangdanStaf extends Anggota {
    // method untuk menampilkan daftar nama koordinator dan jabatannya
    public void tampilkanKoordinator() {
        System.out.println("Daftar Koordinator:");
        for (String pengurus : this.pengurus) {
            System.out.println(pengurus);
        }
    }
}

class KomunitasProgrammerUnhas {
    // objek PengurusInti dan Koordinator
    PengurusInti pengurusInti = new PengurusInti();
    KoordinatorBidangdanStaf koordinator = new KoordinatorBidangdanStaf();
    
    public void tambahPengurusInti(String nama, String jabatan) {   // method untuk menampilkan daftar nama pengurus inti dan jabatannya
        pengurusInti.tambahPengurus(nama, jabatan);
    }
    
    public void tambahKoordinator(String nama, String jabatan) {  // method untuk menampilkan daftar nama koordinator dan jabatannya
        koordinator.tambahPengurus(nama, jabatan);
    }
    
    public void tampilkanPengurus() {  // method untuk menampilkan daftar pengurus inti dan koordinator beserta jabatannya
        pengurusInti.tampilkanPengurusInti();
        koordinator.tampilkanKoordinator();
    }
    
}

public class Assignment_5_2 {
    
    public static void main(String[] args) {
        // Objek Komunitas
        KomunitasProgrammerUnhas komunitas = new KomunitasProgrammerUnhas();
        
        // Menambahkan nama pengurus inti beserta jabatannya
        komunitas.tambahPengurusInti("Andi", "Ketua");
        komunitas.tambahPengurusInti("Budi", "Wakil Ketua");
        
        // Menambahkan nama koordinator beserta jabatannya
        komunitas.tambahKoordinator("Alpha", "Koordinator Divisi Web");
        komunitas.tambahKoordinator("Beta", "Koordinator Divisi UI/UX");
        komunitas.tambahKoordinator("Sigma", "Koordinator Divisi Mobile");
        // Menampilkan daftar pengurus inti dan koordinator 
        komunitas.tampilkanPengurus();
    }
}