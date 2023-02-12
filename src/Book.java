import java.util.Objects;

public class Book {
    private final String title;
    private final Author authorName;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.authorName = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.authorName;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && title.equals(book.title) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, authorName, publicationYear);
    }

    @Override
    public String toString() {
        return this.title + ". " + this.authorName + ". Год публикации: " + this.publicationYear;
    }
}
