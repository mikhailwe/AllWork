package HomeWork.HomeWork.hw17;

import java.util.HashMap;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) {
        String str = "!!! Java is Fun and java IS powerful !!!";
        countWordOccurrences(str);
    }

    public static void countWordOccurrences(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] words = cleanedStr.split("\\s+");
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        wordCountMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}

