package hw11;

class Cat extends Animals{
    public Cat(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Мяу");
    }
}
