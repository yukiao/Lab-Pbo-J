package H071221009.Pertemuan_7;

abstract class Character { // class abstract
    private String name;
    protected int  attackPower;
    
    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    public int attack() {
        return attackPower;
    }

    abstract int attack(String attackType);
}

class Fighter extends Character {

    public Fighter(String name, int attackPower) {
        super(name, attackPower);
        
    }

    @Override
    int attack(String attackType) {
        if(attackType.equals("melee")) {
            return this.attackPower * 2;
        } else if(attackType.equals("ranged")) {
            return this.attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    
    public Mage(String name, int attackPower) {
        super(name, attackPower);
       
    }

    @Override
    int attack(String attackType) {
        if(attackType.equals("fire")) {
            return this.attackPower * 3;
        } else if(attackType.equals("frost")) {
            return this.attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class Assignment_7_1 {
    public static void main(String[] args) {
        Character[] character = new Character[5];
        character[0] = new Fighter("Jin", 50);
        character[1] = new Mage("Suga", 40);
        character[2] = new Fighter("V", 30);
        character[3] = new Fighter("Jimin", 20);
        character[4] = new Mage("Jhope", 10);

        for(Character characters : character) { // for loop untuk mengiterasi array di atas
            printAttack(characters);
        }
    }

    public static void printAttack(Character character) {
        if(character instanceof Fighter) {
            int melee = character.attack("melee");
            int ranged = character.attack("ranged");
            System.out.println(character.getName() + " have attack power is " + melee + " (melee) dan " + ranged + " (ranged)");
        } else if(character instanceof Mage) {
            int fire = character.attack("fire");
            int frost = character.attack("frost");
            System.out.println(character.getName() + " have attack power is " + fire + " (fire) and " + frost + " (frost)");
        } else {
            System.out.println("Invalid");
        }
    }
}