package HomeWork.HomeWork.hw17;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "javaisfunandjavaispowerful";
        countCharacterOccurrences(str);
        System.out.println("Есть уникальные буквы? " + hasUniqueLetters(str));
        System.out.println("Среднее количество символов: " + averageCharacters(str));
    }

    public static void countCharacterOccurrences(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        System.out.println(charCountMap);
    }

    public static boolean hasUniqueLetters(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (int count : charCountMap.values()) {
            if (count == 1) {
                return true;
            }
        }
        return false;
    }

    public static double averageCharacters(String str) {
        return str.length() / (double) str.chars().distinct().count();
    }
}
