package {{inputs.application_package}}.samples.security.books;

import org.hibernate.validator.constraints.ISBN;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class NewBookRequest {

    @NotBlank
    private final String title;

    @NotBlank
    @Size(max = 4000)
    private final String description;

    @ISBN
    @NotBlank
    private final String isbn;

    @NotNull
    private final LocalDate publishedAt;

    public NewBookRequest(String title, String description, String isbn, LocalDate publishedAt) {
        this.title = title;
        this.description = description;
        this.isbn = isbn;
        this.publishedAt = publishedAt;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    @Override
    public String toString() {
        return "NewBookRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishedAt=" + publishedAt +
                '}';
    }

    public Book toModel() {
        return new Book(title, description, isbn, publishedAt);
    }

}
