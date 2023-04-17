package H071211014.Pertemuan_3;
public class User {
    String name; 
    int balance; 

    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public void showCard(){
        System.out.println("---------Card----------");
        System.out.println(name);
        System.out.println("Rp"+balance);
        System.out.println("-----------------------");
    }

}
