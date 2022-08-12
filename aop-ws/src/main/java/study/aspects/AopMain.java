package study.aspects;

import study.aspects.aop.LoggingAspect;
import study.aspects.aop.PrintStreamLoggingAspect;
import study.aspects.aop.SimpleWeaver;
import study.aspects.dao.BookDao;
import study.aspects.dao.BookDaoImpl;
import study.aspects.dao.PersonDao;
import study.aspects.dao.PersonDaoImpl;
import study.aspects.domain.Book;
import study.aspects.domain.Person;

import java.util.HashMap;
import java.util.Map;

public class AopMain {
    public static void main(String[] args) {
        SimpleWeaver weaver = new SimpleWeaver(AopMain.class.getClassLoader());
        LoggingAspect aspect = new PrintStreamLoggingAspect(System.out);

        System.out.println("Using JDK Proxy");

        Map<Class<?>, Object> context = new HashMap<>();
        context.put(PersonDao.class, new PersonDaoImpl());
        context.put(BookDao.class, new BookDaoImpl());

        context.forEach((daoInterface, daoObject) -> context.put(daoInterface, weaver.weave(daoObject, aspect)));

        PersonDao personDao = (PersonDao) context.get(PersonDao.class);
        BookDao bookDao = (BookDao) context.get(BookDao.class);

        Person person = personDao.findByName("Alice");
        System.out.println("person = " + person);
        Book book = bookDao.findByTitle("Spring in Action");
        System.out.println("book = " + book);
    }
}
