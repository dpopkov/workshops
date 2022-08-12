package study.aspects.dao;

import study.aspects.domain.Book;

public class BookDaoImpl implements BookDao {
    @Override
    public Book findByTitle(String title) {
        return new Book(title);
    }
}
