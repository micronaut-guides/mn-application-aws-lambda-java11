package example.micronaut;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

import javax.validation.Valid;
import java.util.UUID;

@Controller // <1>
public class BookController {

    @Post // <2>
    public BookSaved save(@Valid @Body Book book) { // <3>
        BookSaved bookSaved = new BookSaved();
        bookSaved.setName(book.getName());
        bookSaved.setIsbn(UUID.randomUUID().toString());
        return bookSaved;
    }
}
