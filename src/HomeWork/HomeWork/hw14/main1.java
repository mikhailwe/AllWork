package HomeWork.HomeWork.hw14;

import java.util.ArrayList;
import java.util.List;

public class main1 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();
        students.add("James");
        students.add("Bob");
        students.add("Mary");
        students.add("John");
        students.add("Jack");
        System.out.println("Изначальный класс " + students);

        List<String>newStudents = new ArrayList<>();
        students.add("Mikle");
        newStudents.add("Bill");
        newStudents.add("Grindevald");

        students.addAll(newStudents);
        System.out.println("Новые ученики "+ students);


        students.remove("Mary");
        System.out.println("Отчислили Mary " + students);

        students.remove(2);
        System.out.println("Отчислили John " + students);


        System.out.println("Есть ли Мари? - " + students.contains("Mary"));


        System.out.println("Все ли тут из новых учеников? - " + students.containsAll(newStudents));


        System.out.println("Размер группы " + students.size());

        System.out.println("Пустой ли список? " + students.isEmpty());

        students.clear();
        System.out.println("Пустой ли список? " + students.isEmpty());
    }
}
