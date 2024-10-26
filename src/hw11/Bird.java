package hw11;

class Bird extends Animals{
    private boolean canFly;

    public Bird(String name,boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " говорит: Чирик-чирик");
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
