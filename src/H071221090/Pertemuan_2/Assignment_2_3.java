package H071221090.Pertemuan_2;

class Produk{
  String id; 
  String nama;
  int stock;
  int harga;

  public void apakahTersedia(){ 
      if (stock > 0) {
        System.out.println("Tersedia");
    
      } else {
        System.out.println("Tidak tersedia");
      }
  }
  public void barang() {
    System.out.println("Nama : " + nama);
    System.out.println("ID : " + id);
    System.out.println("Stock : " + stock);
    System.out.println("Harga : " + harga);
    System.out.println("");

  }

  public String getId(){  
      return id;
  }
  public String getNama(){
      return nama;
  }
  public int getStock(){
      return stock;
  }
  public int getHarga(){
      return harga;
  }
}
 class Assignment_2_3 {
  public static void main(String[] args) {
      Produk p1 = new Produk();
      Produk p2 = new Produk();

      p1.id = "1";
      p1.nama = "Tunik";
      p1.stock = 20;
      p1.harga = 49000;

      p2.id = "2";
      p2.nama = "Dress";
      p2.stock = 0;
      p2.harga = 100000;

      
      p1.apakahTersedia();  //untuk pemanggilan behavior
      p1.barang();
      p2.apakahTersedia();
      p2.barang();

  }
}


