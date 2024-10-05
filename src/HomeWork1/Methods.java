package HomeWork1;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {

    }

    /** Javadoc
     * Метод для вычисления квадрата из принимаемого числа из другого класса.
     * @param number тип переменной
     * @return возвращает корень числа int
     */
    static int square(int number) {
        return number * number;
    }

    /** Javadoc
     *
     * @param name  тип переменной "Имя"
     * @param surname тип переменной "Фамилия"
     * @return
     */

    static String printFullName(String name, String surname) {
        return name + " " + surname;
    }

    /** Javadoc
     *
     * @param word это массив строк (varargs).
     * @return это строка, представляющая массив с коротким и длинным словом.
     */

    static String cornerValuesArray(String... word) {
        String longWord = word[0];
        String shortWord = word[0];
        for (String str : word) {
            if (str.length() < shortWord.length()) {
                shortWord = str;
            }
            if (str.length() > longWord.length()) {
                longWord = str;
            }
        }
        String[] shWordAndLoWord = {shortWord, longWord};
        return Arrays.toString(shWordAndLoWord);
    }

    /** Javadoc
     *
     * @param numbers varargs и тип переменной Numbers массив целых чисел, из которого будут рассчитаны минимальное и максимальное значения.
     * @return возвращает инт значение. строковое представление массива, содержащего минимальное и максимальное значения.
     */

    static String cornerValuesArray(int... numbers) {
    int min = numbers[0];
    int max = numbers[0];
    for (int i=0; i<numbers.length; i++) {
        if (numbers[i] < min) {
            min = numbers[i];
        }
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    int[] result = new int[]{min,max};
    return Arrays.toString(result);
    }

    /** Javadoc
     * Находит минимальный и максимальный символы в заданном массиве символов.
     * @param word varargs и тип переменной
     * @return Строковое представление массива, содержащего минимальный и максимальный символы.
     */

    static String cornerValuesArray(char... word) {
        char min = word[0];
        char max = word[0];
        for (int i=0; i<word.length; i++) {
            if (word[i] < min) {
                min = word[i];
            }
            if (word[i] > max) {
                max = word[i];
            }
        }
        char[] result1 = new char[]{min,max};
        return Arrays.toString(result1);
    }
}
