package HomeWork.HomeWork.hw15;

public class Car implements Comparable<Car> {

    private String name;
    private int year;
    private String color;

    public Car(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        int name = this.name.compareTo(o.name);
        if (name != 0) {
            return name;
        }
        int year = Integer.compare(o.year, this.year);
        if (year != 0) {
            return year;
        }
        return this.color.compareTo(o.color);
    }
}
