package HomeWork.HomeWork.hw19;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,3,2,1};
        System.out.println(getElement(numbers));
    }
    public static Set<Integer> getElement(int[] number) {
        Set<Integer> numbers = new java.util.HashSet<>();
        for (int j : number) {
            numbers.add(j);
        }
        return numbers;
    }
}
