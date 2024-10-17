package HomeWork.hw10;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Ivan", "Ivanovich");
        Author author2 = new Author("Petr", "Petrovich");

        Book book1 = new Book("Split", author1, 1995);
        Book book2 = new Book("HarryPotter", author2, 2001);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(" ");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(" ");


        book1.setDatePublication(1985);
        book1.setTitle("Титаник");
        System.out.println(book1.toString());
        System.out.println(" ");

        author2.setName("Mikle");
        author2.setSurname("Gorchakov");
        System.out.println(book2.toString());

        System.out.println("Название кники " + book1.getTitle());
        System.out.println("Имя автора " + book1.getAuthor());
        System.out.println("Дата публикации " + book1.getDatePublication());
        System.out.println("Название кники " + book2.getTitle());
        System.out.println("Имя автора " + book2.getAuthor());
        System.out.println("Дата публикации " + book2.getDatePublication());


    }
}