package HomeWork.HomeWork.hw18;

public class BoxMain {
    public static void main(String[] args) {
        Box <String> box = new Box<>();
        Box <Integer> box1 = new Box<>();
        Box <Character> box2 = new Box<>();

        box.setData("Hello World");
        box1.setData(1);
        box2.setData('a');

        System.out.println(box.getData());
        System.out.println(box1.getData());
        System.out.println(box2.getData());


        System.out.println(box.isEmpty());
        System.out.println(box1.isEmpty());
        System.out.println(box2.isEmpty());

        box.clear();
        box1.clear();
        box2.clear();

        System.out.println(box.isEmpty());
        System.out.println(box1.isEmpty());
        System.out.println(box2.isEmpty());
    }
}
