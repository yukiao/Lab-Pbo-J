import java.util.ArrayList;

public class Store {
    String name; 
    ArrayList<Product> products; 

    public Store(String name){
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void showProducts(){
        System.out.println("Selamat Datang di "+ name);
        System.out.println("Daftar Produk:");
        int index = 1;
        for (Product product : products) {
            System.out.printf("%d. %s - Rp%d | Stock %d\n", index, product.name, product.price, product.stock);
            index++; 
        }
        System.out.println("0. Keluar");
    
    }

    public void transaction(User user, int index){
        Product product = products.get(index);
        if (user.getBalance() >= product.getPrice()){
            user.balance = user.getBalance() - product.getPrice();
            product.stock = product.stock - 1;  
            if (product.stock <= 0){
                products.remove(product);
            } 
            System.out.println(user.getName()+ " berhasil membeli " + product.getName());
        } else{
            System.out.println("Maaf uang anda tidak cukup untuk membeli barang ini");
        }   
    }

    public void showConfirmation(int index){
        Product product = products.get(index);
        System.out.println("Apakah anda yakin ingin membeli: ");
        System.out.println(product.getName()+ ", dengan harga Rp"+ product.getPrice());
        System.out.println("1. Konfirmasi");
        System.out.println("2. Batal");
    }

    public void showFinishedTransaction(){
        System.out.println("--------------------");
        System.out.println("Lanjutkan transaksi?");
        System.out.println("1. Ya");
        System.out.println("2. Tidak");
    }
}

