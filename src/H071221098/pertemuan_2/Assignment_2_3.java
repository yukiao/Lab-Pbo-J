package H071221098.pertemuan_2;
class Produk{
    String id;  //ini atribut 
    String nama;
    int stok;
    int harga;
  
  
    public boolean  isAvailable(){ 
        if (stok > 0) {
          return true;
      
        } 
        return false;
    }


    public void displayProduk() {
      System.out.println("Nama produk : " + nama);
      System.out.println("ID Produk : " + id);
      System.out.println("Stok produk : " + stok);
      System.out.println("Harga produk : " + harga);
    if (isAvailable()){
      System.out.println ("Produk Tersedia");
      
    }
    else{
      System.out.println ("produk tidak tersedia");
    }
    }
  
  
    public String getId(){  
        return id;
    }
    public String getNama(){
        return nama;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
  }
  
  public class Assignment_2_3{
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        Produk produk2 = new Produk();
  
        produk1.id = "H0001";
        produk1.nama = "Baju kaos";
        produk1.stok = 1;
        produk1.harga = 50000;

        produk1.stok = produk1.getStok() - 1;
  
        produk2.id = "H0002";
        produk2.nama = "Celana pendek";
        produk2.stok = 12;
        produk2.harga = 35000;
  
        produk1.displayProduk();
        produk1.isAvailable();  //untuk pemanggilan
        System.out.println("");
        produk2.displayProduk(); 
        produk2.isAvailable();
        
  
    }
  }