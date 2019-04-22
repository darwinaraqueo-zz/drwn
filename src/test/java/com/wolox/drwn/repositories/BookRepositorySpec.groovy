package com.wolox.drwn.repositories

import com.wolox.drwn.entities.Book
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.dao.DataIntegrityViolationException
import spock.lang.Specification

@SpringBootTest
class BookRepositorySpec  extends Specification {

    @Autowired
    private BookRepository bookRepository

    def "don't create a book"(){
        given:
        def book = new Book()
        when:
        bookRepository.save(book)
        then:
        thrown(DataIntegrityViolationException)
    }
}
