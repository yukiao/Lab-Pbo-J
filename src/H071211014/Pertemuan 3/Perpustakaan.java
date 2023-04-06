public class Perpustakaan {
    int totalBuku, bukuDipinjam, bukuTinggal;

    public Perpustakaan(){}

    public Perpustakaan(int totalBuku) {
        this.totalBuku = totalBuku;
        this.bukuTinggal = totalBuku;
        this.bukuDipinjam = 0;
    }

    public Perpustakaan(int totalBuku, int bukuDipinjam, int bukuTinggal) {
        this.totalBuku = totalBuku;
        this.bukuDipinjam = bukuDipinjam;
        this.bukuTinggal = bukuTinggal;
    }

    public int getTotalBuku() {
        return this.totalBuku;
    }

    public int getBukuDipinjam() {
        return this.bukuDipinjam;
    }

    public int getBukuTinggal() {
        return this.bukuTinggal;
    }

    public void beliBuku(int value) {
        this.totalBuku += value;
        this.bukuTinggal += value;

        System.out.println("Berhasil membeli buku");
    }

    public void pinjamBuku(int value) {
        System.out.println("Meminjam buku...");

        this.bukuDipinjam += value;
        this.bukuTinggal -= value;
    }
    
    public void kembalikanBuku(int value) {
        System.out.println("Mengembalikan buku...");

        this.bukuDipinjam -= value;
        this.bukuTinggal += value;
    }

    public void cekBuku() {
        System.out.println(this.totalBuku);
        System.out.println(this.bukuTinggal);
        System.out.println(this.bukuDipinjam);
    }
}