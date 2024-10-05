package HomeWork1;

public class mian {
    public static void main(String[] args) {
        System.out.println(Methods.square(6));

        System.out.println(Methods.printFullName("Михаил", "Горчаков"));

        System.out.println(Methods.cornerValuesArray(new String[]{"I like work for IT", "Hello world", "Very short", "asdq"}));
        System.out.println(Methods.cornerValuesArray(new int[]{55, 11, 5, 123, 87}));
        System.out.println(Methods.cornerValuesArray(new char[]{'a', 'v', 's', 'w'}));

    }
}

