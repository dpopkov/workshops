package study.aspects.dao;

import study.aspects.domain.Book;

public interface BookDao {
    Book findByTitle(String title);
}
