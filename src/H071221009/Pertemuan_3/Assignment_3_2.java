package H071221009.Pertemuan_3;

public class Assignment_3_2 {
    public static void main(String [] args) {
        
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        player2.setAttackPower(35);

        player1.getDamage(player2);
    
        player1.status();
        player2.status();
    } 
}