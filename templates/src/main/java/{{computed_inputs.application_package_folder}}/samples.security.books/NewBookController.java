package {{inputs.application_package}}.samples.security.books;

import br.com.zup.edu.casadocodigo.samples.authors.NewAuthorController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
public class NewBookController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewAuthorController.class);

    @PostMapping("/api/v1/books")
    public ResponseEntity<?> create(@RequestBody @Valid NewBookRequest request, UriComponentsBuilder uriBuilder) {

        Book book = request.toModel();
        LOGGER.info(
            "A new book has been created = {}", book
        );

        // TODO: your business logic goes here

        URI location = uriBuilder.path("/api/v1/books/{id}")
                .buildAndExpand(book.getId())
                .toUri();

        return ResponseEntity
                .created(location)
                .build();
    }

}
