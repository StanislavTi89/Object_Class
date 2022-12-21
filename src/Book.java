import java.util.Objects;

public class Book {
    //содержит в себе данные об имени, авторе и годе публикации
    private String title;
    private Author author;
    private int published;

    public Book (String title, Author author, int published) {
        this.title = title;
        this.author = author;
        this.published = published;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String toString() {
        return "Название книги: " + title + ", Автор книги: " + author + ", Год публикации: " + published;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return published == book.published && title.equals(book.title) && author.equals(book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author, published);
    }

}
