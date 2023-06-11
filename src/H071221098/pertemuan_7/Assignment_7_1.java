package H071221098.pertemuan_7;

package H071221098.pertemuan_7;
public abstract class Character{
    String name;
    public String getName() {
        return name;
    }
    int attackPower;
    String attackType;
 
    public Character(String name, int attackPower, String attackType) {
        this.name = name;
        this.attackPower = attackPower;
        this.attackType = attackType;
    }

    public String getAttackType() {
        return attackType;
    }


    abstract int attack();
    abstract int attack(String attackType);
    
}

class Fighter extends Character{

    public Fighter(String name, int attackPower, String attackType) {
        super(name, attackPower, attackType);

    }

    @Override
    int attack() {
        return attackPower;

    }

    @Override
    int attack(String attackType) {
        if (attackType == "melee") {
            return attackPower*2;
        

    }

        if (attackType == "ranged") {
            return attackPower;
 
        }

    return 0;

}
}

class Mage extends Character{

    public Mage(String name, int attackPower, String attackType) {
        super(name, attackPower, attackType);

    }

    @Override
    int attack() {
    return attackPower;
        
    }

    @Override
    int attack(String attackType) {
        if (attackType == "fire") {
            return attackPower*3;
        }
        
        if (attackType == "frost") {
           return attackPower*2;
        }
        return 0;
    }

}

