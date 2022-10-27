package com.udemyspring1.bookstoremanager.controller;


import com.udemyspring1.bookstoremanager.entity.Book;
import com.udemyspring1.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public MessageResponseDto create(@RequestBody Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDto.builder()
                .message("Book created with Id " + savedBook.getId())
                .build();
    }
}
