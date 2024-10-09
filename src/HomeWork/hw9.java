package HomeWork;

import java.util.Arrays;


public class hw9 {
    public static void main(String[] args) {

        int[][] array = new int[3][3];
        int count = 1;

        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = count;
                count++;
            }
        for (int i = 0; i < array.length; i++) {
            int sumSting = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumSting += array[i][j];
            }
            System.out.println("Сумма строки - " + (i + 1) + ": " + sumSting);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            int sumPillar = 0;
            for (int j = 0; j < array[i].length; j++) {
                sumPillar += array[j][i];
            }
            System.out.println("Сумма столбца - " + (i + 1) + ": " + sumPillar);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        createCopy(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        ishod(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    static int[][] createCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        copy[0][0] = 5;
        copy[0][1] = 5;

        System.out.println("Измененная копия:");
        return original;
    }

    static int[][] ishod(int[][] original) {
        original[0][0] = 5;
        original[0][1] = 2;
        original[0][2] = 7;
        original[1][0] = 5;
        original[1][1] = 9;
        original[1][2] = 5;
        System.out.println("Исход:");
        return original;
    }
}
