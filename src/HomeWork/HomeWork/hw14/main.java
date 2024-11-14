package HomeWork.HomeWork.hw14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class main {
    private static final int numElements = 1000000;
    private static final int numAttempts = 100000;
    private static Random random = new Random();

    public static void main(String[] args) {
        ArrayTest();
        LinkedTest();
    }

    static void ArrayTest(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();
        addElements(arrayList);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("Array List - " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < numAttempts; i++) {
            int randomIndex = random.nextInt(numElements);
            arrayList.get(randomIndex);
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Затраченное время ArrayList - " + elapsedTime);
    }

    static void LinkedTest(){
        LinkedList<Integer> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        addElements(linkedList);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println("LinkedList - " + elapsedTime);

        startTime = System.nanoTime();
        for (int i = 0; i < numAttempts; i++) {
            int randomIndex = random.nextInt(numElements);
            linkedList.get(randomIndex);
        }
        elapsedTime = System.nanoTime() - startTime;
        System.out.println("Затраченное время LinkedList - " + elapsedTime);
    }

    private static void addElements(List<Integer> list) {
        for (int i = 0; i < numElements; i++) {
            list.add(i);
        }
    }
}
