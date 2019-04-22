package com.wolox.drwn.repositories;

import com.wolox.drwn.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
