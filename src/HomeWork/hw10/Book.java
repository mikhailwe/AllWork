package HomeWork.hw10;

public class Book {
private String title;
private Author author;
private Integer datePublication;

    public Book(String title, Integer datePublication,Author author ) {
        this.author = author;
        this.datePublication = datePublication;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Integer datePublication) {
        this.datePublication = datePublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getBookInfo() {
        return "Название книги - " + title + " Год публикации - " + datePublication + " Имя автора - " + author.getNameSurname();
    }
}
