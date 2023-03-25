package H071221041.Pertemuan_1;

public class Assignment_1_7 {
    // array data nama orang
    private String[] data = { "lisa", "muti", "lia", "kia", "nata", "syifa", "karin", "santi" };

    public int findIndex(String text) {
        // Konversi teks ke huruf kecil agar case-insensitive
        text = text.toLowerCase();

        // cri indeks teks dalam array
        for (int i = 0; i < data.length; i++) {
            if (data[i].toLowerCase().equals(text)) { // utk mmbandingkan 2 string
                return i;
            }
        }

        // klo klimat tidak ditmukan mka return -1
        return -1;
    }

    public static void main(String[] args) {
        // Membuat objek StringArrayExample
        Assignment_1_7 example = new Assignment_1_7();

        // Cari indeks teks dalam array
        System.out.println("Indeks dari 'muti': " + example.findIndex("muti"));
        System.out.println("Indeks dari 'santi': " + example.findIndex("santi"));

        // Cari indeks teks yang tidak ada dalam array
        System.out.println("Indeks dari 'muti cute': " + example.findIndex("muti cute"));
    }
}
