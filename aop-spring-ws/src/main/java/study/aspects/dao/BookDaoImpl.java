package study.aspects.dao;

import org.springframework.stereotype.Repository;
import study.aspects.domain.Book;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public Book findByTitle(String title) {
        return new Book(title);
    }
}
