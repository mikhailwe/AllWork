package hw12;

import java.util.Random;

public class Player {
    private int stamina;
    public static int MAX_STAMINA = 10;
    public static int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public int getStamina() {
        return stamina;
    }

    public  void run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            if (stamina == MIN_STAMINA) {
                countPlayers--;
            }
        }
    }
    public static void info(){
    int a = 6 - countPlayers;
    if (countPlayers < 6) {
        System.out.println("На поле команды не полные  " + a + " осталось свободных мест ");
    }else {
        System.out.println("На поле нет свободных мест ");
    }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(){
        if (countPlayers < 6 ) {
            Random random = new Random();
            this.stamina = random.nextInt(3) + 8;
            countPlayers++;
        }
        else{
            System.out.println(" Игроков много на поле ");
        }
    }
}
