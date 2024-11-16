package HomeWork.HomeWork.hw15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Lada", 2024, "Black"));
        cars.add(new Car("Lada", 2024, "White"));
        cars.add(new Car("Lada", 2024, "Red"));
        cars.add(new Car("Lada", 2023, "Gray"));
        cars.add(new Car("Volga", 2024, "Black"));
        cars.add(new Car("Volga", 2023, "White"));
        cars.add(new Car("Volga", 2022, "Red"));
        cars.add(new Car("Audi", 2020, "Red"));


        // Сортируем список
        Collections.sort(cars);

        // Выводим отсортированный список
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
