package study.aspects;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.aspects.domain.Book;
import study.aspects.domain.Person;
import study.aspects.service.BookService;
import study.aspects.service.PersonService;

@ComponentScan
@Configuration
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringMain.class);

        PersonService personService = context.getBean(PersonService.class);
        Person person = personService.getByName("Alice");
        System.out.println("person = " + person);

        BookService bookService = context.getBean(BookService.class);
        Book book = bookService.getByTitle("Spring in Action");
        System.out.println("book = " + book);
    }
}
