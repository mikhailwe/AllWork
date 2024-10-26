package hw11;

class Dog extends Animals {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Гав-гав");
    }
}
