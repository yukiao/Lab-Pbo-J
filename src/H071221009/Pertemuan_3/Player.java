package H071221009.Pertemuan_3;

public class Player {
    private String name;
    private int hp;
    private int attackPower; // attribute
    private int defense;

    public Player(){} // constructor kosong

    public void getDamage(Player enemy) { // behavior getdemage / enemy musuh
        hp= hp-Math.abs(enemy.getAttackPower()-defense); // hp healthpoint 
        // method math.abs utk mengembalikan nilai positif dari negatif
    }
        
    public Player(String name, int attackPower, int defense){ // constructor player1
        this.name = name;
        this.attackPower = attackPower; // lengkapi
        this.defense = defense;
        hp = 100; // nilai hp di inisialisasi memang
    }
    public Player(String name, int defense){ // constructor player2
        this.name = name;
        this.defense = defense; // lengkapi
        hp = 100;
    }

    public void setName(String name) { // lengkapi
        this.name = name;
    }
    public void setHp(int hp) { // lengkapi
        this.hp = hp;
    }
    public void setAttackPower(int attackPower) { // lengkapi
        this.attackPower = attackPower;
    }
    public void setDefense(int defense) { // lengkapi
        this.defense = defense;
    }

    public void status() { // behavior status
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    int getAttackPower() { 
        return attackPower;
    }
}