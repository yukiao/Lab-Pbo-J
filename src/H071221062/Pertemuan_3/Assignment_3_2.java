package H071221062.Pertemuan_3;

public class Assignment_3_2 { //MAIN CLASS AC
    public static void main(String[] args) {
        // Membuat objek AC dengan constructor 1
        Assignment_3_1 ac1 = new Assignment_3_1("Panasonic", 500);

        // Menghidupkan AC dan membersihkan filter
        ac1.hidupkan();

        // Menyalakan AC dan menaikkan suhu
        ac1.naikkanSuhu();

        // Menurunkan suhu AC
        ac1.turunkanSuhu();

        // Membuat objek Filter secara terpisah
        Filter filter = new Filter();

        // Membuat objek AC dengan constructor 2
        Assignment_3_1 ac2 = new Assignment_3_1("Sharp", 750, 24, filter);

        // Menyalakan AC dan membersihkan filter
        ac2.hidupkan();

        // Menyalakan AC dan menaikkan suhu
        ac2.naikkanSuhu();
        ac2.naikkanSuhu();

        // Menurunkan suhu AC
        ac2.turunkanSuhu();

        // Mematikan AC
        ac2.matikan();
    }
}
