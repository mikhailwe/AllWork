package HomeWork;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        //1 задание

        Scanner scanner = new Scanner(System.in);
        // Шаг 1: Взять кружку
        System.out.println("Взяли кружку.");

        // Шаг 2: Добавить кофе в кружку
        System.out.println("Добавили кофе в кружку.");

        // Шаг 3: Добавить сахар?
        System.out.print("Добавить сахар? (да/нет): ");
        String addSugar = scanner.nextLine();

        if (addSugar.equals("да")) {
            System.out.println("Добавили сахар.");
        }

        // Шаг 4: Кипятим воду
        boolean isWaterBoiled = false;
        while (!isWaterBoiled) {
            System.out.print("Вода вскипела? (да/нет): ");
            String waterBoiled = scanner.nextLine();

            if (waterBoiled.equals("да")) {
                isWaterBoiled = true;
                System.out.println("Заливаем воду в кружку.");
            } else {
                System.out.println("Кипятим чайник заново.");
            }
        }

        // Шаг 5: Добавить молоко/сливки?
        System.out.print("Добавить молоко или сливки? (да/нет): ");
        String addMilk = scanner.nextLine();

        if (addMilk.equals("да")) {
            System.out.println("Добавили молоко или сливки.");
        }

        // Шаг 6: Перемешиваем содержимое.
        System.out.println("Перемешиваем содержимое.");

        // Шаг 7: Готово, можно пить кофе!
        System.out.println("Готово, можно пить кофе!");

        scanner.close();


    }
}
