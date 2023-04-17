package H071221009.Pertemuan_5;

import java.lang.Math;

public class BangunRuang {
        double hitungLuasPermukaan() {
            return hitungLuasPermukaan();
        }

        double hitungVolume() {
            return hitungVolume();
        }
    }
    
    class Kubus extends BangunRuang {
        private double sisi;
            
        public Kubus(double sisi) {
            this.sisi = sisi;
        }
    
        double hitungLuasPermukaan() {
            return sisi * sisi * 6;
        }
    
        double hitungVolume() {
            return sisi * sisi * sisi ;
        }
    }
    
    class Balok extends BangunRuang {
        private double panjang;
        private double lebar;
        private double tinggi;
    
        public Balok(double panjang, double lebar, double tinggi) {
            this.panjang = panjang;
            this.lebar = lebar;
            this.tinggi = tinggi;
        }
    
        double hitungLuasPermukaan() {
            return panjang * lebar + 2 * (lebar*tinggi) + 2 * (panjang * tinggi);
        }
    
        double hitungVolume() {
            return panjang * lebar * tinggi;
        }
    }
    
    class Bola extends BangunRuang {
        private double jari_jari;
        
    
        public Bola(double jari_jari) {
            this.jari_jari = jari_jari;
            
        }
    
        double hitungLuasPermukaan() {
            return 4 * Math.PI * jari_jari * jari_jari;
        }
    
        double hitungVolume() {
            return (4/3) * Math.PI * jari_jari * jari_jari * jari_jari;
        }
    }
    
    class Tabung extends BangunRuang {
        private double jari_jari;
        private double tinggi;
    
        public Tabung(double jari_jari, double tinggi) {
            this.jari_jari = jari_jari;
            this.tinggi = tinggi;
        }
    
        double hitungLuasPermukaan() {
            return 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        }
    
        double hitungVolume() {
            return Math.PI * jari_jari * jari_jari * tinggi;
        }
    }