package assignment_07_01;

public abstract class Character{
    protected String name;
    protected int attackPower;
    protected String attackType;

    public String getAttackType() {
        return attackType;
    }

    public Character(String name, String attackType, int attackPower) {
        this.name = name;
        this.attackType = attackType;
        this.attackPower = attackPower;
    }

    public String getName() {
        return name;
    } 

    public void intro(){
        System.out.println("hero\t: " + getName());
    }

    abstract void attack();

    abstract void attack(String attackType );
}

class Fighter extends Character{

    public Fighter(String name, String attackType, int attackPower) {
        super(name, attackType, attackPower);
    }

    @Override
    void attack() {
        System.out.println("attack\t: " + attackPower);
    }

    @Override
    void attack(String attackType) {
        if (attackType == "melee") {
            System.out.println("attack\t: " + attackPower*2);
        }
        if (attackType == "ranged") {
            System.out.println("attack\t: " + attackPower);
        }
    }


}

class Mage extends Character{
    public Mage(String name, String attackType, int attackPower) {
        super(name, attackType, attackPower);
    }

    @Override
    void attack() {
        System.out.println("attack\t: " + attackPower);

    }

    @Override
    void attack(String attackType) {
        if (attackType == "fire") {
            System.out.println("attack\t: " + attackPower*3);
        }
        if (attackType == "frost") {
            System.out.println("attack\t: " + attackPower*2);
        }
    }

}

class Main{
    static void printAttack(Character character){
        character.attack();
        
    }
    public static void main(String[] args) {
        Character hero1 = new Fighter("jamal", "melee", 2);
        Character hero2 = new Fighter("bowo", "ranged", 2);
        Character hero3 = new Fighter("bonge", "melee", 2);
        Character hero4 = new Mage("jeje", "frost", 2);
        Character hero5 = new Mage("roy", "fire", 2);

        Character[] heroes = new Character[5];
        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;
        heroes[3] = hero4;
        heroes[4] = hero5;


        for (int i = 0; i < heroes.length; i++) {
            printAttack(heroes[i]);
            heroes[i].intro();
            heroes[i].attack();
            heroes[i].attack(heroes[i].getAttackType());
            System.out.println();
        }

    }
}
