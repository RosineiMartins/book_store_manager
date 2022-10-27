package com.udemyspring1.bookstoremanager.repository;

import com.udemyspring1.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {


}
