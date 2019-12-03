package com.boot.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boot.spring.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByTitle(String title);

}
