package ru.albert.clientapi.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.albert.clientapi.feignclient.LibraryClient;
import ru.albert.clientapi.model.Book;
import ru.albert.clientapi.servies.BookService;

import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookFeignController implements LibraryClient {

    private final BookService bookService;
    @GetMapping("/all")
    @Override
    public List<Book> getBooks() {
        return bookService.getBooks();
    }
}
