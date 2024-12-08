package HomeWork.HomeWork.hw18;

public class CarNotFount {
    private String Name;
    private String color;

    public CarNotFount(String Name, String color) {
        this.Name = Name;
        this.color = color;
    }

    public String getCarName() {
        return Name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return Name + color;
    }
}
