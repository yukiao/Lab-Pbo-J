public class Anggota {
    String nama;
    String jabatan;
        
        public Anggota(String nama, String jabatan) {
            this.nama = nama;
            this.jabatan = jabatan;
        }
        
        public void tampilkanInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Jabatan: " + jabatan);
        }
    }   
