package HomeWork.HomeWork.hw20;

public class MainPrint {
    public static void main(String[] args) {
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("Hello World");
        Printer printer2 = message -> System.out.println(message);
        printer2.print("Hello World");

        Printer printer3 = message ->  {
            System.out.println(message);
            System.out.println(message.length());
        };
        printer3.print("Hello World");
    }
}
