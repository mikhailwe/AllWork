package HomeWork.HomeWork.hw19;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeeeeeSet {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 35;
        int[] result = findClosestNumbers(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findClosestNumbers(int[] numbers, int target) {
        TreeSet<Integer> number = new TreeSet<>();
        for (int i : numbers) {
            number.add(i);
        }
        Integer lower = number.lower(target);
        Integer higher = number.higher(target);
        if (lower != null && higher != null) {
            return new int[]{lower, higher};
        }
        return null;
    }
}

