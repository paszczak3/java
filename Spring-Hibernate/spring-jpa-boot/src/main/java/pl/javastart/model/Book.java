package pl.javastart.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_book")
    private Long id;

    private String isbn;
    private String title;
    private String author;

    @OneToOne
    private BookDetails bookDetails;

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @PrePersist
    public void prePersist() {
        System.out.println("Zapis obiektu " + this);
    }

    @PostPersist
    public void postPersist() {
        System.out.println("Zapisano obiekt " + this);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String isbn, String title, String author) {

        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public BookDetails getBookDetails() {
        return bookDetails;
    }

    public void setBookDetails(BookDetails bookDetails) {
        this.bookDetails = bookDetails;
    }
}
