package hw11;

public class Cat extends Animals implements Pet{
    public Cat(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }
    @Override
    public void move() {
        System.out.println(getName() + " прыгает.");
    }

    @Override
    public void play() {
        System.out.println(getName() + " играет с мышкой.");
    }

    @Override
    public void beFriendly() {
        System.out.println(getName() + " мурчит.");
    }
}
