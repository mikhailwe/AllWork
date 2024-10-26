package hw11;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Животное издаёт звук");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
