package HomeWork.HomeWork.hw13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        House house1 = new House.Builder()
                .floors(1)
                .rooms(2)
                .hasGarage(true)
                .build();
        System.out.println(house1);

        House house2 = new House.Builder()
                .floors(2)
                .rooms(4)
                .hasGarage(false)
                .build();
        System.out.println(house2);

        House house3 = new House.Builder()
                .floors(4)
                .rooms(12)
                .hasGarage(true)
                .build();
        System.out.println(house3);

        House house4 = new House.Builder()
                .floors(1)
                .rooms(2)
                .hasGarage(false)
                .build();
        System.out.println(house4);

        List<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        System.out.println("Есть первый дом? -  " + houses.contains(house1));
        System.out.println("Есть второй дом? - " + houses.contains(house2));
        System.out.println("Индекс house 2 - " + houses.indexOf(house2));
        System.out.println("Индекс house 3 - " + houses.indexOf(house3));

        System.out.println(house1.equals(house4));
        System.out.println(house1.equals(house3));
    }
}
