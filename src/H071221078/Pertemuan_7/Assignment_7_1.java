package H071221078.Pertemuan_7;

public class Assignment_7_1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter("Alucard", 200);
        characters[1] = new Mage("Harley", 300);
        characters[2] = new Fighter("Gatot", 100);
        characters[3] = new Fighter("Masha", 110);
        characters[4] = new Mage("Valir", 180);

        for ( int i = 0; i < characters.length; i++) {
            printAttack(characters[i]);
        }
    }

    static void printAttack(Character character) {
        System.out.println("=".repeat(50));
        System.out.println("Role         : " + character.getClass());
        System.out.println("Nama         : " + character.getName());
        System.out.println("Attack Power : " + character.attack());
    }
}
abstract class Character {
    public String name;
    public int attackPower;

    public Character(String name, int attackPower) {
        this.name = name;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    }

    int attack() {
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
        if (attackType.toLowerCase().equals("melee")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("ranged")) {
            return attackPower;
        }
        return attackPower;
    }
}

class Mage extends Character {

    public Mage(String name, int attackPower) {
        super(name, attackPower);
    }

    @Override
    int attack(String attackType) {
        if (attackType.toLowerCase().equals("frost")) {
            return attackPower * 2;
        } else if (attackType.toLowerCase().equals("fire")) {
            return attackPower * 3;
        }
        return attackPower;
    }
}