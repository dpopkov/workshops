package study.aspects.service;

import study.aspects.dao.BookDao;
import study.aspects.domain.Book;

public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book getByTitle(String title) {
        return bookDao.findByTitle(title);
    }
}
