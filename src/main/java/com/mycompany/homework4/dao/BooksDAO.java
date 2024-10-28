package com.mycompany.homework4.dao;

import com.mycompany.homework4.model.Book;

import java.util.List;

public interface BooksDAO {
    public void addBook(Book book);

    public List<Book> getAllBooks();
}
