package hw11;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Барбос");
        Cat cat = new Cat("Мурзик");
        Bird bird = new Bird("Голубь", true);
        Dog dog2 = new Dog("Бобик");
        Cat cat2 = new Cat("Барсик");
        Bird bird2 = new Bird("Кеша", false);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();

        Animals[] animals = {dog, cat, bird, cat2, bird2, dog2};
        for (Animals animal : animals) {
            animal.makeSound();
            animal.move();
            if (animal instanceof Pet) {
                Pet pet = (Pet) animal;
                pet.play();
                pet.beFriendly();
            }
            System.out.println();
        }
    }
}