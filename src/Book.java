public class Book {
    private String title;
    private Author authorName;
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
}
