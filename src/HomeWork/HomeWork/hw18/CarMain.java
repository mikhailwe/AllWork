package HomeWork.HomeWork.hw18;

import java.util.ArrayList;
import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        CarList carList = new CarList();
        try {
            CarNotFount car1 = carList.getCar("Car2","green");
            System.out.println(car1);
        }catch (CarNotFoundException e){
            System.out.println(e.getMessage());
        }
        CarNotFount car1 =  carList.getCar("Car 1", "Blue");
        System.out.println(carList);
    }
}
