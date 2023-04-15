package H071221009.Pertemuan_3;

public class User {
    String name; // attribute
    int balance;

    public User(String name, int balance) { // constructor
        this.name = name;
        this.balance = balance;
    }

    String getName() { // method getter
        return name;
    }
    int getBalance() { // get
        return balance;
    }
    public void setBalance(int balance) { // set
        this.balance = balance;
    }

    public void showInfo() { // behavior utk menampilkan nama dan detail uang user
        System.out.println("---------------CARD---------------");
        System.out.println(name);
        System.out.println(balance);
        System.out.println("----------------------------------");
    }
}