package H071211014.Pertemuan_2;
public class Product {
    String id;
    String nama;
    int stok;
    int harga;

    Boolean isProductAvailable(){
        if(stok>0){
            return true;
        } else{
            return false;
        }

    } 

    void productDescription(){
        System.out.println("Id produk: "+ id);
        System.out.println("Nama produk: "+ nama);
        System.out.println("Harga: Rp."+ harga);
        System.out.println("Ketersediaan: "+isProductAvailable());
    }
}
