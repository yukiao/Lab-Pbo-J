package Pertemuan_3;
public class Player {
    private String name;
    private int hp = 100;
    private int attackPower;
    private int defense;


    public Player(String name, int attackPower, int defense){
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
    }

    public Player(String name, int defense){
        this.name = name;
        this.defense = defense;
    }

    public void getDamage(Player enemy){
        hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }

    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }



    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = "+ defense);
        System.out.println("Attack = "+ attackPower + "\n");
    }

    int getAttackPower() {
        return attackPower;
    }
}
