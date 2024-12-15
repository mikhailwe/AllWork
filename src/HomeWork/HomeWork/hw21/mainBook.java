package HomeWork.HomeWork.hw21;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mainBook {
    public static void main(String[] args) {
        Library lib = new Library();
        Book book1 = new Book(1, "Тёмные начала", "Philip Pullman", true);
        Book book2 = new Book(2, "1984", "George Orwell ", false);
        Book book3 = new Book(3, "Властелин колец", "John R. R. Tolkin", true);
        Book book4 = new Book(4, "Гордость и предубеждение", "Jane Austen", false);
        Book book5 = new Book(5, "Автостопом по галактике", "Douglas Adams", true);

        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        lib.addBook(book4);
        lib.addBook(book5);

        lib.getBooks().forEach(System.out::println);
        System.out.println();
        lib.getBooks(true).forEach(System.out::println);
        System.out.println();
        lib.getBooks(false).forEach(System.out::println);
        System.out.println();
        System.out.println("Книга по индексу 1 = " + lib.getBookId(1));
        System.out.println();
        System.out.println("Кол- во всех книг: " + lib.getNumberOfBooks());
        System.out.println();
        System.out.println("Кол-во доступных книг: " + lib.getNumberOfBooks(true));
        System.out.println("Кол-во недоступных книг: " + lib.getNumberOfBooks(false));
        System.out.println("Сортировка по авторам");
        lib.getAuthor().forEach(System.out::println);
        System.out.println("Сортировка по книгам");
        lib.getBook(Comparator.comparing(Book::getTitle)).forEach(System.out::println);
        System.out.println("Разделение книг по доступности");
        lib.getBookPartitionedByAvailability().get(true).forEach(System.out::println);
        lib.getBookPartitionedByAvailability().get(false).forEach(System.out::println);
        System.out.println("Книги по авторам ");
        lib.getBookGroupedByAuthor().forEach((author, books) -> {
            System.out.println(author + ":" + books);
        });
    }
}