package H071221009.Pertemuan_1;

public class Assignment_1_7 {
    // Inisialisasi array yang diisi dengan data nama negara
    String[] data = { "Italia", "Indonesia", "Palestina", "Amerika", "Rusia", "India", "Malaysia", "Korea", "Jepang",
            "Thailand" };

    public int findIndex(String text) { // findIndex untuk mencari posisi index pertama pada suatu string
        // Konversi teks ke huruf kecil agar casenya tidak memedulikan antara huruf
        // kapital dan non kapital
        text = text.toLowerCase();

        // mencari indeks teks dalam array
        for (int i = 0; i < data.length; i++) {
            // metode equals() utk membandingkan dua String dalam array data
            if (data[i].toLowerCase().equals(text)) { // tolowerCase mengubah nilai string ke nilai string yang terdiri
                                                      // dari huruf kecil semua
                return i; // mengembalikan nilai yang tersimpan di i
            }
        }
        return -1; // Jika tidak ditemukan, maka dikembalikan -1
    }

    public static void main(String[] args) {
        // Membuat objek StringArrayExample
        Assignment_1_7 contoh = new Assignment_1_7();

        // Cari indeks teks dalam array
        System.out.println("Indeks dari 'Indonesia': " + contoh.findIndex("indonesia")); // case 'Indonesia' huruf
                                                                                         // kapital pertama tdk
                                                                                         // memedulikan "indonesia"
        System.out.println("Indeks dari 'Korea': " + contoh.findIndex("korea"));

        // Cari indeks teks yang tidak ada dalam array
        System.out.println("Indeks dari 'China': " + contoh.findIndex("China"));
        System.out.println("Indeks dari 'Jerman': " + contoh.findIndex("Jerman"));
    }
}