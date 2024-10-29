package hw11;

public class Bird extends Animals{
    private boolean canFly;

    public Bird(String name,boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "  Чирик-чирик");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println(getName() + " летает.");
        } else {
            System.out.println(getName() + " передвигается по земле.");
        }
    }
}
