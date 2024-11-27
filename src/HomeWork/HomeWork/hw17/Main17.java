package HomeWork.HomeWork.hw17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main17 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Сортировка по имени
        Collections.sort(people, new NameComparator());
        System.out.println("Сортировка по имени:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Сортировка по возрасту
        Collections.sort(people, new AgeComparator());
        System.out.println("Сортировка по возрасту:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
