package H071221041.Pertemuan_3;

class Player {
    //atribut class player
    private String name; 
    private int hp;
    private int attackPower;
    private int defense;

    //konstruktor
    public Player() {}

    //method untuk menghitung PH pemain
    public void getDemage(Player enemy) {
        this.hp = this.hp-Math.abs(enemy.getAttackPower()-defense); //math.abs digunakan untuk mengembalikan nilai absolute dari bilangan yg diberikan sbgai argumen (mnghilangkan tanda negatif)
    }

    //lngkpi

    public Player(String nama, int attack, int defense) {
        this.name = nama;
        this.attackPower = attack;
        this.defense = defense;
        hp = 100;
    }

    public Player(String nama, int defense) {
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

    //behavior
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    //method get
    int getAttackPower() {
        return attackPower;
    }
}

public class Assignment_3_2 {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        player2.setAttackPower(35);


        player1.getDemage(player2);

        player1.status();
        player2.status();
    }
}

