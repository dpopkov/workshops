package study.aspects.service;

import study.aspects.domain.Book;

public interface BookService {
    Book getByTitle(String title);
}
