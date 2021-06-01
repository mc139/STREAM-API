package Book.task;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

        List<Book> books = IntStream.range(1, 9)
                .mapToObj(n -> new Book("Author " + n, "title " + n, 1980 + (n % 40)))
                .collect(Collectors.toList());
        double asDouble = books.stream()
                .map(App::displayBook)
                .mapToInt(Book::getYearOfRelease)
                .average()
                .getAsDouble();
        System.out.println("average :" + asDouble);

    }

    private static Book displayBook(Book b) {
        System.out.println(b.getTitle());
        return b;
    }
}
