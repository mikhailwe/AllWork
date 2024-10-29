package hw11;

public class Dog extends Animals implements Pet {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }

    @Override
    public void move() {
        System.out.println(getName() + " бегает.");
    }

    @Override
    public void play() {
        System.out.println(getName() + "играет с мячом.");
    }
    @Override
    public void beFriendly(){
        System.out.println(getName() + " виляет хвостом.");
    }
}
