import javax.sound.sampled.AudioFileFormat.Type;

public class Mage extends Character{
    private int attackPower;
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Mage(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;
    }

    @Override
    int attack(String attackType) {
        if(attackType.equalsIgnoreCase("fire")){
            return attackPower*3;
          } else if(attackType.equalsIgnoreCase("frost")){
            return attackPower*2;
          }else{
            return -1;
          }
    }
    
}
