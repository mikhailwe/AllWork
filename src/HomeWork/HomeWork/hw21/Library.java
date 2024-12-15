package HomeWork.HomeWork.hw21;

import java.util.stream.Collectors;
import java.util.*;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getId(), book);
    }

    public Book getBookId(int id) {
        return books.get(id);
    }

    public List<Book> getBooks() {
        return books.values()
                .stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    public List<Book> getBooks(boolean isAvailable) {
        return books.values()
                .stream()
                .filter(book -> book.isAvailable() == isAvailable)
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }
    public int getNumberOfBooks() {
        return books.size();
    }
    public int getNumberOfBooks(boolean isAvailable) {
        return (int) books.values()
                .stream()
                .filter(book -> book.isAvailable() == isAvailable)
                .count();
    }

    public List<String>getAuthor() {
        return books.values()
                .stream()
                .map(Book::getAuthor)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
    public List<Book> getBook(Comparator<Book> comparator){
        return books.values()
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
    public Map <Boolean, List<Book>>getBookPartitionedByAvailability() {
        return books.values()
                .stream()
                .collect(Collectors.partitioningBy(Book ::isAvailable));
    }
    public Map<String, List<Book>> getBookGroupedByAuthor() {
        return books.values()
                .stream()
                .collect(Collectors.groupingBy(Book::getAuthor));
    }
}
