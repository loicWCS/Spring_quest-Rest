package com.spring_quest.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring_quest.rest.entity.Book;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

      List<Book> findByTitleContainingOrDescriptionContaining(String searchTerm, String searchTerm1);
}
