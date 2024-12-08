package HomeWork.HomeWork.hw18;

public class trulyly {
    public static void main(String[] args) {
        try {
            double result1 = divide(10, 2);
            System.out.println(result1);

            double result2 = divide(10, 0);
            System.out.println(result2);
        } catch (ArithmeticException e) {
            System.out.println("На нуль нельзя");
        }
        System.out.println(divide1(10,0));

    }
    public static double divide(int a, int b){
        return a/b;
    }


    public static double divide1(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("На нуль нельзя");
            return 0;
        }
    }
}

