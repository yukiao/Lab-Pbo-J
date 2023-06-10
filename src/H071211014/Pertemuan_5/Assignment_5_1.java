package H071211014.Pertemuan_5;

public class Assignment_5_1 {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(5.0);
        System.out.println("Volume kubus: " + kubus.hitungVolume());
        
        Bola bola = new Bola(7.0);
        System.out.println("Volume bola: " + bola.hitungVolume());
        
        Balok balok = new Balok(4.0, 6.0, 8.0);
        System.out.println("Volume balok: " + balok.hitungVolume());
        
        Tabung tabung = new Tabung(3.0, 10.0);
        System.out.println("Volume tabung: " + tabung.hitungVolume());

        Persegi persegi = new Persegi(5.0);
    System.out.println("Luas persegi: " + persegi.hitungLuas());
    System.out.println("Keliling persegi: " + persegi.hitungKeliling());
    
    PersegiPanjang persegiPanjang = new PersegiPanjang(4.0, 6.0);
    System.out.println("Luas persegi panjang: " + persegiPanjang.hitungLuas());
    System.out.println("Keliling persegi panjang: " + persegiPanjang.hitungKeliling());
    
    Lingkaran lingkaran = new Lingkaran(3.0);
    System.out.println("Luas lingkaran: " + lingkaran.hitungLuas());
    System.out.println("Keliling lingkaran: " + lingkaran.hitungKeliling());
    
    Segitiga segitiga1 = new Segitiga(5.0, 7.0);
    System.out.println("Luas segitiga (alas=5, tinggi=7): " + segitiga1.hitungLuas());
    
    Segitiga segitiga2 = new Segitiga(3.0, 4.0, 5.0);
    System.out.println("Keliling segitiga (sisi1=3, sisi2=4, sisi3=5): " + segitiga2.hitungKeliling());
    
    Trapesium trapesium1 = new Trapesium(3.0, 5.0, 4.0);
    System.out.println("Luas trapesium (alas1=3, alas2=5, tinggi=4): " + trapesium1.hitungLuas());
    
    Trapesium trapesium2 = new Trapesium(4.0, 6.0, 5.0, 7.0);
    System.out.println("Keliling trapesium (sisi1=4, sisi2=6, alas1=5, alas2=7): " + trapesium2.hitungKeliling());
    }
}
