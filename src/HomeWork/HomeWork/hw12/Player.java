package HomeWork.HomeWork.hw12;

import java.util.Random;

public class Player {
    private int stamina;
    public static int MAX_STAMINA = 10;
    public static int MIN_STAMINA = 0;
    private String name;
    Random rand = new Random();

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public boolean run() {
        if (stamina > MIN_STAMINA) {
            stamina--;
            System.out.println(name + "stamina: " + stamina);
            return stamina > MIN_STAMINA;
        } else {
            System.out.println(name + "stamina = 0 ");
            return false;
        }
    }

    public Player(String name) {
        this.name = name;
        this.stamina = rand.nextInt(8, MAX_STAMINA + 1);
    }
}

