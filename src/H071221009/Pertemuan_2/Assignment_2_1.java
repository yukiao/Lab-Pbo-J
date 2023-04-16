package H071221009.Pertemuan_2;

public class Assignment_2_1 {
    class Selebriti {
        // attribute/ apa yg dimiliki sebuah class
        String nama;
        int usia;
        String jenisKelamin;
        String hobi;
        int followers;
        
        // constructor/ method khusus yang akan dieksekusi pada saat pembuatan objek (instance)
        public Selebriti(String nama, int usia, String jenisKelamin, String hobi, int followers) {
            this.nama = nama;
            this.usia = usia;
            this.jenisKelamin = jenisKelamin; // this utk perintah khusus untuk mengakses object saat ini
            this.hobi = hobi;
            this.followers = followers;
        }
        
        // behavior/ apa yg bisa dilakukan suatu class
        public void tambahFollowers(int jumlah) { // void itu tdk bisa mengembalikan nilai
            this.followers += jumlah;
            System.out.println(this.nama + " berhasil menambah " + jumlah + " followers. Total followers sekarang: " + this.followers);
        }
        
        // behavior
        public void info() { // huruf kecil kata pertama untuk behavior
            System.out.println("Nama            : " + this.nama);
            System.out.println("Usia            : " + this.usia);
            System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
            System.out.println("Hobi            : " + this.hobi);
            System.out.println("Jumlah Followers: " + this.followers);
        }
    
    }
    // main method/ blok program yang akan dieksekusi pertama kali
    public static void main(String[] args) {
        // membuat objek selebriti di dalam objek Assignment_2_No1
        Assignment_2_1 assignment_2_No1 = new Assignment_2_1();
        Selebriti selebriti1 = assignment_2_No1.new Selebriti("Baim Wong", 26, "Laki-Laki", "Traveling", 1000000);
        // memanggil behavior info
        selebriti1.info();
        selebriti1.tambahFollowers(500000);
        selebriti1.info();
    }
}