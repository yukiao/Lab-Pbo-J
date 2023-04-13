import java.util.Scanner;

public class Assignment_3_3 {
    public static void main(String[] args) {
        User user = new User("Attar", 1000000);
        Store store = new Store("Sisfo Store");
        Product product1 = new Product("Baju kemeja", 100000, 20);
        Product product2 = new Product("Celana jeans", "80k", 15);
        Product product3 = new Product("Sepatu", "200k", 15);
        Product product4 = new Product("Baju kaos", "50k", 30);
        Product product5 = new Product("Topi", "70k", 20);
        Product product6 = new Product("Jaket", "100k", 1);
        Product product7 = new Product("Jersey Barca","1500k" , 11);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);
        store.addProduct(product5);
        store.addProduct(product6);
        store.addProduct(product7);
        
        Scanner scanner = new Scanner(System.in);
        while (true){
            user.showCard();
            store.showProducts();
            System.out.print("Pilihan Opsi: ");
            int selectedProductIndex = scanner.nextInt();
            if (selectedProductIndex == 0){
                break;
            }
            
            store.showConfirmation(selectedProductIndex-1);
            int confirmationIndex = scanner.nextInt();
            if (confirmationIndex == 1){
                store.transaction(user, selectedProductIndex-1);
                store.showFinishedTransaction();
                int continueTransactionIndex = scanner.nextInt();
                if (continueTransactionIndex == 2){
                    break;
                }
            } else if (confirmationIndex == 2){
                continue;
            }
            System.out.println();
        }
        scanner.close();
    }
}

