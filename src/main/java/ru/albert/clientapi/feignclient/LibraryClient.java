package ru.albert.clientapi.feignclient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.albert.clientapi.model.Book;

import java.util.List;

@FeignClient(name = "library-api", url = "http://localhost:8080")
public interface LibraryClient {

    @GetMapping("/book")
    List<Book> getBooks();
}
