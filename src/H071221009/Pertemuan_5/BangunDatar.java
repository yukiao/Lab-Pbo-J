package H071221009.Pertemuan_5;

import java.lang.Math;

public class BangunDatar {
        double hitungLuas(){
            return hitungLuas();
        }
        double hitungKeliling() {
            return hitungKeliling();
        }
    }
    
    class Persegi extends BangunDatar {
        private double sisi;
    
        public Persegi(double sisi) {
            this.sisi = sisi;
        }
    
        double hitungLuas() {
            return sisi * sisi;
        }
    
        double hitungKeliling() {
            return sisi * sisi * sisi * sisi;
        }
    }
    
    class PersegiPanjang extends BangunDatar {
        private double panjang;
        private double lebar;
    
        public PersegiPanjang(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }
    
        double hitungLuas() {
            return panjang * lebar;
        }
    
        double hitungKeliling() {
            return 2 * panjang + 2 * lebar;
        }
    }
    
    class Lingkaran extends BangunDatar {
        private double jari_jari;
        
    
        public Lingkaran(double jari_jari) {
            this.jari_jari = jari_jari;
            
        }
    
        double hitungLuas() {
            return Math.PI * jari_jari * jari_jari;
        }
    
        double hitungKeliling() {
            return 2 * Math.PI * jari_jari;
        }
    }
    
    class Segitiga  extends BangunDatar { // segitiga sama sisi
        private double sisi1;
        private double sisi2;
        private double sisi3;
    
        public Segitiga(double sisi1, double sisi2, double sisi3) {
            this.sisi1 = sisi1;
            this.sisi2 = sisi2;
            this.sisi3 = sisi3;
        }
        
        double hitungLuas() {
            double s = 0.5 * (hitungKeliling());
            double luas = s * (s-sisi1) * (s-sisi2) * (s-sisi3);
            return Math.sqrt(luas);
        }
    
        double hitungKeliling() {
            return sisi1 + sisi2 + sisi3;
        }
    }
    
    class Trapesium extends BangunDatar {
        private double sisi_atas;
        private double sisi_bawah;
        private double sisi_kanan;
        private double sisi_kiri;
        private double tinggi;
    
        public Trapesium(double sisi_atas, double sisi_bawah, double sisi_kanan, double sisi_kiri, double tinggi) {
            this.sisi_atas = sisi_atas;
            this.sisi_bawah = sisi_bawah;
            this.sisi_kanan = sisi_kanan;
            this.sisi_kiri = sisi_kiri;
            this.tinggi = tinggi;
        }
    
        double hitungLuas() {
            return ((sisi_atas + sisi_bawah) * tinggi) / 2;
        }
    
        double hitungKeliling() {
            return sisi_atas + sisi_bawah + sisi_kanan + sisi_kiri;
        }
    }