package HomeWork;

import java.util.Arrays;

public class hw7 {
    public static void main(String[] args) {


        Queshion_1();
        Queshion_2();
        Queshion_3();
        Queshion_4();
        Queshion_5();
    }

    static void Queshion_1() {

        // 1 Задание
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        int midlesum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        midlesum = sum / array.length;

        System.out.println(midlesum);
    }

    static void Queshion_2() {

        // 2 Задание.

        double[] array1 = {3.5, 5.2, -1.4, 7.8, 2.2};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
            if (array1[i] > max) {
                max = array1[i];
            }

        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);

    }


    static void Queshion_3() {


        char[] chars = {'a', 'B', 'i', 't', 'E', 'r'};
        int valueVowelLetter = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                valueVowelLetter++;
            }
        }
        System.out.println(valueVowelLetter);

    }

    static void Queshion_4() {
        // Задание 4
        String str = "Hello World This Is Java";

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = '_';
            }
        }
        System.out.println(charArray);
    }

    static void Queshion_5() {
        // Задачка 5

        String str = "apple,banana,grape,orange";
        String[] fruits = str.split(",");
        System.out.print(Arrays.toString(fruits));
    }
}