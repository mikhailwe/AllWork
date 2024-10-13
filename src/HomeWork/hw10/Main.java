package HomeWork.hw10;

public class Main {
    public static void main(String[] args) {

    Author author1= new Author("Ivan","Ivanovich");
    Author author2= new Author("Petr","Petrovich");

    Book book1= new Book("Split",1995,author1);
    Book book2= new Book("HarryPotter",2001,author2);
        System.out.println(book1.getBookInfo());
        System.out.println(book2.getBookInfo());

        author1.setName("Andrey");
        author1.setSurname("Gubarev");
        book1.setDatePublication(2020);
        book1.setTitle("memoryForAndrю");
        System.out.println(book1.getBookInfo());

        author2.setName("Mikle");
        author2.setSurname("Gorchakov");
        System.out.println(author2.getName());


}
}