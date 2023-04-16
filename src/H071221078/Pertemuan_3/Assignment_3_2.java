package H071221078.Pertemuan_3;

public class Assignment_3_2 {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);
        
        player2.setAttackPower(35);

        player1.getDamage(player2);

        player1.status();
        player2.status();
    }
}

class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player() {}

    // melengkapi costructor yang menerima 2 parameter
    public Player(String name, int defense) {
        this.name = name;
        this.defense = defense;
        this.hp = 100;
    }
    // melengkapi constructor yang menerima 3 parameter
    public Player (String name, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        this.hp = 100;
    }
    // behavior mengurangi hp sebesar nilai mutlak dari damage enemy dikurang defense objek yang menerima serangan
    public void getDamage(Player enemy) {
        hp = hp-Math.abs(enemy.getAttackPower()-defense);
    }

    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    // melengkapi method setter untuk atribut attackPower seperti yang dipanggil pada method main
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }
}