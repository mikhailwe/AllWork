package HomeWork.HomeWork.hw18;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private List<CarNotFount> cars;
    public CarList() {
        this.cars = new ArrayList<>();
    }

    public void addCar(CarNotFount car) {
        cars.add(car);
    }
    public CarNotFount getCar(String name, String color) {
        for (CarNotFount car : cars) {
            if (car.getCarName().equals(name) && car.getColor().equals(color)) {
                return car;
            }
        }
        throw new CarNotFoundException("Машины нет");
    }
}

