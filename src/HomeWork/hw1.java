package HomeWork;

import java.util.Random;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        //1 задание


        Scanner sc = new Scanner(System.in);


        System.out.print("Введите общеее число отзывов: ");
        int allFeedbackCount = sc.nextInt();


        System.out.print("Введите число хороших отзывов: ");
        int goodFeedbackCount = sc.nextInt();


        System.out.print("Введите число плохих отзывов: ");
        int badFeedbackCount = sc.nextInt();

        System.out.print("Введите число нейтральных отзывов: ");
        int neutralFeedbackCount = sc.nextInt();


        double goodFeedbackPercent = goodFeedbackCount * 100.0 / allFeedbackCount;
        double badFeedbackPercent = badFeedbackCount * 100.0 / allFeedbackCount;
        double neutralFeedbackPercent = neutralFeedbackCount * 100.0 / allFeedbackCount;
        int goodFeedbackPercentInt = (int) Math.round(goodFeedbackPercent);
        int badFeedbackPercentInt = (int) Math.round(badFeedbackPercent);
        int neutralFeedbackPercentInt = (int) Math.round(neutralFeedbackPercent);
        System.out.println("Всего отзывов - " + allFeedbackCount +
                "\nХороших отзывов (double) - " + goodFeedbackPercent + "%" +
                "\nПлохих отзывов (double) - " + badFeedbackPercent + "%" +
                "\nНейтральных отзывов (double) - " + neutralFeedbackPercent + "%" +
                "\nХороших отзывов (int) - " + goodFeedbackPercentInt + "%" +
                "\nПлохих отзывов (int) - " + badFeedbackPercentInt + "%" +
                "\nНейтральных отзывов (int) - " + neutralFeedbackPercentInt + "%");
        sc.close();


        // 2 Задание

        Random random = new Random();


        int a = random.nextInt(Math.round(1000));
        int b = random.nextInt(Math.round(1000));
        int c = random.nextInt(Math.round(1000));
        int q = random.nextInt(Math.round(1000));

        char translateA = (char) ('0' + a);
        char translateB = (char) ('0' + b);
        char translateC = (char) ('0' + c);
        char translateQ = (char) ('0' + q);
        System.out.print(translateA);
        System.out.print(translateB);
        System.out.print(translateC);
        System.out.print(translateQ);


        // 3 задание.
        long myLong = 5223375076854775806L;
        int myInt = 2147483647;
        myInt += 20;
        System.out.println("myInt - " + myInt);


    }
}
