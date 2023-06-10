package H071221038.Pertemuan_7;

abstract class Assignment_7_1 {
    
    private String name;

    public Assignment_7_1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract int attack(); 
    abstract int attack(String attackType);
}

class Fighter extends Assignment_7_1{

    private int attackPower;
    
    public Fighter(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if(attackType.equals("melee")){
            return this.attackPower*2;
        } else if(attackType.equals("ranged")){
            return this.attackPower;
        } else{
            return 0;
        }
    }
}

class Mage extends Assignment_7_1{
    
    private int attackPower;

    public Mage(String name, int attackPower) {
        super(name);
        this.attackPower = attackPower;
    }

    @Override
    public int attack() {
        return attackPower;
    }

    @Override
    public int attack(String attackType) {
        if(attackType.equals("fire")){
            return this.attackPower*3;
        } else if(attackType.equals("frost")){
            return this.attackPower*2;
        } else{
            return 0;
        }
    }
}

class Main1 {

    public static void main(String[] args){
        Assignment_7_1[] karakter = new Assignment_7_1[5];
        karakter[0] = new Fighter("Zilong", 30);
        karakter[1] = new Mage("Vale", 25);
        karakter[2] = new Fighter("Arloth", 15);
        karakter[3] = new Fighter("Martis", 40);
        karakter[4] = new Mage("Valir", 10);
        
        for(Assignment_7_1 character : karakter){
            printAttack(character);
        }
    }

    public static void printAttack(Assignment_7_1 characters){
        int melee = characters.attack("melee");
        int ranged = characters.attack("ranged");
        System.out.println("\n- " + characters.getName() + " memiliki attack power sebesar " + melee + " (melee) dan " + ranged + " (ranged)");

        int fire = characters.attack("fire");
        int frost = characters.attack("frost");
        System.out.println("- " + characters.getName() + " memiliki attack power sebesar " + fire + " (fire) dan " + frost + " (frost)\n");
    }
}