package study.aspects.dao;

import study.aspects.domain.Person;

public class PersonDaoImpl implements PersonDao {
    @Override
    public Person findByName(String name) {
        return new Person(name, 128);
    }
}
