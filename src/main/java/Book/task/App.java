package Book.task;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {


        Book book1 = new Book("author 1", "title 1", 1995);
        Book book2 = new Book("author 2", "title 2", 1991);
        Book book3 = new Book("author 3", "title 3", 2003);
        Book book4 = new Book("author 4", "title 4", 2020);
        Book book5 = new Book("author 5", "title 5", 2005);
        Book book6 = new Book("author 6", "title 6", 2003);
        Book book7 = new Book("author 7", "title 7", 1990);
        Book book8 = new Book("author 8", "title 8", 2001);

        List<Book> books = List.of(book1,book2,book3,book4,book5,book6,book7,book8);

         List<Book> collected =  books.stream()
                .peek(System.out::println)
                .filter(book -> book.getYearOfRelease() > 2000)
                .collect(Collectors.toList());


        System.out.println("------------------");
        System.out.println(collected);
    }
}
