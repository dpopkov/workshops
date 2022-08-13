package study.aspects.service;

import org.springframework.stereotype.Service;
import study.aspects.aop.MarkMe;
import study.aspects.dao.BookDao;
import study.aspects.domain.Book;

@Service
public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @MarkMe
    @Override
    public Book getByTitle(String title) {
        return bookDao.findByTitle(title);
    }
}
