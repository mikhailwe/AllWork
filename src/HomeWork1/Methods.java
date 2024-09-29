package HomeWork1;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
//        0. Создайте новый класс Methods и все методы делайте в нём (методы должны быть статическими),
//        а вызывать их надо из метода main, как обычно (как мы делали с Calculator на занятии).
//        Т.е. нужно каждый метод вызвать с разными параметрами, чтобы проверить их работу.

//                Обращайте внимание на хорошие названия переменных, методов и параметров методов, а также на форматирование кода
//                (применяйте автоформат)
//        1. Создайте метод square, который принимает одно целое число и возвращает его квадрат, затем вызовите его с разными значениями
//        и выведите результат
//        2. Создайте метод printFullName, который принимает два параметра типа String — имя и фамилию — и выводит полное имя в формате:
//        "Full name: Имя Фамилия"
//        3. Создайте метод cornerValuesArray, который принимает массив строк, а возвращает массив строк из двух элементов –
//        самая короткая и самая длинная строка в исходном массиве
    }

    static int square(int number) {

        return number * number;
    }
    static String printFullName(String name, String surname) {
        return name + " " + surname;
    }
    static String cornerValuesArray(String[] word){
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
}

