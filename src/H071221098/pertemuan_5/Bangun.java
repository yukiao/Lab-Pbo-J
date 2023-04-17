package H071221098.pertemuan_5;
public class Bangun {
}
class Kubus extends Bangun {
    int sisi;
    int getvolumekubus() {
        return sisi*sisi*sisi;
    }
    int getluasPermukaankubus() {
        return 6*(sisi*sisi);
    } 
}
class Balok extends Bangun {
    int panjang;
    int lebar;
    int tinggi;

    int getvolumebalok() {
        return panjang*lebar*tinggi;
    }
    int getluasPermukaanbalok() {
        return 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
}
class Bola extends Bangun {
    int jari;
    double getvolumebola() {
        return 4*Math.PI*(jari*jari);
    }
    double getluasPermukaanbola() {
        return (4/3)*Math.PI*(jari*jari*jari);
    }
}
class Tabung extends Bangun {
    int jari;
    int tinggi;

    double getvolumetabung() {
        return Math.PI*(jari*jari)*tinggi;
    }
    double getluasPermukaantabung() {
        return (2*Math.PI*jari*tinggi) + (2*Math.PI*(jari*jari));
    }
}
class Persegi extends Bangun {
    int sisi;

    int getluasgpersegi() {
        return sisi*sisi;
    }
    int getkelilingpersegi() {
        return 4*sisi;
    }
}
class persegiPanjang extends Bangun {
    int panjang;
    int lebar;

    int getluaspersegiPanjang() {
        return panjang*lebar;
    }
    int getkelilingpersegiPanjang() {
        return 2*(panjang+lebar);
    }
}
class Lingkaran extends Bangun {
    int jari;

    double getluaslingkaran() {
        return Math.PI*(jari*jari);
    }
    double getkelilinglingkaran() {
        return 2*Math.PI*jari;
    }
}
class Segitiga extends Bangun {
    int alas;
    int tinggi;
    int sisi;

    int getluassegitiga() {
        return 1/2*(alas*tinggi);
    }
    int getkelilingsegitiga() {
        return 3*sisi;
    }
}
class Trapesium extends Bangun {
    int alas1;
    int alas2;
    int tinggi;
    int rusuk1;
    int rusuk2;

    int getluastrapesium() {
        return 1/2*(alas1+alas2)*tinggi;
    }
    int getkelilingtrapesium() {
        return rusuk1+rusuk2+alas1+alas2;
    }
}
