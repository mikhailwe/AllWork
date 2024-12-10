package HomeWork.HomeWork.hw20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class fruckt {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");
        List<String> result = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length()>4)
                .sorted((word1,word2) -> Integer.compare(word1.length(),word2.length()))
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
