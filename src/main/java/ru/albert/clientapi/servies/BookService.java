package ru.albert.clientapi.servies;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.albert.clientapi.feignclient.LibraryClient;
import ru.albert.clientapi.model.Book;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final LibraryClient libraryClient;

    public List<Book> getBooks() {
        List<Book> books = libraryClient.getBooks();
        System.out.println("Полученные книги: " + books);
        return books;
    }
}