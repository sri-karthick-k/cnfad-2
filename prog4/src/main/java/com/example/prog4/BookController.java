package com.example.prog4;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final List<Book> books = new ArrayList<>();

    @GetMapping
    public List<Book> getBooks(){
        return books;
    }

    @PostMapping
    public List<Book> postBook(@RequestBody Book book){
        books.add(book);
        return books;
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id){
        return findBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable long id, @RequestBody Book updatedBook){
        Book existingBook = findBookById(id);

        if(existingBook != null){
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setPublicationYear(updatedBook.getPublicationYear());
        }

        return existingBook;
    }


    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable long id){

        Book existingBook = findBookById(id);
        if(existingBook != null){

            books.remove(existingBook);
            return "Success";
        }
        return "Not found";
    }


    // Helper methods
    private Book findBookById(Long id) {
        return books.stream()
                .filter(book -> Objects.equals(book.getId(), id))
                        .findFirst()
                        .orElse(null);
    }
}
