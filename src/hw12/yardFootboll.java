package hw12;

public class yardFootboll {
    public static void main(String[] args) {

        Player player = new Player();
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        player3.run();
        Player player4 = new Player();
        Player.info();
        Player player5 = new Player();
        Player player6 = new Player();
        Player.info();
        System.out.println(Player.getCountPlayers());
        while (player2.getStamina()>0){
            player2.run();
        }
        System.out.println("Усталось игрока - " + player2.getStamina());
        System.out.println("Количество игроков на поле " + Player.getCountPlayers());
    }
}
