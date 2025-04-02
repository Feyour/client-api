package ru.albert.clientapi.model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Book {

    private int id;
    private String title;
    private String author;
    private int quantity;


    public Book(int id, String title, String author, int quantity) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{id=" + id + ", title='" + title + "', author='" + author + "', quantity=" + quantity + "}";
    }

}