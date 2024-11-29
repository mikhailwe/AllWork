package HomeWork.HomeWork.hw19;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Linktusk {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        LinkedHashSet<String> result = getOrderedUniqueElements(words);
        System.out.println(result);
    }

    public static LinkedHashSet<String> getOrderedUniqueElements(String[] words) {
        LinkedHashSet<String> result = new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));
        return result;
    }
}
