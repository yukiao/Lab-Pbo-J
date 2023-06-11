package H071221098.pertemuan_7;

public class Main {
    static void printAttack(Character character){ //overloading
        System.out.println("nama: " + character.getName());
        character.attack();
        System.out.println("attack power: "+character.attack());
        character.attack(character.getAttackType());
        System.out.println("attack type: "+ character.getAttackType());
        System.out.println("=".repeat(25));
    }
    public static void main(String[] args) {

        // Character fighter1 = new Fighter("Kian santang", 2, "melee");
        // Character fighter2 = new Fighter("boboiboy", 3, "ranged");
        // Character fighter3 = new Fighter("Rafli Dahlan", 100, "melee");

        // Character mage1 = new Mage("nur", 5, "frost");
        // Character mage2 = new Mage("meimei", 5, "fire");

        // Character[] player = new Character[5];
        // player[0] = fighter1;
        // player[1] = fighter2;
        // player[2] = fighter3;
        // player[3] = mage1;
        // player[4] = mage2;

        Character[] player = new Character[5];
        player[0] = new Fighter("a", 2, "melee");
        player[1] = new Fighter("b", 4, "ranged");
        player[2] = new Mage("c", 2, "fire");
        player[3] = new Fighter("d", 6, "melee");
        player[4] = new Mage("e", 4, "frost");

        for (int i = 0; i < player.length; i++) {
            printAttack(player[i]);
        }
}

}
