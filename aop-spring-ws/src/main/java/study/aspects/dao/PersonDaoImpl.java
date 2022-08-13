package study.aspects.dao;

import org.springframework.stereotype.Repository;
import study.aspects.domain.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 128);
    }
}
