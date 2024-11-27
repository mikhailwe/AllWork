package HomeWork.HomeWork.hw17;

import java.util.HashMap;

public class InvertMap {
    public static void main(String[] args) {
        HashMap<Integer, String> originalMap = new HashMap<>();
        originalMap.put(1, "C");
        originalMap.put(2, "B");
        originalMap.put(3, "A");

        HashMap<String, Integer> invertedMap = invertMap(originalMap);
        System.out.println(invertedMap);
    }

    public static HashMap<String, Integer> invertMap(HashMap<Integer, String> originalMap) {
        HashMap<String, Integer> invertedMap = new HashMap<>();
        for (HashMap.Entry<Integer, String> entry : originalMap.entrySet()) {
            invertedMap.put(entry.getValue(), entry.getKey());
        }
        return invertedMap;
    }
}
