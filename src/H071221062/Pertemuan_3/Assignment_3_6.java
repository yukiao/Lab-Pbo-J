package H071221062.Pertemuan_3;

import java.util.ArrayList;

class Assignment_3_6 { //CLASS STORE
    public String name;
    public ArrayList<Assignment_3_5> products;

    public Assignment_3_6(String name, ArrayList<Assignment_3_5> product) {
        this.name = name;
        this.products = product;
    }

    public void addProduct(Assignment_3_5 product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.printf("Selamat Datang di %s%n", this.name);
        System.out.println("Daftar Produk :");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i).getName() + " - Rp." + products.get(i).getPrice()
                    + " | stok " + products.get(i).getStock());
        }
    }

    public void buyProduct(Assignment_3_4 user, int productIndex) {
        Assignment_3_5 product = products.get(productIndex);
        if (user.getBalance() >= product.getPrice()) {
            user.setBalance(user.getBalance() - product.getPrice());
            product.sell();

            if (product.getStock() == 0) {
                products.remove(productIndex);
            }
            System.out.println(user.getName() + " berhasil membeli " + product.getName());
        } else {
            System.out.println("Maaf, saldo tidak cukup untuk membeli produk ini.");
        }
    }
}