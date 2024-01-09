package com.example.prog3;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getAllBooks(){
        return books;
    }

    @PostMapping
    public List<Book> postABook(@RequestBody Book book){
        books.add(book);
        return books;
    }
}
