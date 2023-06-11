// SOAL NO 1
package H071221090.Pertemuan_7;


abstract class Character {
    protected String name;

    Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack();
    abstract int attack(String attackType);
}

class Fighter extends Character {
    private int attackPower;

    Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if (attackType.equals("melee")) {
            return attackPower * 2;
        } else if (attackType.equals("ranged")) {
            return attackPower;
        } else {
            return 0;
        }
    }
}

class Mage extends Character {
    private int attackPower;

    Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if (attackType.equals("fire")) {
            return attackPower * 3;
        } else if (attackType.equals("frost")) {
            return attackPower * 2;
        } else {
            return 0;
        }
    }
}

public class Assignment_7_1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Imekda", 10);
        characters[1] = new Mage("Ainda", 8);
        characters[2] = new Fighter("wihanda", 12);
        characters[3] = new Fighter("Astrik", 15);
        characters[4] = new Mage("Puteri", 7);


        for (int i = 0; i<characters.length; i++) {
            printAttack(characters[i]);
        }
    }

    public static void printAttack(Character character) {
        System.out.println("Name: " + character.getName());
        System.out.println("Attack power: " + character.attack());
        System.out.println("Melee attack power: " + character.attack("melee"));
        System.out.println("Ranged attack power: " + character.attack("ranged"));
        System.out.println("Fire attack power: " + character.attack("fire"));
        System.out.println("Frost attack power: " + character.attack("frost"));
        System.out.println();
    }
}