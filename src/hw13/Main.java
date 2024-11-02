package hw13;

public class Main {
    public static void main(String[] args) {

        House house1 = new House.Builder()
            .floors(3)
            .rooms(6)
            .hasGarage(true)
            .build();
        System.out.println(house1);

        House house2 = new House.Builder()
                .floors(2)
                .rooms(4)
                .hasGarage(false)
                .build();
        System.out.println(house2);
    }
}
