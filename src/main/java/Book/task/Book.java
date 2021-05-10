package Book.task;




//Zrób sobie kolekcję obiektów typu Book (autor, tytuł, rok) i przy pomocy streama:
//        - wyświetl wszystkie książki
//        - odfiltruj tylko te, których rok wydania jest nie starszy niż zadany, np. 2000
//        - ponownie wyświetl książki (odfiltrowane)
//
//        Wszystko powyższe powinno się odbyć w jednym streamie
public class Book {

    private String author;
    private String title;
    private int yearOfRelease;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Book(String author, String title, int yearOfRelease) {
        this.author = author;
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

}
