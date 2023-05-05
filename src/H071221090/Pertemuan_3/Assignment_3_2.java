package H071221090.Pertemuan_3;

class PlayerR{
    private String name;
    private int hp;
    private int attackPower;
    private int defense;
    
    //konstruktor
    public PlayerR(String name){}

    //method untuk menghitung PH pemain
    public void getDamage(PlayerR enemy) {
        hp= hp-Math.abs(enemy.getAttackPower()-defense); //
    }

    // Lengkapi constructor
    public PlayerR(String nama, int attack, int defense) {
        this.name = nama;
        this.attackPower = attack;
        this.defense = defense;
        hp = 100;
    }
    public PlayerR(String nama, int defense) {
        this.name = nama;
        this.defense = defense;
        hp = 100;

    }
     //method set
     public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

     public void status() {
    System.out.println(name + " status");
    System.out.println("HP = " + hp);
    System.out.println("Defense = " + defense);
    System.out.println("Attack = " + attackPower + "\n");
    }

    //method get dibuatkan spy bissa di pnggil di set yg di bawah
    int getAttackPower() {
    return attackPower;

    }
}
public class Assignment_3_2 {
    public static void main(String [] args) {
    PlayerR player1= new PlayerR("Mino", 30, 15);
    PlayerR player2= new PlayerR("Hilda", 10);

    player2.setAttackPower(35); 

    player1.getDamage(player2);

    player1.status();
    player2.status();
    }
}