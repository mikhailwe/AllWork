package HomeWork.HomeWork.hw12;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();
    private static int countPlayers = 0;
    private static int MAX_COUNT = 6;

    public void PlayersAdd(String name) {
        if (countPlayers < MAX_COUNT) {
            Player newPlayer = new Player(name);
            players.add(newPlayer);
            countPlayers++;
            System.out.println(name);
        } else {
            System.out.println("я не добавлю нового игрока");
        }
    }

    public boolean hasPlayers(String name) {
        System.out.print("Проверка наличия игрока ");
        for (Player player : players) {
            if (player.getName().equals(name)) {
                System.out.print(name + ": ");
                return true;
            }
        }
        System.out.print(name + ": ");
        return false;
    }

    public void getPlayer() {
        if (players.isEmpty()) {
            System.out.println("На поле пусто");
        } else {
            System.out.println("На поле уже:");
            for (Player player : players) {
                System.out.println("имя: " + player.getName() + ", выносливость: " + player.getStamina());
            }
        }
    }

    public static void info() {
        int a = MAX_COUNT - countPlayers;
        if (countPlayers < MAX_COUNT) {
            System.out.println("На поле команды не полные  " + a + " осталось свободных мест ");
        } else {
            System.out.println("На поле нет свободных мест ");
        }
    }

    public void removePlayer(Player player) {
        if (players.remove(player)) {
            countPlayers--;
            System.out.println(player.getName() + " Player delete ");
        } else {
            System.out.println(player.getName() + " Player non List: ");
        }
    }

    public void runPlayers(String name, int time) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                for (int i = 0; i < time; i++) {
                    if (!player.run()) {
                        removePlayer(player);
                        break;
                    }
                }
                return;
            }
        }
        System.out.println(name + " Не существует");
    }
}
