import java.util.*;
class Book
{
    public String title;
    public String author;
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
}
class Library
{
    private final List<Book> book;
    Library(List<Book> book)
    {
        this.book = book;
    }
    public List<Book> getTotal()
    {
        return book;
    }
}

public class Lab_2{
    public static void main(String[] args) {
        Book book1 = new Book("Java", "Tep");
        Book book2 = new Book("Python", "Snake");
        Book book3 = new Book("Javascipt", "AJ.paul");
        List<Book> book = new ArrayList<Book>();
        book.add(book1);
        book.add(book2);
        book.add(book3);
        Library libraryroom = new Library(book);
        List<Book> bks = libraryroom.getTotal();
        for(Book bk: bks)
        {
            System.out.println("Title: "+bk.title+ " and "+" Authir: "+bk.author);
        }
}
}
