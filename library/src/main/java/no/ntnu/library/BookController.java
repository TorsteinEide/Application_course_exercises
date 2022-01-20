package no.ntnu.library;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("book")
    public String getBooks() {
        return "No books";
    }
}
