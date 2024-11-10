package HomeWork.HomeWork.hw12;

public class yardFootboll {
    public static void main(String[] args) {

        Game game = new Game();
        game.PlayersAdd("Vasiliy");
        game.PlayersAdd("Ivan");
        game.PlayersAdd("Petr");
        Game.info();
        game.PlayersAdd("Mikle");
        game.PlayersAdd("Josh");
        game.PlayersAdd("Messi");
        game.PlayersAdd("Samozvanetc");
        game.getPlayer();

        System.out.println(game.hasPlayers("Ivan"));
        game.runPlayers("Ivan", 10);
        game.runPlayers("Petr", 10);
        game.info();
        game.getPlayer();
    }
}
