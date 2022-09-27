package {{inputs.application_package}}.samples.security.books;

import org.hibernate.validator.constraints.ISBN;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Book {

    @NotNull
    private final UUID id;

    @NotBlank
    @Size(max = 60)
    private final String title;

    @NotBlank
    @Size(max = 4000)
    private final String description;

    @ISBN
    @NotBlank
    private final String isbn;

    @NotNull
    private final LocalDate publishedAt;


    public Book(@NotBlank @Size(max = 60) String title,
                @NotBlank @Size(max = 4000) String description,
                @NotBlank @ISBN String isbn,
                @NotNull LocalDate publishedAt) {
        this.id = UUID.randomUUID();
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.publishedAt = publishedAt;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }
}
