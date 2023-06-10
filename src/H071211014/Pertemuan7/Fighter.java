public class Fighter extends Character {
    private int attackPower;
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Fighter(int attackPower) {
        this.attackPower = attackPower;
    }

    @Override
    int attack() {
        return attackPower;

    }

    @Override
    int attack(String attackType) {
      if(attackType.equalsIgnoreCase("melee")){
        return attackPower*2;
      } else if(attackType.equalsIgnoreCase("ranged")){
        return attackPower;
      }else{
        return -1;
      }
    }
    
}
