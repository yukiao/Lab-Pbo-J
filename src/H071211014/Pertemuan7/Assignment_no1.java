public class Assignment_no1 {
    public static void main(String[] args) {
        Character[] characters = new Character[5];
        characters[0] = new Fighter(2);
        characters[1] = new Mage(3);
        characters[2] = new Fighter(5);
        characters[3] = new Fighter(4);
        characters[4] = new Mage(12);

        for(Character character : characters){
            printAttack(character);
        }
    }

    private static void printAttack(Character character){
        System.out.println(character.attack());
        if (character instanceof Fighter){
            System.out.println(character.attack("melee"));
            System.out.println(character.attack("ranged"));
        }else if (character instanceof Mage){        
            System.out.println(character.attack("fire"));
            System.out.println(character.attack("frost"));
        }
    }
}
